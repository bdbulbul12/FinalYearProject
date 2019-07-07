package com.programmerhuntbd.bulbul.nuhelpdesk.ProgrammingLanguages.CProgramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;

public class CMainActivity extends AppCompatActivity {

    private TextView cScoreView;
    private TextView cQuestion;
    Button cBtnChoice1,cBtnChoice2,cBtnChoice3,cBtnChoice4;


    private int cScore=0;
    private int cQuestionNumber=0;
    private String cAnswer;
    private Firebase cQuestionRef,cChoiceRef1,cChoiceRef2,cChoiceRef3,cChoiceRef4,cAnswerRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmain);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Programming Quize");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        cScoreView= (TextView) findViewById(R.id.cScore);
        cQuestion= (TextView) findViewById(R.id.cQuestion);

        cBtnChoice1= (Button) findViewById(R.id.choice_1);
        cBtnChoice2= (Button) findViewById(R.id.choice_2);
        cBtnChoice3= (Button) findViewById(R.id.choice_3);
        cBtnChoice4= (Button) findViewById(R.id.choice_4);

        upDateQuestion();

        //Button1
        cBtnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBtnChoice1.getText().equals(cAnswer)){
                    cScore= cScore + 1;
                    updateScore(cScore);
                    upDateQuestion();

                }else {
                    upDateQuestion();
                }

            }
        });
        //Button1

        //Button2
        cBtnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cBtnChoice2.getText().equals(cAnswer)){

                    cScore=cScore+1;
                    updateScore(cScore);
                    upDateQuestion();
                }else {
                    upDateQuestion();
                }

            }
        });
        //Button2

        //Button3
        cBtnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cBtnChoice3.getText().equals(cAnswer)){

                    cScore=cScore+1;
                    updateScore(cScore);
                    upDateQuestion();
                }else {
                    upDateQuestion();
                }

            }
        });
        //Button3

        //Button4
        cBtnChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cBtnChoice4.getText().equals(cAnswer)){

                    cScore=cScore+1;
                    updateScore(cScore);
                    upDateQuestion();
                }else {
                    upDateQuestion();
                }

            }
        });
        //Button4


    }

    private void updateScore(int score){

        cScoreView.setText(""+cScore);
    }

    public void upDateQuestion(){
        cQuestionRef=new Firebase("https://nuhelpdesk-2c486.firebaseio.com/cprogramming/"+cQuestionNumber+"/questions");

        cQuestionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String question = dataSnapshot.getValue(String.class);
                cQuestion.setText(question);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        //--------Options--------------

        cChoiceRef1=new Firebase("https://nuhelpdesk-2c486.firebaseio.com/cprogramming/"+cQuestionNumber+"/choice1");

        cChoiceRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice1 = dataSnapshot.getValue(String.class);
                cBtnChoice1.setText(choice1);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        cChoiceRef2=new Firebase("https://nuhelpdesk-2c486.firebaseio.com/cprogramming/"+cQuestionNumber+"/choice2");

        cChoiceRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice2 = dataSnapshot.getValue(String.class);
                cBtnChoice2.setText(choice2);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        cChoiceRef3=new Firebase("https://nuhelpdesk-2c486.firebaseio.com/cprogramming/"+cQuestionNumber+"/choice3");

        cChoiceRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice3 = dataSnapshot.getValue(String.class);
                cBtnChoice3.setText(choice3);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        cChoiceRef4=new Firebase("https://nuhelpdesk-2c486.firebaseio.com/cprogramming/"+cQuestionNumber+"/choice4");

        cChoiceRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice4 = dataSnapshot.getValue(String.class);
                cBtnChoice4.setText(choice4);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        cAnswerRef=new Firebase("https://nuhelpdesk-2c486.firebaseio.com/cprogramming/"+cQuestionNumber+"/answer");

        cAnswerRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                 cAnswer = dataSnapshot.getValue(String.class);


            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        cQuestionNumber++;

    }
}
