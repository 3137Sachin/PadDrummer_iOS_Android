package com.example.pad_drumming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class aboutactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivity);
    }

    //Creating Menu Bar (Which can be enabled in the XML page
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Items in Menu Bar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.action_about){
            Intent aboutIntent = new Intent(aboutactivity.this, aboutactivity.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_tips){
            Intent aboutIntent = new Intent(aboutactivity.this, Tips.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_settings){
            Intent settingsIntent = new Intent(aboutactivity.this, SettingsActivity.class);
            startActivity(settingsIntent);
        }
        if(id == R.id.action_help){
            Intent helpIntent = new Intent(aboutactivity.this, helpactivity.class);
            startActivity(helpIntent);
        }

        if(id == R.id.action_home){
            Intent homeIntent = new Intent(aboutactivity.this, MainActivity.class);
            startActivity(homeIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
