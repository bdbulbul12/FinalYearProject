package com.programmerhuntbd.bulbul.nuhelpdesk.CalculateCgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.programmerhuntbd.bulbul.nuhelpdesk.R;

public class MainCalculator extends AppCompatActivity {

    private Button cseFirstSemster,cseSecondSemester,cseThirdSemester,cseFourthSemester,cseFifthSemester,cseSixSemester,cseSevensemester,cseEightSemester;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);


        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        cseFirstSemster = (Button) findViewById(R.id.cseFirst);
        cseSecondSemester=(Button) findViewById(R.id.cseSecond);
        cseThirdSemester=(Button) findViewById(R.id.cseThird);
        cseFourthSemester= (Button) findViewById(R.id.cseFourth);
        cseFifthSemester= (Button) findViewById(R.id.cseFifth);
        cseSixSemester= (Button) findViewById(R.id.cseSix);
        cseSevensemester= (Button) findViewById(R.id.cseSeven);
        cseEightSemester= (Button) findViewById(R.id.cseEight);

        cseFirstSemster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstSemester = new Intent(MainCalculator.this,FirstSemester.class);
                startActivity(firstSemester);
            }
        });

        cseSecondSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondSemester = new Intent(MainCalculator.this,FirstSemester.class);
                startActivity(secondSemester);
            }
        });

        cseThirdSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdSemester = new Intent(MainCalculator.this,FirstSemester.class);
                startActivity(thirdSemester);
            }
        });

        cseFourthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourthSemester = new Intent(MainCalculator.this,FourthSemester.class);
                startActivity(fourthSemester);
            }
        });
        cseFifthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fifthSemester = new Intent(MainCalculator.this,FifthSemester.class);
                startActivity(fifthSemester);
            }
        });

        cseSixSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sixthSemester = new Intent(MainCalculator.this,SixSemester.class);
                startActivity(sixthSemester);
            }
        });
        cseSevensemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sevenSemester = new Intent(MainCalculator.this,SevenSemester.class);
                startActivity(sevenSemester);
            }
        });
        cseEightSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sevenSemester = new Intent(MainCalculator.this,EightSemester.class);
                startActivity(sevenSemester);
            }
        });

    }
}
