package com.example.taski;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class individualActivity extends AppCompatActivity {
    Button b1;
    TextView t1, t2, t19;
    EditText et1, et2;
    ImageView img, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);

        et1 = findViewById(R.id.editTextText11);
        et2 = findViewById(R.id.editTextText12);
        t19 = findViewById(R.id.textView19);
        img = findViewById(R.id.showhidepass1);
        img2 = findViewById(R.id.showhidepass2);

        img2.setImageResource(R.drawable.eye_hide);
        img.setImageResource(R.drawable.eye_hide);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    et1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    img.setImageResource(R.drawable.eye_show);
                } else {
                    et1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    img.setImageResource(R.drawable.eye_hide);
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    et2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    img2.setImageResource(R.drawable.eye_show);
                } else {
                    et2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    img2.setImageResource(R.drawable.eye_hide);
                }
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(individualActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}