package com.example.taski;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    TextView t1,t2;
    LinearLayout l1,l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        t1=findViewById(R.id.textView5);
        t2=findViewById(R.id.textView7);

        if (l1 != null) {
            l1.findViewById(R.id.first);
        }

        if (l2 != null) {
            l2.findViewById(R.id.first);
        }

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                v.setBackgroundResource(R.drawable.iaonclick);
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                l2.setVisibility(View.VISIBLE);
                l1.setVisibility(View.GONE);
            }
        });

    }
}