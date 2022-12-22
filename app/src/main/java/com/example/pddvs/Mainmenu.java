package com.example.pddvs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Mainmenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        Button buttonBack= (Button) findViewById(R.id.buttonClic);
        buttonBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent i = new Intent(Mainmenu.this, Test1.class);
        startActivity(i);
    }
}