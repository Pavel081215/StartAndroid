package com.startandroid.p0271_getintentaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Pavel on 01.09.2017.
 */

public class Info extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        Intent intent = getIntent();
        String info = intent.getAction();
        String format = "", textInfo = "";

        if (info.equals("com.startandroid.p0261_intentfilter.Show_time")) {
            format = "HH:mm:ss";
            textInfo = "Time: ";
        } else {
            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateTime = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = (TextView) findViewById(R.id.tvInfo);
        tvDate.setText(textInfo + dateTime);
    }
}
