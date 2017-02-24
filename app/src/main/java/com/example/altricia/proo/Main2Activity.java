package com.example.altricia.proo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button send,back;
    EditText put,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        back=(Button)findViewById(R.id.button3);
        put=(EditText) findViewById(R.id.nam);
        password=(EditText)findViewById(R.id.pass);

    }


    public void previouspage(View view) {
        Intent intent=new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }

}
