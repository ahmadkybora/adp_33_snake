package com.example.adp_33_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int myCounter = 0;
    private Button plus;
    private Button minimize;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        txt = findViewById(R.id.txt);
        plus = findViewById(R.id.plus);
        minimize = findViewById(R.id.minimize);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCounter++;
                txt.setText(Integer.toString(myCounter));
            }
        });

        minimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCounter--;
                txt.setText(Integer.toString(myCounter));
            }
        });
    }
}