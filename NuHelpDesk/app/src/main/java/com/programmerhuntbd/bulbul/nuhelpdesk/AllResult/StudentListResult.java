package com.programmerhuntbd.bulbul.nuhelpdesk.AllResult;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.programmerhuntbd.bulbul.nuhelpdesk.AllResult.SelectResultSemester.SelectMyResultSemester;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;

import java.util.ArrayList;
import java.util.List;

public class StudentListResult extends AppCompatActivity {

    ListView listViewStudent_result;
    private ProgressDialog mProgress;

    DatabaseReference databaseAddUv;

    private List<StudentResultListItem> listItemsStudentRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list_result);

        databaseAddUv = FirebaseDatabase.getInstance().getReference("2013-2014").child("firstsemester");
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Student List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listViewStudent_result= (ListView) findViewById(R.id.studentListView);
        listItemsStudentRes=new ArrayList<>();

        mProgress=new ProgressDialog(this);

        //-------------


        //--------


        listViewStudent_result.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                StudentResultListItem uvListItem = listItemsStudentRes.get(i);
                Intent intent = new Intent(getApplicationContext(), SelectMyResultSemester.class);
                intent.putExtra("reg",uvListItem.getReg());
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

                listItemsStudentRes.clear();

                for (DataSnapshot studentSnapshot: dataSnapshot.getChildren()){
                    StudentResultListItem uvListItem = studentSnapshot.getValue(StudentResultListItem.class);
                    listItemsStudentRes.add(uvListItem);
                }

                final StudentResutListAdapter adapter = new StudentResutListAdapter(StudentListResult.this,listItemsStudentRes);
                listViewStudent_result.setAdapter(adapter);
                mProgress.hide();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}
