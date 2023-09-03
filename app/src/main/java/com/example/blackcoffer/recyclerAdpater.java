package com.example.blackcoffer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class recyclerAdpater extends RecyclerView.Adapter<recyclerAdpater.ViewHolder> {
    Context context;
    ArrayList<model> arr = new ArrayList<model>();

   public recyclerAdpater(Context context,ArrayList<model> arr){
        this.context = context;
        this.arr = arr;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v =  LayoutInflater.from(context).inflate(R.layout.card,parent,false);
       ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.img.setImageResource(arr.get(position).img);
       holder.name.setText(arr.get(position).name);
       holder.subName.setText(arr.get(position).subname);


    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView name,subName;
       ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.marphy1);
            subName = itemView.findViewById(R.id.marp1);
            img = itemView.findViewById(R.id.img);




        }
    }
}
