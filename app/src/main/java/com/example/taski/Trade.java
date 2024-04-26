package com.example.taski;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Trade extends AppCompatActivity {
    RecyclerView r2;
    ArrayList <Tradeitem> t1=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trade);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        r2=findViewById(R.id.recycler2);


        t1.add(new Tradeitem(R.drawable.c1,"Remote car","6 km- 6 month","1","1","1,200 INR"));
        t1.add(new Tradeitem(R.drawable.c2,"5 Kg cylinder","3 km - 6 months","4","1","1,000"));
        t1.add(new Tradeitem(R.drawable.c3,"RS200","6 km- 6 month","1","1","641,039 INR"));
        t1.add(new Tradeitem(R.drawable.c4,"Computer","6 km - 7 months","2","1","1000INR"));
        Tradesub adapter=new Tradesub(this,t1);

        r2.setHasFixedSize(true);
        r2.setLayoutManager(new LinearLayoutManager(this));
        r2.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        r2.setAdapter(adapter);



    }
}