package com.programmerhuntbd.bulbul.nuhelpdesk;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.net.ConnectivityManager;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.programmerhuntbd.bulbul.nuhelpdesk.AboutMe.AboutMeActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.AllResult.StudentListResult;
import com.programmerhuntbd.bulbul.nuhelpdesk.CalculateCgpa.MainCalculator;
import com.programmerhuntbd.bulbul.nuhelpdesk.ExStudent.ExStudentList;
import com.programmerhuntbd.bulbul.nuhelpdesk.GroupChat.ChatMainActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.ProgrammingLanguages.ProgrammingMainActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.StudyCurriculam.StudyMain;
import com.programmerhuntbd.bulbul.nuhelpdesk.Suggestions.SuggestionsMainActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.University.UniversityList;
import com.programmerhuntbd.bulbul.nuhelpdesk.WebView.Webview;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    public static final String WEB_URL_Notice="url";

    private FirebaseAuth mAuth;

    ListView listViewNotice;
    private ProgressDialog mProgress;

    DatabaseReference databaseAddUv;

    private List<MainActivityList> listItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mAuth = FirebaseAuth.getInstance();

        mProgress=new ProgressDialog(this);



        databaseAddUv = FirebaseDatabase.getInstance().getReference("notice");

        listViewNotice= (ListView) findViewById(R.id.nuNoticeList);
        listItems=new ArrayList<>();
       // mProgress=new ProgressDialog(this);

        listViewNotice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                MainActivityList noticeList = listItems.get(i);
                Intent intent = new Intent(getApplicationContext(), Webview.class);
                intent.putExtra(WEB_URL_Notice,noticeList.getUrl());
                //Toast.makeText(MainActivity.this, ""+noticeList.getUrl(), Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Mail to admin", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();

        final FirebaseUser currentUser= FirebaseAuth.getInstance().getCurrentUser();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View header = navigationView.getHeaderView(0) ;
        TextView userEmail = (TextView) header.findViewById(R.id.userEmail);
       // TextView userName = (TextView) header.findViewById(R.id.userName);
        final TextView verified = (TextView) header.findViewById(R.id.verify);
        String email = "";
        String name="";

        if(currentUser!=null){
            email = currentUser.getEmail();
            name = currentUser.getDisplayName();

            if(currentUser.isEmailVerified()){
                verified.setText("Verified");
                verified.setTextColor(Color.WHITE);
            }else {
                verified.setText("Not Verified");
                verified.setTextColor(Color.YELLOW);
                verified.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        currentUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(MainActivity.this,"Verification link sent to mail",Toast.LENGTH_LONG).show();
                                verified.setTextColor(Color.RED);

                            }
                        });
                    }
                });

            }
        }else{
            email = "User not logged in";
        }
        userEmail.setText(email);
        //userName.setText(name);




        if(currentUser==null){
            sendToLogin();
        }

        //Net Checking.............
        ConnectivityManager cn=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo nf=cn.getActiveNetworkInfo();



        if(nf != null && nf.isConnected()==true )
        {
           // Toast.makeText(this, "Network Available", Toast.LENGTH_LONG).show();
            mProgress.show();



        }
        else if(nf == null || nf.isConnected()!=true)
        {
            Toast.makeText(this, "Network Not Available", Toast.LENGTH_LONG).show();

            mProgress.hide();


        }

        // Firebase Notice Retive


        databaseAddUv.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                listItems.clear();

                for (DataSnapshot studentSnapshot: dataSnapshot.getChildren()){
                    MainActivityList noticeList = studentSnapshot.getValue(MainActivityList.class);
                    listItems.add(noticeList);
                }
                MainActivityAdapter adapter = new MainActivityAdapter(MainActivity.this,listItems);
                listViewNotice.setAdapter(adapter);
                mProgress.hide();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void sendToLogin() {
        Intent loginIntent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(loginIntent);
        finish();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id==R.id.action_about_me){
            Intent about_me = new Intent(MainActivity.this, AboutMeActivity.class);
            startActivity(about_me);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_university) {
            // Handle the camera action
            Intent university  = new Intent(MainActivity.this, UniversityList.class);
            startActivity(university);
        } else if (id == R.id.nav_sylabus) {
            Intent sylabus  = new Intent(MainActivity.this, StudyMain.class);
            startActivity(sylabus);
        } else if (id == R.id.nav_all_result) {

            Intent result  = new Intent(MainActivity.this, StudentListResult.class);
            startActivity(result);

        } else if (id == R.id.nav_notice) {
            Intent notice  = new Intent(MainActivity.this, MainActivity.class);
            startActivity(notice);

        }else if(id==R.id.nav_find_cgpa){
            Intent cgpa  = new Intent(MainActivity.this, MainCalculator.class);
            startActivity(cgpa);

        }else if(id==R.id.nav_exStudent){
            Intent exStudent  = new Intent(MainActivity.this, ExStudentList.class);
            startActivity(exStudent);
        }else if(id==R.id.nav_programming_languages){
            Intent programming  = new Intent(MainActivity.this, ProgrammingMainActivity.class);
            startActivity(programming);

        }

        else if(id==R.id.nav_suggestions){
            Intent suggestions  = new Intent(MainActivity.this, SuggestionsMainActivity.class);
            startActivity(suggestions);
        }

        else if(id==R.id.nav_chat){
            Intent chat  = new Intent(MainActivity.this, ChatMainActivity.class);
            startActivity(chat);
        }
        else if (id == R.id.nav_share) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "Nu CSE Help Desk";
            String body="This app is very helpful for Nu CSE Student \n com.programmerhuntbd.bulbul.nuhelpdesk";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"share with"));


        } else if(id==R.id.nav_logout){
            logOut();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void logOut() {
        mAuth.signOut();
        sendToLogin();
    }
}
