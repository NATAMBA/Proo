package com.example.altricia.proo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Button back,exit;
    TextView put,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        back=(Button)findViewById(R.id.back_button);
        exit=(Button)findViewById(R.id.exit_button);
        put=(TextView)findViewById(R.id.nam);
        password=(TextView)findViewById(R.id.pass);

        String nam = getIntent().getExtras().getString("result");
        put.setText(nam);

        String phon = getIntent().getExtras().getString("message");
        password.setText(phon);

    }


    public void back(View view) {
        Intent in = new Intent(this,Main2Activity.class);

        startActivity(in);
    }

    public void Exit(View view) {
        Intent in = new Intent(this, MainActivity.class);

        startActivity(in);
    }

    public void on_exit (View view) {
        Intent intent = new Intent(Main3Activity.this,MainActivity.class);
        finish();}}
