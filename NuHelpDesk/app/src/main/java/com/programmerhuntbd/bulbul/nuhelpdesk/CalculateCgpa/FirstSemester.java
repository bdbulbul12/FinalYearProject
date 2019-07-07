package com.programmerhuntbd.bulbul.nuhelpdesk.CalculateCgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class FirstSemester extends AppCompatActivity {

    String[] CGPA_value;
    private Spinner CSE111,CSE112,CSE113,CSE114,CSE115,CSE116;
    private TextView resultView;
    private Button button;
    double subCredit=16.5;
    double cse111,cse112,cse113,cse114,cse115,cse116;
    double totalCredit,result;

    private AlertDialog.Builder alertDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_semester);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("First Semester");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CGPA_value=getResources().getStringArray(R.array.main_subject);
        CSE111= (Spinner) findViewById(R.id.CS111);
        CSE112= (Spinner) findViewById(R.id.CS112);
        CSE113= (Spinner) findViewById(R.id.CS113);
        CSE114= (Spinner) findViewById(R.id.CS114);
        CSE115= (Spinner) findViewById(R.id.CS115);
        CSE116= (Spinner) findViewById(R.id.CS116);

        button= (Button) findViewById(R.id.show);
        resultView= (TextView) findViewById(R.id.resultId);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE111.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE112.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE113.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE114.setAdapter(adapter4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE115.setAdapter(adapter5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewExampleId,CGPA_value);
        CSE116.setAdapter(adapter6);


       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Computer_fundamental();
                programmingC();
                programmingCpractical();
                physics();
                Math();
                English();

                totalCredit=cse111+cse112+cse113+cse114+cse115+cse116;
                result=(totalCredit/subCredit);
                //String CGPA= String.valueOf(result);
                resultView.setText(String.format( "Your Total CGPA is : %.2f", result ));

            }
        }); */

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Computer_fundamental();
                programmingC();
                programmingCpractical();
                physics();
                Math();
                English();

                totalCredit=cse111+cse112+cse113+cse114+cse115+cse116;
                result=(totalCredit/subCredit);

                //String CGPA= String.valueOf(result);
                //resultView.setText(String.format( "Your Total CGPA is : %.2f", result ));
                alertDialogBuilder=new AlertDialog.Builder(FirstSemester.this);
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


    //---------------Method for CSE 111-----------------------

    public void Computer_fundamental(){
        String value = CSE111.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse111=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse111=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse111=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse111=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse111=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse111=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse111=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse111=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse111=setValue*3.0;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse111=setValue*3.0;

        }
    }
    //--------------------Method for CSE112--------------------

    public void programmingC(){
        String value=CSE112.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse112=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse112=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse112=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse112=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse112=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse112=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse112=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse112=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse112=setValue*3.0;
            ;
        }else if(value.equals("F")){
            double setValue=0.00;
            cse112=setValue*3.0;

        }
    }

    //---------------------CSE113(Practical)----------------------------

    public void programmingCpractical(){
        String value = CSE113.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse113=setValue*1.5;

        }else if(value.equals("A")){
            double setValue=3.75;
            cse113=setValue*1.5;

        }else if(value.equals("A-")){
            double setValue=3.50;
            cse113=setValue*1.5;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse113=setValue*1.5;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse113=setValue*1.5;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse113=setValue*1.5;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse113=setValue*1.5;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse113=setValue*1.5;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse113=setValue*1.5;

        }else if(value.equals("F")){
            double setValue=0.00;
            cse113=setValue*1.5;

        }

    }
    //-------------------------Method for CSE114-------------------------

    public void physics(){
        String value=CSE114.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse114=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse114=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse114=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse114=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse114=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse114=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse114=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse114=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse114=setValue*3.0;
            ;
        }else if(value.equals("F")){
            double setValue=0.00;
            cse114=setValue*3.0;

        }

    }

    //---------------------Method for CSE115------------------------------

    public void Math(){
        String value=CSE115.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse115=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse115=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse115=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse115=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse115=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse115=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse115=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse115=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse115=setValue*3.0;
            ;
        }else if(value.equals("F")){
            double setValue=0.00;
            cse115=setValue*3.0;

        }
    }

    //-----------------------Method For CSE116------------------------

    public void English(){
        String value=CSE116.getSelectedItem().toString();
        if(value.equals("A+")){
            double setValue=4.0;
            cse116=setValue*3.0;



        }else if(value.equals("A")){
            double setValue=3.75;
            cse116=setValue*3.0;


        }else if(value.equals("A-")){
            double setValue=3.50;
            cse116=setValue*3.0;

        }else if(value.equals("B+")){
            double setValue=3.25;
            cse116=setValue*3.0;

        }else if(value.equals("B")){
            double setValue=3.00;
            cse116=setValue*3.0;

        }else if(value.equals("B-")){
            double setValue=2.75;
            cse116=setValue*3.0;

        }else if(value.equals("C+")){
            double setValue=2.50;
            cse116=setValue*3.0;

        }else if(value.equals("C")){
            double setValue=2.25;
            cse116=setValue*3.0;

        }else if(value.equals("D")){
            double setValue=2.00;
            cse116=setValue*3.0;
            ;
        }else if(value.equals("F")){
            double setValue=0.00;
            cse116=setValue*3.0;

        }
    }
}