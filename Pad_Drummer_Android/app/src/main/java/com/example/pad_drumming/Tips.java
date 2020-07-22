package com.example.pad_drumming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

//Class that initializes the main fragment page
public class Tips extends AppCompatActivity {

    private SectionsStatePagerAdapter msectionsStatePagerAdapter;
    private ViewPager mViewPager;

    private static final String TAG = "Tips";

    //Method that links xml and fragment code
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        Log.d(TAG, "onCreate: Started.");

        //creates new state pager adapter for the fragment
        msectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);

        //Setup the pager
        setupViewPager(mViewPager);
    }

    //method to setup view pager
    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new tipsone(), "Tips1");
        adapter.addFragment(new tipstwo(), "Tips2");
        viewPager.setAdapter(adapter);
    }

    //method to set View pager
    public void setViewPager(int fragmentNumber ){
        mViewPager.setCurrentItem(fragmentNumber);
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
            Intent aboutIntent = new Intent(Tips.this, aboutactivity.class);
            startActivity(aboutIntent);
        }

        if(id == R.id.action_tips){
            Intent aboutIntent = new Intent(Tips.this, Tips.class);
            startActivity(aboutIntent);
        }
        if(id == R.id.action_settings){
            Intent settingsIntent = new Intent(Tips.this, SettingsActivity.class);
            startActivity(settingsIntent);
        }
        if(id == R.id.action_help){
            Intent helpIntent = new Intent(Tips.this, helpactivity.class);
            startActivity(helpIntent);
        }

        if(id == R.id.action_home){
            Intent homeIntent = new Intent(Tips.this, MainActivity.class);
            startActivity(homeIntent);
        }

        return super.onOptionsItemSelected(item);
    }

}

