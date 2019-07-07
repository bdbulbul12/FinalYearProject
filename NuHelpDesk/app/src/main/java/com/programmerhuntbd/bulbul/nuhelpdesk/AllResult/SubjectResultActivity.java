package com.programmerhuntbd.bulbul.nuhelpdesk.AllResult;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;

import java.util.ArrayList;
import java.util.List;

public class SubjectResultActivity extends AppCompatActivity {

    ListView listViewStudent_result;
    private ProgressDialog mProgress;

    DatabaseReference databaseAddUv;

    private List<StudentResultListItem> listItemsStudentRes;

    String reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_result);

        reg = getIntent().getStringExtra("registration");

//        final SubjectResultAdapter adapter = new SubjectResultAdapter(SubjectResultActivity.this,listItemsStudentRes);
//        listViewStudent_result.setAdapter(adapter);
//        mProgress.hide();

        databaseAddUv = FirebaseDatabase.getInstance().getReference("2013-2014").child("firstsemester");
        //databaseAddUv.addListenerForSingleValueEvent(valueEventListener);

        Query result = FirebaseDatabase.getInstance().getReference("2013-2014").child("firstsemester")
                .orderByChild("reg")
                .equalTo(reg);
        result.addListenerForSingleValueEvent(valueEventListener);



        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("First Semester Result");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listViewStudent_result= (ListView) findViewById(R.id.resultListView);
        listItemsStudentRes=new ArrayList<>();

        mProgress=new ProgressDialog(this);



    }

    ValueEventListener valueEventListener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            listItemsStudentRes.clear();

                for (DataSnapshot studentSnapshot: dataSnapshot.getChildren()){
                    StudentResultListItem uvListItem = studentSnapshot.getValue(StudentResultListItem.class);
                    listItemsStudentRes.add(uvListItem);
                }

                final SubjectResultAdapter adapter = new SubjectResultAdapter(SubjectResultActivity.this,listItemsStudentRes);
                listViewStudent_result.setAdapter(adapter);
                mProgress.hide();

        }

        @Override
        public void onCancelled(DatabaseError databaseError) {

        }
    };
//    @Override
//    protected void onStart() {
//        super.onStart();
//        mProgress.show();
//        databaseAddUv.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//                listItemsStudentRes.clear();
//
//                for (DataSnapshot studentSnapshot: dataSnapshot.getChildren()){
//                    StudentResultListItem uvListItem = studentSnapshot.getValue(StudentResultListItem.class);
//                    listItemsStudentRes.add(uvListItem);
//                }
//
//                final SubjectResultAdapter adapter = new SubjectResultAdapter(SubjectResultActivity.this,listItemsStudentRes);
//                listViewStudent_result.setAdapter(adapter);
//                mProgress.hide();
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//
//
//    }
}

