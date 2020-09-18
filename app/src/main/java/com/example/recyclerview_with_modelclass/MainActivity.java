package com.example.recyclerview_with_modelclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Memories_modelCLass> Memories_list;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.idRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        Memories_list = new ArrayList<>();

        for (int i = 0; i<=10; i++){

            Memories_list.add(new Memories_modelCLass(R.drawable.ic_launcher_background,"Mashrafee Bin Murtaza","Cox's Bazar Tour",
                    ">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been they text ever since the 1500s ..... See More",
                    R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                    "12 Likes","5 Comments","2 Shares"));
        }

        adapter = new MemoriesAdapter(Memories_list,this);

        recyclerView.setAdapter(adapter);
    }
}