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

public class SixSemester extends AppCompatActivity {


    String[] CGPA_value;
    private Spinner CSE321,CSE322,CSE323,CSE324,CSE325,CSE326,CSE327,CSE328;
    private TextView resultView;
    private Button button;
    double subCredit=19.5;
    double cse321,cse322,cse323,cse324,cse325,cse326,cse327,cse328;
    double totalCredit,result;
    private AlertDialog.Builder alertDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_semester);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sixth Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CGPA_value=getResources().getStringArray(R.array.main_subject);
        CSE321= (Spinner) findViewById(R.id.CS321);
        CSE322= (Spinner) findViewById(R.id.CS322);
        CSE323= (Spinner) findViewById(R.id.CS323);
        CSE324= (Spinner) findViewById(R.id.CS324);
        CSE325= (Spinner) findViewById(R.id.CS325);
        CSE326= (Spinner) findViewById(R.id.CS326);
        CSE327= (Spinner) findViewById(R.id.CS327);
        CSE328= (Spinner) findViewById(R.id.CS328);


        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE321.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE322.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE323.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE324.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE325.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE326.setAdapter(adapter6);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE327.setAdapter(adapter7);
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE328.setAdapter(adapter8);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                softwareEngineering();
                softwareEngineeringPractical();
                numericalAnalysis();
                computerGraphics();
                computerGraphicsPractical();
                compilerDesign();
                compilerDesignPractical();
                systemAnalysis();


                totalCredit=cse321+cse322+cse323+cse324+cse325+cse326+cse327+cse328;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);
                alertDialogBuilder=new AlertDialog.Builder(SixSemester.this);
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

    //Intersetial add


    //-------------------------Method for CSE321 ------------------------------------------

    public void softwareEngineering(){
        String value = CSE321.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse321=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse321=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse321=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse321=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse321=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse321=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse321=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse321=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse321=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse321=setValue*3.0;

        }
    }

    //-----------------------Method for CSE322 -------------------------------------------

    public void softwareEngineeringPractical(){
        String value = CSE322.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse322=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse322=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse322=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse322=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse322=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse322=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse322=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse322=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse322=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse322=setValue*1.5;

        }

    }

    //--------------------------------Method for CSE 323 -------------------------------------------

    public void numericalAnalysis(){
        String value = CSE323.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse323=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse323=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse323=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse323=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse323=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse323=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse323=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse323=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse323=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse323=setValue*3.0;

        }
    }

    //---------------------------Method for CSE 324 ----------------------------------------

    public void computerGraphics(){
        String value = CSE324.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse324=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse324=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse324=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse324=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse324=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse324=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse324=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse324=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse324=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse324=setValue*3.0;

        }
    }

    //------------------------Method for CSE 325---------------------------------------

    public void computerGraphicsPractical(){
        String value = CSE325.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse325=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse325=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse325=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse325=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse325=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse325=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse325=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse325=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse325=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse325=setValue*1.5;

        }

    }

    //------------------------------Method for CSE 326 -----------------------------

    public void compilerDesign(){
        String value = CSE326.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse326=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse326=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse326=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse326=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse326=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse326=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse326=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse326=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse326=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse326=setValue*3.0;

        }
    }

    //--------------------------Method for CSE 327 -------------------------------

    public void compilerDesignPractical(){
        String value = CSE327.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse327=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse327=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse327=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse327=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse327=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse327=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse327=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse327=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse327=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse327=setValue*1.5;

        }

    }

    //----------------------Method for CSE 328 ----------------------------------

    public void systemAnalysis(){
        String value = CSE328.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse328=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse328=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse328=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse328=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse328=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse328=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse328=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse328=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse328=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse328=setValue*3.0;

        }
    }

}
