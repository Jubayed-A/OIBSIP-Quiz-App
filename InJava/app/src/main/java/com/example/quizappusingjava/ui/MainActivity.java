package com.example.quizappusingjava.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.quizappusingjava.R;
import com.example.quizappusingjava.presentation.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomeFragment()).commit();

    }
}