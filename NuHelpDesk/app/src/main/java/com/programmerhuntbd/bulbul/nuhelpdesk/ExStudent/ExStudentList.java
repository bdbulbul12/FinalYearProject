package com.programmerhuntbd.bulbul.nuhelpdesk.ExStudent;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;

import java.util.ArrayList;
import java.util.List;

public class ExStudentList extends AppCompatActivity {

    ListView listViewEx;
    private ProgressDialog mProgress;

    DatabaseReference databaseAddEx;

    private List<ExListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_student_list);

        databaseAddEx = FirebaseDatabase.getInstance().getReference("ExStudent");

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ex Student List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listViewEx= (ListView) findViewById(R.id.exListView);
        listItems=new ArrayList<>();

        mProgress=new ProgressDialog(this);
        listViewEx.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                ExListItem uvListItem = listItems.get(i);

            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        mProgress.show();
        databaseAddEx.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                listItems.clear();

                for (DataSnapshot studentSnapshot: dataSnapshot.getChildren()){
                    ExListItem exListItem = studentSnapshot.getValue(ExListItem.class);
                    listItems.add(exListItem);
                }
                ExAdapter adapter = new ExAdapter(ExStudentList.this,listItems);
                listViewEx.setAdapter(adapter);
                mProgress.hide();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
