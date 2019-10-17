package com.example.thesis04;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DashboardFragment extends Fragment {

    Button confirmHarvestFrame1;
    Button confirmHarvestFrame2;
    Button confirmHarvestFrame3;
    Button confirmHarvestFrame4;
    Button confirmHarvestFrame5;
    Button confirmHarvestFrame6;
    Button confirmHarvestFrame7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dashboard,container,false);
    }
}
