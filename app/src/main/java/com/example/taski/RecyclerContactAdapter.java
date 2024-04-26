package com.example.taski;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<contact> arrcontact;
    RecyclerContactAdapter(Context context, ArrayList<contact> arrcontact) {
        this.context = context;
        this.arrcontact = arrcontact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.img.setImageResource(arrcontact.get(position).img);
       holder.txname.setText(arrcontact.get(position).name);
        holder.s1.setText(arrcontact.get(position).s1);
        holder.s2.setText(arrcontact.get(position).s2);
    }


    @Override
    public int getItemCount() {
        return arrcontact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txname,s1,s2;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txname = itemView.findViewById(R.id.text);
            img = itemView.findViewById(R.id.imageView);
            s1 = itemView.findViewById(R.id.m1);
            s2 = itemView.findViewById(R.id.mostinner);
        }
    }
}
