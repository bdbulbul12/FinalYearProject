package com.programmerhuntbd.bulbul.nuhelpdesk.ProgrammingLanguages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.programmerhuntbd.bulbul.nuhelpdesk.ProgrammingLanguages.CProgramming.CMainActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;

import java.util.ArrayList;

public class ProgrammingMainActivity extends AppCompatActivity {

    LinearLayout cProgramming;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Programming Languages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cProgramming= (LinearLayout) findViewById(R.id.cProgramming);

        cProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(ProgrammingMainActivity.this, CMainActivity.class);
                startActivity(c);
            }
        });

    }
}
