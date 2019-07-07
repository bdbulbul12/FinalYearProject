package com.programmerhuntbd.bulbul.tuttemparatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private RadioButton F2C,C2F;
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText= (EditText) findViewById(R.id.userValueId);
        F2C= (RadioButton) findViewById(R.id.F2C);
        C2F= (RadioButton) findViewById(R.id.C2F);
        btn= (Button) findViewById(R.id.btn);
        tv= (TextView) findViewById(R.id.show);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value =new Double(editText.getText().toString()) ;
                if(F2C.isChecked()){
                    value = 32+value*9/5;
                    tv.setText(new Double(value).toString());
                }else{
                    value = (value-32)*5/9;
                    tv.setText(new Double(value).toString());
                }
            }
        });
    }
}
