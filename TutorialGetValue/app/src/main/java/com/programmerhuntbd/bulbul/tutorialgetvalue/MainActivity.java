package com.programmerhuntbd.bulbul.tutorialgetvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= (EditText) findViewById(R.id.name);
        btn= (Button) findViewById(R.id.btn);
        tv= (TextView) findViewById(R.id.show);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String myName = name.getText().toString();
                tv.setText(myName);

            }
        });
    }
}
