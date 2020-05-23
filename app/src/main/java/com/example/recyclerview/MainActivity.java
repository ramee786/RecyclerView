package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RameeAdapter rameeAdapter;
    List<String> heading;
    List<String> description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        heading=new ArrayList<>();
        description=new ArrayList<>();
        heading.add("Heading 1");
        heading.add("Heading 2");
        heading.add("Heading 3");
        heading.add("Heading 4");
        heading.add("Heading 5");
        heading.add("Heading 6");
        heading.add("Heading 7");
        heading.add("Heading 8");
        heading.add("Heading 9");
        heading.add("Heading 10");

        description.add("This is descrip 1");
        description.add("This is descrip 2");
        description.add("This is descrip 3");
        description.add("This is descrip 4");
        description.add("This is descrip 5");
        description.add("This is descrip 6");
        description.add("This is descrip 7");
        description.add("This is descrip 8");
        description.add("This is descrip 9");
        description.add("This is descrip 10");


        RecyclerView.LayoutManager mLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        rameeAdapter =new RameeAdapter(heading,description);
        recyclerView.setAdapter(rameeAdapter);
    }
}
