package com.startandroid.p0121_logandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    private static final String TAG = "My log(29/08/17)";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы
        Log.i(TAG,"найдем View-элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        // присваиваем обработчик кнопкам
        Log.e(TAG,"присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG,"по id определяем кнопку, вызвавшую этот обработчик");
        // по id определяем кнопку, вызвавшую этот обработчик
        switch (v.getId()) {
            case R.id.btnOk:
                Log.e(TAG,"кнопка ОК");
                // кнопка ОК
                tvOut.setText("Нажата кнопка ОК");
                Toast.makeText(this,"кнопка Cancel",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                Log.w(TAG,"кнопка Cancel");
                // кнопка Cancel
                tvOut.setText("Нажата кнопка Cancel");
                Toast.makeText(this,"Нажата кнопка Cancel",Toast.LENGTH_LONG).show();
                break;
        }
    }

}
