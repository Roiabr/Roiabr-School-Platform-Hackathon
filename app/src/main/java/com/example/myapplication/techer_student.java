package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;


public class techer_student extends AppCompatActivity {
    private Button button1,button2;
    private Switch sw1,sw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.techer_name_student);
        //  setContentView(R.layout.activity_my);
        //   Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        // setSupportActionBar(myToolbar);
        sw1 = (Switch)findViewById(R.id.switch1);
        sw2 = (Switch)findViewById(R.id.switch2);
        button1 =(Button)findViewById(R.id.getBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // application();
                String str1, str2;
                int studentcount=0;
                if (sw1.isChecked()) {
                    str1 = sw1.getTextOn().toString();
                    studentcount++;
                }
                else
                    str1 = sw1.getTextOff().toString();
                if (sw2.isChecked()){
                    str2 = sw2.getTextOn().toString();
                    studentcount++;
                }
                else
                    str2 = sw2.getTextOff().toString();
                // Toast.makeText(getApplicationContext(), "Switch1 -  " + str1 + " \n" + "Switch2 - " + str2,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Students in the class: " +studentcount,Toast.LENGTH_SHORT).show();

            }
        });


    }
//    public void application(){
//        Intent intent =new Intent(this, application.class);
//        startActivity(intent);
//    }





}
