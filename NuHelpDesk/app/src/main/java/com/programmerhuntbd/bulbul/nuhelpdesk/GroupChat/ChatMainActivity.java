package com.programmerhuntbd.bulbul.nuhelpdesk.GroupChat;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.text.format.DateFormat;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;



import java.util.Date;

public class ChatMainActivity extends AppCompatActivity {

    private static int SIGN_IN_REQUEST_CODE=1;
    private FirebaseListAdapter<ChatMessages> adapter;
    RelativeLayout activity_chat_main;
    FloatingActionButton fab;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==SIGN_IN_REQUEST_CODE){

            if(requestCode==RESULT_OK){
                Snackbar.make(activity_chat_main,"Succesfully signin !Welcome",Snackbar.LENGTH_LONG).show();
                dispalyChatMessage();
            }
            else {
                Snackbar.make(activity_chat_main,"We could not sign in you try later !",Snackbar.LENGTH_LONG).show();
                finish();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(FirebaseAuth.getInstance().getCurrentUser().getEmail());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        activity_chat_main=(RelativeLayout) findViewById(R.id.activity_chat_main);
        fab= (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = (EditText) findViewById(R.id.input);
                FirebaseDatabase.getInstance().getReference("chat").push().setValue(new ChatMessages(input.getText().toString(),
                        FirebaseAuth.getInstance().getCurrentUser().getEmail()));

                input.setText("");
            }
        });

        //Check if not sign in

        if(FirebaseAuth.getInstance().getCurrentUser()==null){

            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(),SIGN_IN_REQUEST_CODE);

        }else{

            //Snackbar.make(activity_chat_main,"Welcome "+FirebaseAuth.getInstance().getCurrentUser().getEmail(),Snackbar.LENGTH_LONG).show();
            //loadcontents

            dispalyChatMessage();
        }




    }

    private void dispalyChatMessage() {
        ListView listOfMessage = (ListView) findViewById(R.id.list_of_message);
        adapter=new FirebaseListAdapter<ChatMessages>(this,ChatMessages.class,R.layout.chat_list_item,FirebaseDatabase.getInstance().getReference("chat")) {
            @Override
            protected void populateView(View v, ChatMessages model, int position) {

                    //get Refetence of the view
                TextView messageText,messageUser,messageTime;
                messageText= (TextView) v.findViewById(R.id.message_text);
                messageUser= (TextView) v.findViewById(R.id.message_user);
                messageTime= (TextView) v.findViewById(R.id.message_time);

                messageText.setText(model.getMessageText());
                messageUser.setText(model.getMessageUser());
                messageTime.setText(DateFormat.format("dd-MM-yy (HH:mm:ss)",model.getMessageTime()));
            }
        };

        listOfMessage.setAdapter(adapter);
    }
}
