//package com.example.thesis04;
//
//import android.os.AsyncTask;
//
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class HarvestCommand extends AsyncTask<Void,Void,Void> {
//
//    Socket socket;
//    DataOutputStream dataOutputStream;
//    PrintWriter printWriter;
//
//    @Override
//    protected Void doInBackground(Void... voids) {
//
//        try{
//            socket = new Socket("192.1680.38",7800);
//            printWriter = new PrintWriter(socket.getOutputStream());
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//}

package com.example.thesis04;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class HarvestCommand extends AppCompatActivity {

    Button btnUp;
    TextView yesButton,noButton;
    Button btnDown;
    EditText txtAddress;
    Socket myAppSocket = null;
    public static String wifiModuleIp = "";
    public static int wifiModulePort = 0;
    public static String CMD = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesButton = findViewById(R.id.yesBtn);
        noButton = findViewById(R.id.noBtn);

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getIPandPort();
                CMD = "Up";
                Socket_AsyncTask cmd_servo = new Socket_AsyncTask();
                cmd_servo.execute();
            }
        });
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getIPandPort();
                CMD = "Down";
                Socket_AsyncTask cmd_increase_servo = new Socket_AsyncTask();
                cmd_increase_servo.execute();
            }
        });

    }
    public void getIPandPort()
    {
        String iPandPort = txtAddress.getText().toString();
        Log.d("MYTEST","IP String: "+ iPandPort);
        String temp[]= iPandPort.split(":");
        wifiModuleIp = temp[0];
        wifiModulePort = Integer.valueOf(temp[1]);
        Log.d("MY TEST","IP:" +wifiModuleIp);
        Log.d("MY TEST","PORT:"+wifiModulePort);
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
            }catch (UnknownHostException e){e.printStackTrace();}
            catch (IOException e){e.printStackTrace();}
            return null;
        }
    }
}