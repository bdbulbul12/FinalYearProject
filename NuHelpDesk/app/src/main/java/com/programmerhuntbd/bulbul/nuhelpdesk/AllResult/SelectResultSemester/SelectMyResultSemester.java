package com.programmerhuntbd.bulbul.nuhelpdesk.AllResult.SelectResultSemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.programmerhuntbd.bulbul.nuhelpdesk.AllResult.StudentListResult;
import com.programmerhuntbd.bulbul.nuhelpdesk.AllResult.SubjectResultActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;

public class SelectMyResultSemester extends AppCompatActivity {

    String registration;

    LinearLayout firstSemesterResult,secondSemesterResult,thirdSemesterResult,fourthSemesterResult,
    fifthSemesterResult,sixthSemesterResult,seventhSemesterResult,eightSemesterResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_my_result_semester);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        registration = getIntent().getStringExtra("reg");

        firstSemesterResult = (LinearLayout) findViewById(R.id.firstSemesterResult);

        firstSemesterResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectMyResultSemester.this, SubjectResultActivity.class);
                intent.putExtra("registration",registration);
                startActivity(intent);
            }
        });

    }


}
