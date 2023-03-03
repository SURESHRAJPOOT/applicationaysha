package com.example.myapplication_aysha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView Birds_type, Birds_name;
    ArrayList<Birds_type_model> birds_type_models;
    ArrayList<Birds_name_model>birds_name_models;
    birds_type_adapter Birds_type_adapter;
    birds_name_adapter Birds_name_adapter;

    LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Birds_type = findViewById(R.id.type1_recyclerview);

        ArrayList<Object> Birds_type_model = new ArrayList<>();
        Birds_type_model.add(new Birds_type_model(R.drawable.owl,"type_1","sc_owl"));
        Birds_type_model.add(new Birds_type_model(R.drawable.owl,"type_2","sc_owl"));
        Birds_type_model.add(new Birds_type_model(R.drawable.owl,"type_3","sc_owl"));
        Birds_type_model.add(new Birds_type_model(R.drawable.owl,"type_4","sc_owl"));
        birds_type_adapter birds_type_adapter = new birds_type_adapter(this, Birds_type_model);
    manager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
    Birds_type.setAdapter(birds_type_adapter);
    Birds_type.setLayoutManager(manager);


        Birds_type = findViewById(R.id.type1_recyclerview);

        ArrayList<Object> Birds_name_model = new ArrayList<>();
        Birds_name_model.add(new Birds_name_model(R.drawable.owl,"bird_name1","sc_name"));
        Birds_name_model.add(new Birds_name_model(R.drawable.owl,"bird_name_2","sc_name"));
        Birds_name_model.add(new Birds_name_model(R.drawable.owl,"bird_3","sc_name"));
        Birds_name_model.add(new Birds_name_model(R.drawable.owl,"bird_4","sc_name"));
        Birds_name_adapter = new birds_name_adapter(this, Birds_name_model);
        manager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        RecyclerView.Adapter birds_name_adapter = null;
        Birds_name.setAdapter(birds_name_adapter);
        Birds_name.setLayoutManager(manager);

    }
}