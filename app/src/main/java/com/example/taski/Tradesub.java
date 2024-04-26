package com.example.taski;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

public class Tradesub extends RecyclerView.Adapter<Tradesub.ViewHolder>
{
    RecyclerView r2;
    Context context;
    ArrayList<Tradeitem> t1;
    Tradesub(Context context,ArrayList<Tradeitem> t1)
    {
        this.context=context;
        this.t1=t1;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.trade_design, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(t1.get(position).img);
        holder.t1.setText(t1.get(position).s1);
        holder.t2.setText(t1.get(position).s2);
        holder.t3.setText(t1.get(position).s3);

        holder.t4.setText(t1.get(position).s4);

        holder.t5.setText(t1.get(position).s5);



    }

    @Override
    public int getItemCount() {
        return t1.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2,t3,t4,t5;
        ImageView img,img1,img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.im1);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            t3=itemView.findViewById(R.id.t3);

            t4=itemView.findViewById(R.id.t4);

            t5=itemView.findViewById(R.id.t5);


        }
    }
}
