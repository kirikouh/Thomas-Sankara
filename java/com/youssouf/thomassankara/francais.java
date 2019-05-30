package com.youssouf.thomassankara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class francais extends AppCompatActivity {
    Button bt1,bt2,bt3,bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais);
        bt1=findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(francais.this,bibliographie.class);
                startActivity(myIntent);
            }
        });
        bt2=findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(francais.this,realisation.class);
                startActivity(myIntent);
            }
        });
        bt3=findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(francais.this,citation.class);
                startActivity(myIntent);
            }
        });
        bt5=findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(francais.this,rec.class);
                startActivity(myIntent);
            }
        });

    }
}
