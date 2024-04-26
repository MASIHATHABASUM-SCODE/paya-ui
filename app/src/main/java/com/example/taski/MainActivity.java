package com.example.taski;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b1,b3,B4;
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        et1 = findViewById(R.id.editTextText);
        et2 = findViewById(R.id.editTextText2);
        b1 = findViewById(R.id.button);
        b3=findViewById(R.id.button3);
        B4=findViewById(R.id.button4);
        ImageView img = findViewById(R.id.showhidepass);
        img.setImageResource(R.drawable.eye_hide);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    et2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    img.setImageResource(R.drawable.eye_show);
                } else {
                    et2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    img.setImageResource(R.drawable.eye_hide);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String check_edu = et1.getText().toString().toLowerCase();
                String check_edu1 = et2.getText().toString().toLowerCase();
                if (check_edu.equals("a") && check_edu1.equals("b")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("value",  check_edu);


                    intent.putExtra("password", check_edu1);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "correct username and password", Toast.LENGTH_SHORT).show();
//                    finish();
                } else {
                    //               Toast.makeText(this, Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "wrong username andpassword", Toast.LENGTH_LONG).show();
                }


            }
        })
        ;
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, SignupTypeActivity.class);
                startActivity(intent2);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Trade.class);
                startActivity(intent2);
            }
        });
    }
}