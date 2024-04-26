package com.example.taski;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {
    RecyclerView r1;
    ArrayList<contact> arrcontact= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler);
        r1=findViewById(R.id.recycler1);
        r1.setLayoutManager(new LinearLayoutManager(this));
        arrcontact.add(new contact(R.drawable.g1,"Brunch this Weekend?","Ali corner"," -I'll be in your neighbour"));
        arrcontact.add(new contact(R.drawable.g2,"Summer BBQ","to Alex","-Scott,Jeniffer"));
        arrcontact.add(new contact(R.drawable.g3,"Oui oui","Sandra Adamas","-Do your havee parish"));
        arrcontact.add(new contact(R.drawable.g1,"Birthday gift","Trevor Hansen","-Britta Holt"));
        arrcontact.add(new contact(R.drawable.g2,"Recipe to try","britta Holt","-We should eat this"));
        arrcontact.add(new contact(R.drawable.g3,"Giants game","David park","-Any intrest in seeing"));
        arrcontact.add(new contact(R.drawable.g1,"Brunch this Weekend?","Ali corner","-I'll be in your neighbour"));
        arrcontact.add(new contact(R.drawable.g2,"Summer BBQ","to Alex","-Scott,Jeniffer"));
        arrcontact.add(new contact(R.drawable.g3,"Oui oui","Sandra Adamas","-Do your havee parish"));
        arrcontact.add(new contact(R.drawable.g1,"Birthday gift","Trevor Hansen","-Britta Holt"));
        arrcontact.add(new contact(R.drawable.g2,"Recipe to try","britta Holt","-We should eat this"));
        arrcontact.add(new contact(R.drawable.g3,"Giants game","David park","-Any intrest in seeing"));
        arrcontact.add(new contact(R.drawable.g1,"Brunch this Weekend?","Ali corner","-I'll be in your neighbour"));
        arrcontact.add(new contact(R.drawable.g2,"Summer BBQ","to Alex","-Scott,Jeniffer"));
        arrcontact.add(new contact(R.drawable.g3,"Oui oui","Sandra Adamas","-Do your havee parish"));
        arrcontact.add(new contact(R.drawable.g1,"Birthday gift","Trevor Hansen","-Britta Holt"));
        arrcontact.add(new contact(R.drawable.g2,"Recipe to try","britta Holt","-We should eat this"));
        arrcontact.add(new contact(R.drawable.g3,"Giants game","David park","-Any intrest in seeing"));
        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrcontact);
        r1.setAdapter(adapter);


    }
}