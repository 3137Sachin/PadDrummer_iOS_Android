package com.example.pad_drumming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class helpactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpactivity);


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
            Intent aboutIntent = new Intent(helpactivity.this, aboutactivity.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_tips){
            Intent aboutIntent = new Intent(helpactivity.this, Tips.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_settings){
            Intent settingsIntent = new Intent(helpactivity.this, SettingsActivity.class);
            startActivity(settingsIntent);
        }
        if(id == R.id.action_help){
            Intent helpIntent = new Intent(helpactivity.this, helpactivity.class);
            startActivity(helpIntent);
        }

        if(id == R.id.action_home){
            Intent homeIntent = new Intent(helpactivity.this, MainActivity.class);
            startActivity(homeIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
