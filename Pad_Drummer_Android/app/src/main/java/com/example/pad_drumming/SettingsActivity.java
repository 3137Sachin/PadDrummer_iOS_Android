package com.example.pad_drumming;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsActivity extends AppCompatActivity {

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
            Intent aboutIntent = new Intent(SettingsActivity.this, aboutactivity.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_tips){
            Intent aboutIntent = new Intent(SettingsActivity.this, Tips.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_settings){
            Intent settingsIntent = new Intent(SettingsActivity.this, SettingsActivity.class);
            startActivity(settingsIntent);
        }
        if(id == R.id.action_help){
            Intent helpIntent = new Intent(SettingsActivity.this, helpactivity.class);
            startActivity(helpIntent);
        }

        if(id == R.id.action_home){
            Intent homeIntent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }

        return super.onOptionsItemSelected(item);
    }

    //Settings Items Created by System default
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    //Settings Items Created by System default
    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
}