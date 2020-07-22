package com.example.pad_drumming;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

//Pager Adapter: Creates fragments in memory so we can access them quickly
public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {

    //Class that implements adapter for fragments
    private final List<Fragment> mFragmentList = new ArrayList<>();


    //initialize fragment adapter
    public SectionsStatePagerAdapter( FragmentManager fm) {
       super(fm);
    }

    //create method to create fragment list
    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);

    }

    //return methods
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
