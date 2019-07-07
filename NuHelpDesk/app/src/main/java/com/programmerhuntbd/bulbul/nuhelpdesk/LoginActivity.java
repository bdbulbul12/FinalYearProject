package com.programmerhuntbd.bulbul.nuhelpdesk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.programmerhuntbd.bulbul.nuhelpdesk.Admin.AdminLogin;

public class LoginActivity extends AppCompatActivity {
    private EditText loginEmail,loginPassword;
    private Button  loginBtn,regBtn;

    private FirebaseAuth mAuth;

    private ProgressDialog loginProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth =FirebaseAuth.getInstance();

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        loginProgress = new ProgressDialog(this);

        loginEmail= (EditText) findViewById(R.id.login_email);
        loginPassword= (EditText) findViewById(R.id.login_pass);
        loginBtn= (Button) findViewById(R.id.login_btn);
        regBtn= (Button) findViewById(R.id.login_reg_btn);




        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email=loginEmail.getText().toString().trim();
                String pass = loginPassword.getText().toString().trim();


                if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pass)){
                    loginProgress.show();
                    mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){

                                sendToMain();

                            }else {

                                String errorMessage = task.getException().getMessage();
                                Toast.makeText(LoginActivity.this,"Error"+errorMessage,Toast.LENGTH_LONG).show();
                            }
                            loginProgress.hide();
                        }
                    });
                }
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(register);
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser !=null){
            sendToMain();

        }
    }

    private void sendToMain() {
        Intent mainIntent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(mainIntent);
        finish();

    }


}
