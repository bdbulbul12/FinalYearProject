package com.programmerhuntbd.bulbul.temparature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private RadioButton ftoc,ctof;
    private RadioGroup radioGroup;
    private Button btn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ftoc= (RadioButton) findViewById(R.id.ftoc);
        ctof= (RadioButton) findViewById(R.id.ctof);
        editText= (EditText) findViewById(R.id.valueId);
        btn= (Button) findViewById(R.id.convertId);
        textView= (TextView) findViewById(R.id.result);
        radioGroup= (RadioGroup) findViewById(R.id.radioGroup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = new Double(editText.getText().toString());
                if(ftoc.isChecked()){
                   // value=Converter.farenhite2celcious(value);
                    value=32+value*9/5;
                }else {
                    //value=Converter.celcious2farenhite(value);
                    value=(value-32)*5/9;
                }
                textView.setText(new Double(value).toString());

            }
        });


    }
}
