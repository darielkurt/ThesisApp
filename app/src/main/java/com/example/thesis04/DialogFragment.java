package com.example.thesis04;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

    private static final String TAG = "DialogFragment";

    private TextView mActionYes, mActionNo,confirmation;
    private static int flowframeNum = 0;
    private static String CMD =  null;
    private PrintWriter output;
    private BufferedReader input;
    Socket socket;

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
//                socket = new Socket("192.168.0.1",1755);
//                DataOutputStream DOS = new DataOutputStream(socket.getOutputStream());
//                DOS.writeUTF(CMD);
//                socket.close();
//                HarvestCommand.Socket_AsyncTask cmd_servo = new HarvestCommand.Socket_AsyncTask();
//                cmd_servo.execute();
                Log.d(TAG,"Harvesting...");
                Toast.makeText(getActivity(),"Harvesting...", Toast.LENGTH_SHORT).show();
                getDialog().dismiss();
        }
        });
        return view;
    }

    public void MSetText(int num){
        flowframeNum = num;
    } }
//
//    public static class Socket_AsyncTask extends AsyncTask<Void,Void,Void>
//    {
//        Socket socket;
//
//        @Override
//        protected Void doInBackground(Void... params){
//            try{
//                socket = new java.net.Socket("192.168.40.10",8080);
//                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//                dataOutputStream.writeUTF(CMD);
//                dataOutputStream.close();
//                socket.close();
//            } catch (IOException e){e.printStackTrace();}
//            return null;
//        }
//    }
//
//    public static class MessageSender extends AsyncTask<String,Void,Void>
//    {
//        Socket socket;
//        DataOutputStream dataOutputStream;
//        PrintWriter printWriter;
//
//        @Override
//        protected Void doInBackground(String... voids){
//            try{
//                socket = new Socket("192.168.40.10",8080);
//                printWriter
//                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//                dataOutputStream.writeUTF(CMD);
//                dataOutputStream.close();
//                socket.close();
//            } catch (IOException e){e.printStackTrace();}
//            return null;
//        }
//    }

//        public void run() {
//            output.write(message);
//            output.flush();
//            runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    tvMessages.append("client: " + message + "\n");
//                    etMessage.setText("");
//                }
//            });
//        }

