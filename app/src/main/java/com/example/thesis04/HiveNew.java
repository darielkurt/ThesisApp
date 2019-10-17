package com.example.thesis04;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class HiveNew extends AppCompatActivity {
//    private RecyclerView mRecyclerView;
//    private ExampleAdapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//    Button harvestButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.hivelayout);
//
//        ArrayList<ExampleItem> exampleList = new ArrayList<>();
//        exampleList.add(new ExampleItem(R.drawable.flowframe1, "FLOWFRAME 1", "Stats",R.drawable.ic_archive_black_24dp));
//        exampleList.add(new ExampleItem(R.drawable.flowframe2, "FLOWFRAME 2", "Stats",R.drawable.ic_archive_black_24dp));
//        exampleList.add(new ExampleItem(R.drawable.flowframe3, "FLOWFRAME 3", "Stats",R.drawable.ic_archive_black_24dp));
//        exampleList.add(new ExampleItem(R.drawable.flowframe4, "FLOWFRAME 4", "Stats",R.drawable.ic_archive_black_24dp));
//        exampleList.add(new ExampleItem(R.drawable.flowframe5, "FLOWFRAME 5", "Stats",R.drawable.ic_archive_black_24dp));
//        exampleList.add(new ExampleItem(R.drawable.flowframe6, "FLOWFRAME 6", "Stats",R.drawable.ic_archive_black_24dp));
//
//        mRecyclerView = findViewById(R.id.recyclerView);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
//        mAdapter = new ExampleAdapter(exampleList);
//
//        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                mExampleList.get(position);
//            }
//        });
//
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mRecyclerView.setAdapter(mAdapter);
//
//        harvestButton = findViewById(R.id.harvestButton);
//
//        harvestButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent i = new Intent(getApplicationContext(), ConfirmHarvest.class);
//                startActivity(i);
//            }
//        });
//    }
//}

//public class HiveNew extends Fragment {
//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//
//        View view = inflater.inflate(R.layout.hivelayout,container,false);
//
//        ArrayList<ExampleItem> exampleList = new ArrayList<>();
//        exampleList.add(new ExampleItem(R.drawable.flowframe1, "FLOWFRAME 1", "Stats"));
//        exampleList.add(new ExampleItem(R.drawable.flowframe2, "FLOWFRAME 2", "Stats"));
//        exampleList.add(new ExampleItem(R.drawable.flowframe3, "FLOWFRAME 3", "Stats"));
//        exampleList.add(new ExampleItem(R.drawable.flowframe4, "FLOWFRAME 4", "Stats"));
//        exampleList.add(new ExampleItem(R.drawable.flowframe5, "FLOWFRAME 5", "Stats"));
//        exampleList.add(new ExampleItem(R.drawable.flowframe6, "FLOWFRAME 6", "Stats"));
//
//
//        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
//        mAdapter = new ExampleAdapter(exampleList);
//
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mRecyclerView.setAdapter(mAdapter);
//
//        return view;
//    }
//}