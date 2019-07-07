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

public class FourthSemester extends AppCompatActivity {

    String[] CGPA_value;
    private Spinner CSE221,CSE222,CSE223,CSE224,CSE225,CSE226,CSE227;
    private TextView resultView;
    private Button button;
    double subCredit=18.0;
    double cse221,cse222,cse223,cse224,cse225,cse226,cse227;
    double totalCredit,result;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_semester);


        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fourth  Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CGPA_value=getResources().getStringArray(R.array.main_subject);
        CSE221= (Spinner) findViewById(R.id.CS221);
        CSE222= (Spinner) findViewById(R.id.CS222);
        CSE223= (Spinner) findViewById(R.id.CS223);
        CSE224= (Spinner) findViewById(R.id.CS224);
        CSE225= (Spinner) findViewById(R.id.CS225);
        CSE226= (Spinner) findViewById(R.id.CS226);
        CSE227= (Spinner) findViewById(R.id.CS227);




        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE221.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE222.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE223.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE224.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE225.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE226.setAdapter(adapter6);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE227.setAdapter(adapter7);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                algorithmDesign();
                algoritmDesignPracticle();
                databaseManagement();
                databaseManagementPracticle();
                computerArchitechture();
                dataCommunication();
                Economics();

                totalCredit=cse221+cse222+cse223+cse224+cse225+cse226+cse227;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);

                alertDialogBuilder=new AlertDialog.Builder(FourthSemester.this);
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



    //-------------------Method for CSE221-----------------------------------

    public void algorithmDesign(){
        String value = CSE221.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse221=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse221=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse221=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse221=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse221=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse221=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse221=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse221=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse221=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse221=setValue*3.0;

        }
    }

    //----------------------Method for CSE222(Practicle)-------------------------------

    public void algoritmDesignPracticle(){
        String value = CSE222.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse222=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse222=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse222=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse222=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse222=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse222=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse222=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse222=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse222=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse222=setValue*1.5;

        }

    }

    //-----------------------Method for CSE223----------------------------------

    public void databaseManagement(){
        String value = CSE223.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse223=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse223=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse223=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse223=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse223=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse223=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse223=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse223=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse223=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse223=setValue*3.0;

        }
    }

    //--------------------Method for CSE224--------------------------

    public void databaseManagementPracticle(){
        String value = CSE224.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse224=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse224=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse224=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse224=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse224=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse224=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse224=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse224=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse224=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse224=setValue*1.5;

        }

    }

    //----------------------------Method for CSE 225 -----------------------------------

    public void computerArchitechture(){
        String value = CSE225.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse225=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse225=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse225=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse225=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse225=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse225=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse225=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse225=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse225=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse225=setValue*3.0;

        }
    }

    //-----------------------Method for CSE 226 ----------------------------

    public void dataCommunication(){
        String value = CSE226.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse226=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse226=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse226=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse226=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse226=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse226=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse226=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse226=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse226=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse226=setValue*3.0;

        }
    }

    //---------------------------Method for CSE227 -------------------------------

    public void Economics(){
        String value = CSE227.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse227=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse227=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse227=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse227=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse227=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse227=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse227=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse227=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse227=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse227=setValue*3.0;

        }
    }

}

