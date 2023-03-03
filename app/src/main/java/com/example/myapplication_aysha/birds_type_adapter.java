package com.example.myapplication_aysha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class birds_type_adapter extends RecyclerView.Adapter<birds_type_adapter.ViewHolder> {
    Context mycontext;
    ArrayList<Object> model;

    public birds_type_adapter(Context mycontext, ArrayList<Object> model) {
        this.mycontext = mycontext;
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview = LayoutInflater.from(mycontext).inflate(R.layout.home_recyclerview_layout,null,true);
        return new ViewHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Birds_type_model model2 = (Birds_type_model) model.get(position);
       holder.img.setImageResource(model2.img);
       holder.name.setText(model2.name);
       holder.scname.setText(model2.scname);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name,scname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.type_logo);
            name= itemView.findViewById(R.id.type_name);
            scname= itemView.findViewById(R.id.Sub_type);

        }
    }
}
