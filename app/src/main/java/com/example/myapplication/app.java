package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class app extends AppCompatActivity {
    ImageButton toTheBroser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        toTheBroser =(ImageButton)findViewById(R.id.imageButton2);

        toTheBroser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                browser();
            }
        });
    }
        public void browser(){
            Intent intent =new Intent(this, MySimpleActivity.class);
            startActivity(intent);
        }

}
