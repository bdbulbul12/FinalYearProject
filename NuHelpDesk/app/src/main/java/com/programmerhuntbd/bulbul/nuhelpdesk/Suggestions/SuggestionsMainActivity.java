package com.programmerhuntbd.bulbul.nuhelpdesk.Suggestions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.programmerhuntbd.bulbul.nuhelpdesk.R;
import com.programmerhuntbd.bulbul.nuhelpdesk.Suggestions.UpLoadSuggestion.ImagesActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.Suggestions.UpLoadSuggestion.ViewMainActivity;

public class SuggestionsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Suggestions");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public void UploadSuggestions(View view) {

        Intent upload = new Intent(SuggestionsMainActivity.this, ViewMainActivity.class);
        startActivity(upload);

    }

    public void ViewSuggestions(View view) {
        Intent viewUpload = new Intent(SuggestionsMainActivity.this, ImagesActivity.class);
        startActivity(viewUpload);
    }
}
