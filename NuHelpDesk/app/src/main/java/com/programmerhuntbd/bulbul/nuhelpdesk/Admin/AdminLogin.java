package com.programmerhuntbd.bulbul.nuhelpdesk.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.programmerhuntbd.bulbul.nuhelpdesk.R;

public class AdminLogin extends AppCompatActivity {

    private EditText adminEmail,adminPass;
    private Button adminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Admin Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adminEmail= (EditText) findViewById(R.id.adminLoginEmail);
        adminPass= (EditText) findViewById(R.id.adminLoginPass);
        adminLogin= (Button) findViewById(R.id.adminLoginBtn);


        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = adminEmail.getText().toString().trim();
                String pass  = adminPass.getText().toString().trim();

                if(mail.equals("admin") & pass.equals("1234")){
                    Intent adminPanel = new Intent(AdminLogin.this,AdminActivity.class);
                    startActivity(adminPanel);
                    finish();
                }else {
                    Toast.makeText(AdminLogin.this,"UserName or Password does not match",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
