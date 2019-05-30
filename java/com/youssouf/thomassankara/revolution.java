package com.youssouf.thomassankara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class revolution extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revolution);
        bt1=findViewById(R.id.button27);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(revolution.this,culture.class);
                startActivity(myIntent);
            }
        });
        bt2=findViewById(R.id.button28);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(revolution.this,genre.class);
                startActivity(myIntent);
            }
        });
        bt3=findViewById(R.id.button29);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(revolution.this,sante.class);
                startActivity(myIntent);
            }
        });
        bt4= findViewById(R.id.button30);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(revolution.this,educatio.class);
                startActivity(myIntent);
            }
        });
        bt5=findViewById(R.id.button31);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(revolution.this,securite.class);
                startActivity(myIntent);
            }
        });
        bt6=findViewById(R.id.button32);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(revolution.this,logement.class);
                startActivity(myIntent);
            }
        });
        bt7=findViewById(R.id.button33);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(revolution.this,corruptio.class);
                startActivity(myIntent);
            }
        });
        bt8= findViewById(R.id.button34);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(revolution.this,desertificatio.class);
                startActivity(myIntent);
            }
        });
        bt9= findViewById(R.id.button35);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(revolution.this,monde.class);
                startActivity(myIntent);
            }
        });
    }
}
