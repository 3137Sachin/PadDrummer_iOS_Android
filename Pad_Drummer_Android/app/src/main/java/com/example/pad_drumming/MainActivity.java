package com.example.pad_drumming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Load Variables
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;

    private SectionsStatePagerAdapter msectionsStatePagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize Sound pool than music player(which can play multiple sound at a single time)
        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);

        //Load Sounds into integers
        sound1 = sp.load(getApplicationContext(), R.raw.sound1, 1);
        sound2 = sp.load(getApplicationContext(), R.raw.sound2, 1);
        sound3 = sp.load(getApplicationContext(), R.raw.sound3, 1);

        sound4 = sp.load(getApplicationContext(), R.raw.sound4, 1);
        sound5 = sp.load(getApplicationContext(), R.raw.sound5, 1);
        sound6 = sp.load(getApplicationContext(), R.raw.sound6, 1);

        sound7 = sp.load(getApplicationContext(), R.raw.sound7, 1);
        sound8 = sp.load(getApplicationContext(), R.raw.sound8, 1);
        sound9 = sp.load(getApplicationContext(), R.raw.sound9, 1);

    }

    //Methods for playing each sound and their properties including different volumes
    public void playsound1 (View v){

        sp.play(sound1,1.0f,1.0f,0,0,1.0f);
    }

    public void playsound2 (View v){
        sp.play(sound2,2.0f,2.0f,0,0,1.0f);

    }

    public void playsound3 (View v){
        sp.play(sound3,1.0f,1.0f,0,0,1.0f);

    }

    public void playsound4 (View v){
        sp.play(sound4,1.4f,1.4f,0,0,1.0f);

    }

    public void playsound5 (View v){
        sp.play(sound5,1.0f,1.0f,0,0,1.0f);

    }

    public void playsound6 (View v){
        sp.play(sound6,0.5f,0.5f,0,0,1.0f);

    }

    public void playsound7 (View v){
        sp.play(sound7,1.0f,1.0f,0,0,1.0f);

    }

    public void playsound8 (View v){
        sp.play(sound8,1.0f,1.0f,0,0,1.0f);

    }

    public void playsound9 (View v){
        sp.play(sound9,1.0f,1.0f,0,0,1.0f);

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
            Intent aboutIntent = new Intent(MainActivity.this, aboutactivity.class);
            startActivity(aboutIntent);
        }

        if(id == R.id.action_tips){
            Intent aboutIntent = new Intent(MainActivity.this, Tips.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_settings){
            Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(settingsIntent);
        }
        if(id == R.id.action_help){
            Intent helpIntent = new Intent(MainActivity.this, helpactivity.class);
            startActivity(helpIntent);
        }

        if(id == R.id.action_home){
            Intent homeIntent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(homeIntent);
        }

        return super.onOptionsItemSelected(item);
    }

}
