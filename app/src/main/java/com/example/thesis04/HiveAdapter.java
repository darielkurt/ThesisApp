package com.example.thesis04;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HiveAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hive_item,parent,false);
        return new HiveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((HiveViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return HiveData.title.length;
    }

    private class HiveViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mHiveText;
        private ImageView mHiveImage;

        public HiveViewHolder(View hiveView){

            super(hiveView);
            mHiveText = itemView.findViewById(R.id.hiveText);
            mHiveImage = itemView.findViewById(R.id.hiveImage);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position){
            mHiveText.setText(HiveData.title[position]);
            mHiveImage.setImageResource(HiveData.picturePath[position]);
        }

        public void onClick(View view) {

        }

    }
}
