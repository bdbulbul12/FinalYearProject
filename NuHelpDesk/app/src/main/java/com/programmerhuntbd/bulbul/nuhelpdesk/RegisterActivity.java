package com.programmerhuntbd.bulbul.nuhelpdesk;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText mName,mEmail,mPassword,mConfirmPass;
    private Button mButton;


    private Toolbar mToolbar;
    private FirebaseAuth mAuth;

    //Progress Dialog
    private ProgressDialog mProgress;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth=FirebaseAuth.getInstance();

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Register");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mProgress = new ProgressDialog(this);

        mName= (EditText) findViewById(R.id.displayName);
        mEmail= (EditText) findViewById(R.id.reg_email);
        mPassword= (EditText) findViewById(R.id.reg_password);
        mConfirmPass= (EditText) findViewById(R.id.reg_conf_password);
        mButton= (Button) findViewById(R.id.reg_btn);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mEmail.getText().toString().trim();
                String password=mPassword.getText().toString().trim();
                String confPass=mConfirmPass.getText().toString().trim();

                if(!TextUtils.isEmpty(email)&& !TextUtils.isEmpty(password) && !TextUtils.isEmpty(confPass)){
                    if(password.equals(confPass)){
                        mProgress.show();
                        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if(task.isSuccessful()){

                                    Toast.makeText(RegisterActivity.this, "Register Successfull ", Toast.LENGTH_LONG).show();
                                    Intent setupIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                                    startActivity(setupIntent);
                                    finish();

                                } else {

                                    String errorMessage = task.getException().getMessage();
                                    Toast.makeText(RegisterActivity.this, "Error : " + errorMessage, Toast.LENGTH_LONG).show();

                                }

                                mProgress.hide();

                            }
                        });
                    }
                }
            }
        });



    }
}
