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

public class SevenSemester extends AppCompatActivity {

    String[] CGPA_value;
    private Spinner CSE411,CSE412,CSE413,CSE414,CSE415,CSE416,CSE417;
    private TextView resultView;
    private Button button;
    double subCredit=18.0;
    double cse411,cse412,cse413,cse414,cse415,cse416,cse417;
    double totalCredit,result;
    private AlertDialog.Builder alertDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_semester);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Seventh  Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CGPA_value=getResources().getStringArray(R.array.main_subject);
        CSE411= (Spinner) findViewById(R.id.CS411);
        CSE412= (Spinner) findViewById(R.id.CS412);
        CSE413= (Spinner) findViewById(R.id.CS413);
        CSE414= (Spinner) findViewById(R.id.CS414);
        CSE415= (Spinner) findViewById(R.id.CS415);
        CSE416= (Spinner) findViewById(R.id.CS416);
        CSE417= (Spinner) findViewById(R.id.CS417);

        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE411.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE412.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE413.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE414.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE415.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE416.setAdapter(adapter6);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE417.setAdapter(adapter7);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computerNetworking();
                computerNewtworkingPracticle();
                artificialIntelligence();
                parallelDistributedSystem();
                periferalInterfacing();
                periferalInterfacingPracticle();
                digitalSignalProcessing();

                totalCredit=cse411+cse412+cse413+cse414+cse415+cse416+cse417;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);
                alertDialogBuilder=new AlertDialog.Builder(SevenSemester.this);
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


    //------------------Method For CSE 411 ------------------------------------------

    public void computerNetworking(){
        String value = CSE411.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse411=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse411=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse411=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse411=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse411=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse411=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse411=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse411=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse411=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse411=setValue*3.0;

        }
    }

    //------------------------------Method for CSE 412(Practicle) ----------------------------------

    public void computerNewtworkingPracticle(){
        String value = CSE412.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse412=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse412=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse412=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse412=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse412=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse412=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse412=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse412=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse412=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse412=setValue*1.5;

        }

    }

    //-------------------------Method for CSE 413 ---------------------------------------

    public void artificialIntelligence(){
        String value = CSE413.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse413=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse413=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse413=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse413=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse413=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse413=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse413=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse413=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse413=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse413=setValue*3.0;

        }
    }

    //-----------------------------------Method for CSE 414 ------------------------------

    public void parallelDistributedSystem(){
        String value = CSE414.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse414=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse414=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse414=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse414=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse414=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse414=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse414=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse414=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse414=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse414=setValue*3.0;

        }
    }

    //-----------------------Method for CSE 415 ------------------------

    public void periferalInterfacing(){
        String value = CSE415.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse415=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse415=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse415=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse415=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse415=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse415=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse415=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse415=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse415=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse415=setValue*3.0;

        }
    }

    //----------------------Method for CSE 416 --------------------------

    public void periferalInterfacingPracticle(){
        String value = CSE416.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse416=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse416=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse416=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse416=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse416=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse416=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse416=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse416=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse416=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse416=setValue*1.5;

        }

    }

    //----------------------Method for CSE 417 ---------------------

    public void digitalSignalProcessing(){
        String value = CSE417.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse417=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse417=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse417=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse417=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse417=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse417=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse417=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse417=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse417=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse417=setValue*3.0;

        }
    }



}

