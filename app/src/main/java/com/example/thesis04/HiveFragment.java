package com.example.thesis04;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HiveFragment extends Fragment {

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    TextView confirmation;
    ImageButton mHarvesetAll;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.new_hive,container,false);
        View v = inflater.inflate(R.layout.activity_confirm_harvest,container,false);
        button1 = view.findViewById(R.id.imageButton1);
        button2 = view.findViewById(R.id.imageButton2);
        button3 = view.findViewById(R.id.imageButton3);
        button4 = view.findViewById(R.id.imageButton4);
        button5 = view.findViewById(R.id.imageButton5);
        button6 = view.findViewById(R.id.imageButton6);
        button7 = view.findViewById(R.id.imageButton7);
        mHarvesetAll = view.findViewById(R.id.harvest_all);
        confirmation = v.findViewById(R.id.confirmMsg);

        mHarvesetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(8);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DialogFragment();
                dialog.show(getFragmentManager(), "Confirm Dialog");
                dialog.MSetText(7);
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
