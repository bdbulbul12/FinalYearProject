package com.programmerhuntbd.bulbul.nuhelpdesk.University;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;
import com.programmerhuntbd.bulbul.nuhelpdesk.WebView.Webview;

import java.util.ArrayList;
import java.util.List;

public class UniversityList extends AppCompatActivity {

    // public static final String UV_ID="id";
    public static final String WEB_URL="url";



    ListView listViewUv;
    private ProgressDialog mProgress;

    DatabaseReference databaseAddUv;

    private List<UvListItem> listItems;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_list);

        databaseAddUv = FirebaseDatabase.getInstance().getReference("university");
        databaseAddUv.keepSynced(true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("University List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listViewUv= (ListView) findViewById(R.id.uvListView);
        listItems=new ArrayList<>();




        mProgress=new ProgressDialog(this);
        listViewUv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                UvListItem uvListItem = listItems.get(i);
                Intent intent = new Intent(getApplicationContext(), Webview.class);
                intent.putExtra(WEB_URL,uvListItem.getUrl());
                startActivity(intent);
            }
        });



    }


    @Override
    protected void onStart() {
        super.onStart();
        mProgress.show();
        databaseAddUv.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                listItems.clear();

                for (DataSnapshot studentSnapshot: dataSnapshot.getChildren()){
                    UvListItem uvListItem = studentSnapshot.getValue(UvListItem.class);
                    listItems.add(uvListItem);
                }

                final UvAdapter adapter = new UvAdapter(UniversityList.this,listItems);
                listViewUv.setAdapter(adapter);
                mProgress.hide();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




    }
}