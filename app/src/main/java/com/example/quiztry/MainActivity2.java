package com.example.quiztry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button startBtn=findViewById(R.id.button6);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this,androidscreen.class);
                startActivity(i);
            }
        });

        final Button startBtn2=findViewById(R.id.button7);
        startBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity2.this,javascreen.class);
                startActivity(i2);
            }
        });

        final Button startBtn3=findViewById(R.id.button8);
        startBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(MainActivity2.this,pythonscreen.class);
                startActivity(i3);
            }
        });

        final Button startBtn4=findViewById(R.id.button9);
        startBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(MainActivity2.this,sqlscreen1.class);
                startActivity(i4);
            }
        });
    }
}