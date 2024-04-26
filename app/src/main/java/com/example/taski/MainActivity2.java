package com.example.taski;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
TextView tv,tv1;
String st,st1;
ImageButton log;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null) {

            getSupportActionBar().setTitle("Homepage");
        }

      log=findViewById(R.id.log1);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv= findViewById(R.id.textView2);

        st= getIntent().getExtras().getString("value");
        tv.setText(st);
        tv1=findViewById(R.id.textView4);
        st1= getIntent().getExtras().getString("password");
        tv1.setText(st1);


    }
}