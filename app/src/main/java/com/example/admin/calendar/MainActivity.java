package com.example.admin.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendar = Calendar.getInstance();
        long gio = calendar.get(Calendar.HOUR_OF_DAY);
        long phut = calendar.get(Calendar.MINUTE);
        long giay = calendar.get(Calendar.SECOND);
        long ngay = calendar.get(Calendar.DAY_OF_YEAR);
//        Log.d("BBB",ngay + "");
        Date tgianhientai = calendar.getTime();
        long time = System.currentTimeMillis();
//        Log.d("BBB","Gio " + gio + " Phut " + phut + " Giay " + giay);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-y");
        String tgian = simpleDateFormat.format(time);
        Log.d("BBB",tgian + "");

    }
}
