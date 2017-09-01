package com.startandroid.p0261_intentfilter;

import java.sql.Date;
import java.text.SimpleDateFormat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTime extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        String time = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvTime = (TextView) findViewById(R.id.tvTime);
        tvTime.setText(time);
    }
//
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//        String date = sdf.format(new Date(System.currentTimeMillis()));
//
//        TextView tvDate = (TextView) findViewById(R.id.tvDate);
//        tvDate.setText(date);
//    }
}