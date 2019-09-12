package com.example.thesis04;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HiveFragment extends Fragment {

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.new_hive,container,false);
        button1 = view.findViewById(R.id.imageButton1);
        button2 = view.findViewById(R.id.imageButton2);
        button3 = view.findViewById(R.id.imageButton3);
        button4 = view.findViewById(R.id.imageButton4);
        button5 = view.findViewById(R.id.imageButton5);
        button6 = view.findViewById(R.id.imageButton6);
        button7 = view.findViewById(R.id.imageButton7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(),ConfirmHarvest.class);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(),ConfirmHarvest.class);
                startActivity(i);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(),ConfirmHarvest.class);
                startActivity(i);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(),ConfirmHarvest.class);
                startActivity(i);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(),ConfirmHarvest.class);
                startActivity(i);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(),ConfirmHarvest.class);
                startActivity(i);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(),ConfirmHarvest.class);
                startActivity(i);
            }
        });

        return view;

//        View view = inflater.inflate(R.layout.fragment_hive,container,false);

//        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hiveRecyclerView);
//
//        HiveAdapter hiveAdapter = new HiveAdapter();
//        recyclerView.setAdapter(hiveAdapter);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
//
//        return view;
    }
}
