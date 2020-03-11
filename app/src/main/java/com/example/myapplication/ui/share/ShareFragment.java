package com.example.myapplication.ui.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.ui.home.HomeFragment;


public class ShareFragment extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_share);
        }
        public void back(View v){
            Intent i4=new Intent(this, HomeFragment.class);
            startActivity(i4);
        }
        public void submit(View v){
            Intent i2=new Intent(this,HomeFragment.class);
            startActivity(i2);

        }
    }
