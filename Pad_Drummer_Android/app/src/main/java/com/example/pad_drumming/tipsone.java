package com.example.pad_drumming;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

//Class that is a part of the fragment
public class tipsone extends Fragment {

    private static final String TAG = "Tips1";


    private Button btnNavFrag2;

    //Method for navigating the buttons in the fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        //Create buttons for the fragments
        View view = inflater.inflate(R.layout.tipsone_layout, container, false);

        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);

        Log.d(TAG, "onCreateView: started.");



        btnNavFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(),
                        "Tips 2", Toast.LENGTH_SHORT).show();

                //Navigate to fragment called
                ((Tips)getActivity()).setViewPager(1);

            }
        });

        return view;
    }

}

