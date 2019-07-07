package com.programmerhuntbd.bulbul.nuhelpdesk.CalculateCgpa;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.programmerhuntbd.bulbul.nuhelpdesk.R;

public class EightSemester extends AppCompatActivity {

    String[] CGPA_value;
    private Spinner CSE421,CSE422,CSE423,CSE42E,CSE499;
    private TextView resultView;
    private Button button;
    double subCredit=16.5;
    double cse421,cse422,cse423,cse42E,cse499;
    double totalCredit,result;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_semester);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Eight  Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CGPA_value=getResources().getStringArray(R.array.main_subject);
        CSE421= (Spinner) findViewById(R.id.CS421);
        CSE422= (Spinner) findViewById(R.id.CS422);
        CSE423= (Spinner) findViewById(R.id.CS423);
        CSE42E= (Spinner) findViewById(R.id.CS42E);
        CSE499= (Spinner) findViewById(R.id.CS499);


        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE421.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE422.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE423.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE42E.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE499.setAdapter(adapter5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webEngineering();
                webEngineeringPractical();
                computerNetworkAndSecurity();
                electiveSubject();
                finalProject();

                totalCredit=cse421+cse422+cse423+cse42E+cse499;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);
                alertDialogBuilder=new AlertDialog.Builder(EightSemester.this);
                alertDialogBuilder.setMessage(String.format( "Your Total CGPA is : %.2f", result ));

                alertDialogBuilder.setNegativeButton("Ok!", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog=alertDialogBuilder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.show();
            }
        });



    }



    //------------------Method for CSE421-------------------------------------

    public void webEngineering(){
        String value = CSE421.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse421=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse421=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse421=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse421=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse421=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse421=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse421=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse421=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse421=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse421=setValue*3.0;

        }
    }

    //-------------------------------Method for CSE 422 -------------------------------

    public void webEngineeringPractical(){
        String value = CSE422.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse422=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse422=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse422=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse422=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse422=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse422=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse422=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse422=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse422=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse422=setValue*1.5;

        }

    }
    //-------------------Method for CSE423 ---------------------------------------

    public void computerNetworkAndSecurity(){
        String value = CSE423.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse423=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse423=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse423=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse423=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse423=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse423=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse423=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse423=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse423=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse423=setValue*3.0;

        }
    }

    //-------------------------Method for CSE 42E -------------------------------------

    public void electiveSubject(){
        String value = CSE42E.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse42E=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse42E=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse42E=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse42E=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse42E=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse42E=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse42E=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse42E=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse42E=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse42E=setValue*3.0;

        }
    }

    //--------------------Method for CSE499 -----------------------------

    public void finalProject(){
        String value = CSE499.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse499=setValue*6.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse499=setValue*6.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse499=setValue*6.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse499=setValue*6.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse499=setValue*6.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse499=setValue*6.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse499=setValue*6.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse499=setValue*6.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse499=setValue*6.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse499=setValue*6.0;

        }
    }



}
