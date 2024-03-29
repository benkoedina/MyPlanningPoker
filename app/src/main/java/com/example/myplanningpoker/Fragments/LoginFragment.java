package com.example.myplanningpoker.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.myplanningpoker.Models.Group;
import com.example.myplanningpoker.Models.Question;
import com.example.myplanningpoker.Models.User;
import com.example.myplanningpoker.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class LoginFragment extends Fragment {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    public LoginFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //setting te layout
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        EditText et_name = view.findViewById(R.id.et_name);
        EditText et_groupid=view.findViewById(R.id.et_groupid);
        Button bt_login = view.findViewById(R.id.bt_login);

       insertData();

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertData();
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, new QuestionFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;

    }
    public void insertData(){

        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        User user1 = new User(1,"Edina",0,ids);
        User user2 = new User(2,"Eva",0,ids);
        User user = new User(3,"Bibi",0);
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        Question q1 = new Question(1,"Do you like Android Studio?",true,users);
        Question q2 = new Question(2,"Do you like Programming?",true,users);
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);
        Group g1 = new Group(1,questions,true);

        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("FIREBASE_DATABASE");

      //  databaseReference.push().setValue(user1);
        //databaseReference.push().setValue(user2);
        //databaseReference.push().setValue(q1);
        //databaseReference.push().setValue(q2);
        databaseReference.push().setValue(user);




    }
}
