package com.example.pddvs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestFi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fi);
    }

    public void onClick(View view) {
        Intent i = new Intent(TestFi.this, Infa.class);
        startActivity(i);
    }
}