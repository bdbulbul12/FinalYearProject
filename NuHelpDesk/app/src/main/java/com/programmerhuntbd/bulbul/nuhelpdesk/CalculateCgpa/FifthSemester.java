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

public class FifthSemester extends AppCompatActivity {


    String[] CGPA_value;
    private Spinner CSE311,CSE312,CSE313,CSE314,CSE315,CSE316;
    private TextView resultView;
    private Button button;
    double subCredit=16.5;
    double cse311,cse312,cse313,cse314,cse315,cse316;
    double totalCredit,result;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_semester);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fifth Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CGPA_value=getResources().getStringArray(R.array.main_subject);
        CSE311= (Spinner) findViewById(R.id.CS311);
        CSE312= (Spinner) findViewById(R.id.CS312);
        CSE313= (Spinner) findViewById(R.id.CS313);
        CSE314= (Spinner) findViewById(R.id.CS314);
        CSE315= (Spinner) findViewById(R.id.CS315);
        CSE316= (Spinner) findViewById(R.id.CS316);


        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE311.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE312.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE313.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE314.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE315.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE316.setAdapter(adapter6);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theoryOfComputation();
                microprocessorAndAssemblyLanguage();
                microprocessorPractical();
                engineeringMathmatics();
                Sociology();
                technicalWriting();

                totalCredit=cse311+cse312+cse313+cse314+cse315+cse316;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);
                alertDialogBuilder=new AlertDialog.Builder(FifthSemester.this);
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



    //-----------------------Method for CSE311 ------------------------------------

    public void theoryOfComputation(){
        String value = CSE311.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse311=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse311=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse311=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse311=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse311=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse311=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse311=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse311=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse311=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse311=setValue*3.0;

        }
    }

    //------------------------Method for CSE312 ----------------------------

    public void microprocessorAndAssemblyLanguage(){
        String value = CSE312.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse312=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse312=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse312=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse312=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse312=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse312=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse312=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse312=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse312=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse312=setValue*3.0;

        }
    }

    //--------------------------------Method for CSE 313 (Practical)----------------------------

    public void microprocessorPractical(){
        String value = CSE313.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse313=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse313=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse313=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse313=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse313=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse313=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse313=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse313=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse313=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse313=setValue*1.5;

        }

    }

    //-----------------------Method for CSE 314 --------------------------

    public void engineeringMathmatics(){
        String value = CSE314.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse314=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse314=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse314=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse314=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse314=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse314=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse314=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse314=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse314=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse314=setValue*3.0;

        }
    }

    //------------------------Method for CSE 315 -----------------------------

    public void Sociology(){
        String value = CSE315.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse315=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse315=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse315=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse315=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse315=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse315=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse315=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse315=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse315=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse315=setValue*3.0;

        }
    }

    //--------------------------------Method for CSE316 ---------------------------------

    public void technicalWriting(){
        String value = CSE316.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse316=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse316=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse316=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse316=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse316=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse316=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse316=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse316=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse316=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse316=setValue*3.0;

        }
    }

}