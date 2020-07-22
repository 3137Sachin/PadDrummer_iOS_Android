package com.example.pad_drumming;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//Class that is a part of the fragment
public class tipstwo extends Fragment {

    private static final String TAG = "Tips2";

    private Button btnNavFrag1;
    private Button btnNavFrag2;


    //Method for navigating the buttons in the fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        //Create buttons for the fragments
        View view = inflater.inflate(R.layout.tipstwo_layout, container, false);
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);

        Log.d(TAG, "onCreateView: started.");

        //Fragments require different approach than class. These are the methods for the button click
        btnNavFrag1.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View view){
            Toast.makeText(getActivity(),
                    "Tips 1", Toast.LENGTH_SHORT).show();

            //Navigate to fragment called
            ((Tips)getActivity()).setViewPager(0);

        }
    });

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

