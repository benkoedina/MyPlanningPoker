package com.example.myplanningpoker.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.myplanningpoker.R;

import androidx.fragment.app.Fragment;

public class QuestionFragment extends Fragment {

    public QuestionFragment()
    {
        //required empty constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //setting te layout
        View view = inflater.inflate(R.layout.fragment_question, container, false);

        Button bt_submit = view.findViewById(R.id.submit);
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("kaka","kaka");
            }
        });

        return view;


    }
}
