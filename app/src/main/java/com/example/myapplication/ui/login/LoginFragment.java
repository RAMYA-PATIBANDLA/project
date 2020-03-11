package com.example.myapplication.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.example.myapplication.ui.home.HomeFragment;

import com.example.myapplication.R;

public class LoginFragment extends AppCompatActivity {

    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);
    }

    public void back(View v) {
        Intent i4 = new Intent(this, HomeFragment.class);
        startActivity(i4);
    }

    public void submit(View v) {
        Intent i2 = new Intent(this, HomeFragment.class);
        startActivity(i2);

    }
}