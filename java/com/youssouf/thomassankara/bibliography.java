package com.youssouf.thomassankara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bibliography extends AppCompatActivity {
    Button bt1, bt2, bt3,bt4, bt5, bt6,bt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bibliography);

        bt1=findViewById(R.id.button27);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(bibliography.this,early.class);
                startActivity(myIntent);

            }
        });

        bt2 = findViewById(R.id.button28);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(bibliography.this, military.class);
                startActivity(myIntent);

            }
        });

        bt3= findViewById(R.id.button29);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(bibliography.this,secretary.class);
                startActivity(myIntent);
            }
        });

        bt4= findViewById(R.id.button30);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(bibliography.this, minister.class);
                startActivity(myIntent);
            }
        });
        bt5= findViewById(R.id.button31);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(bibliography.this, president.class);
                startActivity(myIntent);
            }
        });
        bt6= findViewById(R.id.button32);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(bibliography.this, couple.class);
                startActivity(myIntent);
            }
        });
        bt7= findViewById(R.id.button33);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(bibliography.this, death.class);
                startActivity(myIntent);
            }
        });

    }
}
