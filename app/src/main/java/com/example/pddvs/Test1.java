package com.example.pddvs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class Test1 extends AppCompatActivity {
private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        layout = findViewById(R.id.layout1);

    }
    public void buttno(View v) {
        layout.setBackgroundColor(Color.rgb(255,0,0));
    }
    public void buttvine(View view) {
        Intent i = new Intent(Test1.this, TestFi.class);
        startActivity(i);
    }
}