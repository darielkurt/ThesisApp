package com.example.thesis04;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

    private static final String TAG = "DialogFragment";

    private TextView mActionYes, mActionNo,confirmation;
    private static int flowframeNum = 0;
    private static String CMD =  null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_confirm_harvest,container,false);
        confirmation = view.findViewById(R.id.confirmMsg);
        mActionYes = view.findViewById(R.id.yesBtn);
        mActionNo = view.findViewById(R.id.noBtn);
        getDialog().getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        if (flowframeNum == 8){
            confirmation.setText("Are you sure\nyou want to harvest\nall the FlowFrames?");
        }else
            confirmation.setText("Are you sure\nyou want to harvest\nFlowFrame " + flowframeNum +"?");
        mActionNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
        mActionYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CMD = "HARV + " + flowframeNum;
                HarvestCommand.Socket_AsyncTask cmd_servo = new HarvestCommand.Socket_AsyncTask();
                cmd_servo.execute();
                Log.d(TAG,"Harvesting...");
            }
        });
        return view;
    }

    public void MSetText(int num){
        flowframeNum = num;
    }

    public static class Socket_AsyncTask extends AsyncTask<Void,Void,Void>
    {
        Socket socket;

        @Override
        protected Void doInBackground(Void... params){
            try{
                socket = new java.net.Socket("192.168.40.10",12345);
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeBytes(CMD);
                dataOutputStream.close();
                socket.close();
            } catch (IOException e){e.printStackTrace();}
            return null;
        }
    }
}
