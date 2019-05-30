package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacher extends AppCompatActivity {
    private Button button;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        button1 =(Button)findViewById(R.id.appbtt);
        button = (Button)findViewById(R.id.namebtt);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listStudents();
            }
        });
    }
    public void listStudents(){
        Intent intent =new Intent(this, namelist.class);
        startActivity(intent);
    }
    public void app(){
        Intent intent =new Intent(this, app.class);
        startActivity(intent);
    }
}

