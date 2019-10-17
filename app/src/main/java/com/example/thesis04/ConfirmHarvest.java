//package com.example.thesis04;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.util.DisplayMetrics;
//import android.view.Gravity;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowManager;
//import android.widget.Button;
//
//public class ConfirmHarvest extends Activity {
//
//    Button btn_close;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_confirm_harvest);
//
//        btn_close = findViewById(R.id.btn_no);
//        btn_close.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
//
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//
//        int width = dm.widthPixels;
//        int height = dm.heightPixels;
//
//        getWindow().setLayout((width),(height));
//
//        WindowManager.LayoutParams params = getWindow().getAttributes();
//        params.gravity = Gravity.CENTER;
//        params.x = 0;
//        params.y = 0;
//
//        getWindow().setAttributes(params);
////        Window window = this.getWindow();
////        window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
////                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
//    }
//}
