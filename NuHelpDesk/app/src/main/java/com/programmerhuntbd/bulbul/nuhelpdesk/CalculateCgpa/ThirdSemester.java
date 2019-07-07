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

public class ThirdSemester extends AppCompatActivity {

    String[] CGPA_value;
    private Spinner CSE211,CSE212,CSE213,CSE214,CSE215,CSE216,CSE217,CSE218,CSE219;
    private TextView resultView;
    private Button button;
    double subCredit=22.5;
    double cse211,cse212,cse213,cse214,cse215,cse216,cse217,cse218,cse219;
    double totalCredit,result;

    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_semester);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Third  Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CGPA_value=getResources().getStringArray(R.array.main_subject);

        CSE211= (Spinner) findViewById(R.id.CS211);
        CSE212= (Spinner) findViewById(R.id.CS212);
        CSE213= (Spinner) findViewById(R.id.CS213);
        CSE214= (Spinner) findViewById(R.id.CS214);
        CSE215= (Spinner) findViewById(R.id.CS215);
        CSE216= (Spinner) findViewById(R.id.CS216);
        CSE217= (Spinner) findViewById(R.id.CS217);
        CSE218= (Spinner) findViewById(R.id.CS218);
        CSE219= (Spinner) findViewById(R.id.CS219);

        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE211.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE212.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE213.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE214.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE215.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE216.setAdapter(adapter6);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE217.setAdapter(adapter7);
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE218.setAdapter(adapter8);
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE219.setAdapter(adapter9);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectOrientedProgramming();
                objectOrientedProgrammingPractical();
                operatingSystem();
                digitalLogicDesign();
                digitalLogicDesignPractical();
                mathmaticsForCSE();
                electronicDeveices();
                electronicDEvicsPractical();
                basicAccounting();

                totalCredit=cse211+cse212+cse213+cse214+cse215+cse216+cse217+cse218+cse219;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);


                alertDialogBuilder=new AlertDialog.Builder(ThirdSemester.this);
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
        //setupInterstialAd();
    }

    //Intersetial add
    /*

    private void setupInterstialAd() {
        interstitialAd = new InterstitialAd(ThirdSemester.this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.intersetitial_add_unit));
        AdRequest adRequestFull = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequestFull);
        interstitialAd.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                interstitialAd.show();
            }

        });
    } */

    //-----------------Method for CSE211------------------------------

    public void ObjectOrientedProgramming(){
        String value = CSE211.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse211=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse211=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse211=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse211=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse211=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse211=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse211=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse211=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse211=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse211=setValue*3.0;

        }
    }

    //---------------------Method for CSE212(Practical)------------------------

    public void objectOrientedProgrammingPractical(){
        String value = CSE212.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse212=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse212=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse212=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse212=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse212=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse212=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse212=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse212=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse212=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse212=setValue*1.5;

        }

    }

    //------------------------Method for CSE213-------------------------

    public void operatingSystem(){
        String value = CSE213.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse213=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse213=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse213=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse213=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse213=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse213=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse213=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse213=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse213=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse213=setValue*3.0;

        }
    }

    //---------------------CSE214--------------------------

    public void digitalLogicDesign(){
        String value = CSE214.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse214=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse214=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse214=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse214=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse214=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse214=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse214=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse214=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse214=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse214=setValue*3.0;

        }
    }

    //-----------------------MEthod for CSE215-----------------------

    public void digitalLogicDesignPractical(){
        String value = CSE215.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse215=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse215=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse215=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse215=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse215=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse215=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse215=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse215=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse215=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse215=setValue*1.5;

        }

    }

    //------------------Method for CSE 216 -----------------------------

    public void mathmaticsForCSE(){
        String value = CSE216.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse216=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse216=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse216=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse216=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse216=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse216=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse216=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse216=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse216=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse216=setValue*3.0;

        }
    }

    //-------------------------------Method for CSE217 --------------------


    public void electronicDeveices(){
        String value = CSE217.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse217=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse217=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse217=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse217=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse217=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse217=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse217=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse217=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse217=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse217=setValue*3.0;

        }
    }

    // --------------------------------Method for CSE218(Practical)---------------------------

    public void electronicDEvicsPractical(){
        String value = CSE218.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse218=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse218=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse218=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse218=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse218=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse218=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse218=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse218=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse218=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse218=setValue*1.5;

        }

    }

    //-----------------------------Method for CSE219------------------------------

    public void basicAccounting(){
        String value = CSE219.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse219=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse219=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse219=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse219=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse219=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse219=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse219=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse219=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse219=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse219=setValue*3.0;

        }
    }



}
