package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class namelist extends AppCompatActivity {
    private Switch sw1, sw2, sw3, sw4, sw5, sw6, sw7;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namelist);
        sw1 = (Switch) findViewById(R.id.switch1);
        sw2 = (Switch) findViewById(R.id.switch3);
        sw3 = (Switch) findViewById(R.id.switch9);
        sw4 = (Switch) findViewById(R.id.switch10);
//        sw5 = (Switch) findViewById(R.id.switch);
//        sw6 = (Switch) findViewById(R.id.switch2);
//        sw7 = (Switch) findViewById(R.id.switch2);
        button1 = (Button) findViewById(R.id.getBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1, str2;
                int studentcount = 1;
                if (sw1.isChecked()) {
//                    str1 = sw1.getTextOn().toString();
                    studentcount++;
                }
                if (sw2.isChecked()) {
                    studentcount++;
                }
                if (sw3.isChecked()) {
                    studentcount++;
                }
                if (sw4.isChecked()) {
                    studentcount++;
                }

                Toast.makeText(getApplicationContext(), "Students in the class: " + studentcount, Toast.LENGTH_SHORT).show();

            }
        });
    }
}

