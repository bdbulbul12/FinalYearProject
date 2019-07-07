package com.programmerhuntbd.bulbul.nuhelpdesk.StudyCurriculam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.programmerhuntbd.bulbul.nuhelpdesk.R;
import com.programmerhuntbd.bulbul.nuhelpdesk.StudyCurriculam.Semester.FirstSemesterSylabus;
import com.programmerhuntbd.bulbul.nuhelpdesk.StudyCurriculam.Semester.FourthYear;
import com.programmerhuntbd.bulbul.nuhelpdesk.StudyCurriculam.Semester.SecondYearSylabus;
import com.programmerhuntbd.bulbul.nuhelpdesk.StudyCurriculam.Semester.ThirdYearSylabus;

public class StudyMain extends AppCompatActivity {

    LinearLayout firstSemester,secondYear,thirdYear,fourthYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sylabus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firstSemester= (LinearLayout) findViewById(R.id.firstSemester);
        secondYear= (LinearLayout) findViewById(R.id.secondYear);
        thirdYear= (LinearLayout) findViewById(R.id.thirdYear);
        fourthYear= (LinearLayout) findViewById(R.id.fourthYear);


        firstSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fSem = new Intent(StudyMain.this, FirstSemesterSylabus.class);
                startActivity(fSem);
            }
        });

        secondYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondYear = new Intent(StudyMain.this, SecondYearSylabus.class);
                startActivity(secondYear);
            }
        });

        thirdYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdYear = new Intent(StudyMain.this, ThirdYearSylabus.class);
                startActivity(thirdYear);
            }
        });

        fourthYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourthYear = new Intent(StudyMain.this, FourthYear.class);
                startActivity(fourthYear);
            }
        });
    }
}
