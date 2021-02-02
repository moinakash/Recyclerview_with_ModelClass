package com.example.recyclerview_with_modelclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Memories_modelCLass> Memories_list;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.idRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        searchView = (SearchView) findViewById(R.id.searchmain);

        Memories_list = new ArrayList<>();

     /*   for (int i = 0; i<=10; i++){

            Memories_list.add(new Memories_modelCLass(R.drawable.ic_launcher_background,"Mashrafee Bin Murtaza","Cox's Bazar Tour",
                    ">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been they text ever since the 1500s ..... See More",
                    R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                    "12 Likes","5 Comments","2 Shares"));
        }*/


        Memories_list.add(new Memories_modelCLass(R.drawable.mash,"Mashrafee Bin Murtaza","Cox's Bazar Tour",
                ">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been they text ever since the 1500s ..... See More",
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                "12 Likes","5 Comments","2 Shares"));

        Memories_list.add(new Memories_modelCLass(R.drawable.shakib,"Shakib Al Hasan","Cox's Bazar Tour",
                ">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been they text ever since the 1500s ..... See More",
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                "12 Likes","5 Comments","2 Shares"));

        Memories_list.add(new Memories_modelCLass(R.drawable.mushi,"Mushfiqur Rahman","Cox's Bazar Tour",
                ">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been they text ever since the 1500s ..... See More",
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                "12 Likes","5 Comments","2 Shares"));

        Memories_list.add(new Memories_modelCLass(R.drawable.mahmudul,"Mahmudullah Riyad","Cox's Bazar Tour",
                ">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been they text ever since the 1500s ..... See More",
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                "12 Likes","5 Comments","2 Shares"));

        Memories_list.add(new Memories_modelCLass(R.drawable.sabbir,"Sabbir Rahman","Cox's Bazar Tour",
                ">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been they text ever since the 1500s ..... See More",
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                "12 Likes","5 Comments","2 Shares"));

        adapter = new MemoriesAdapter(Memories_list,this);

        recyclerView.setAdapter(adapter);


        searchView.setOnQueryTextListener( new SearchView.OnQueryTextListener() {


            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<Memories_modelCLass> templist = new ArrayList<>(  );

                for(Memories_modelCLass temp : Memories_list)
                {
                    if (temp.getProfile_Name().toLowerCase().contains( newText.toLowerCase() ))
                    { templist.add( temp ); }
                }


                   /* CustomListAdapter adapter = new CustomListAdapter(
                            getApplicationContext(), R.layout.custom_list_layout, templist
                    );
                    lv.setAdapter(adapter);*/

                 adapter = new MemoriesAdapter(
                         templist,MainActivity.this
                );
                recyclerView.setAdapter(adapter);


                return true;
            }


            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

        } );



    }
}