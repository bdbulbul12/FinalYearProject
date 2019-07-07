package com.programmerhuntbd.bulbul.nuhelpdesk.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.programmerhuntbd.bulbul.nuhelpdesk.R;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener {

    private Button addUniversity,addNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Admin Panel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addUniversity= (Button) findViewById(R.id.addUniversity);
        addNotice= (Button) findViewById(R.id.addNotice);

        addUniversity.setOnClickListener(this);
        addNotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.addUniversity){
//            Intent addUniversity = new Intent(AdminActivity.this,AddUniversity.class);
//            startActivity(addUniversity);
        }if(v.getId()==R.id.addNotice){
//            Intent addNotice = new Intent(AdminActivity.this,AddUniversity.class);
//            startActivity(addNotice);
        }
    }
}