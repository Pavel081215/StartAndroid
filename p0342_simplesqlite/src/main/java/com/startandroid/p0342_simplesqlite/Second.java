package com.startandroid.p0342_simplesqlite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



/**
 * Created by Pavel on 03.09.2017.
 */

public class Second extends Activity implements View.OnClickListener {

    private TextView iD, name, email;
    private Button comeBack;
    final String TAG = "TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Log.i(TAG," onCreate Second extends Activity");

        iD = (TextView) findViewById(R.id.textViewId);
        name = (TextView) findViewById(R.id.textViewName);
        email = (TextView) findViewById(R.id.textViewEmail);
        comeBack = (Button) findViewById(R.id.button);
        comeBack.setOnClickListener(this);
        Intent intent = getIntent();
        String g = intent.getStringExtra("ID");
        Log.i(TAG," ID =" + g);
        iD.setText(g+"  ");

        name.setText(intent.getStringExtra("Name"));
        email.setText(intent.getStringExtra("Email"));


    }

    @Override
    public void onClick(View v) {

        Intent intentClick = new Intent(this, MainActivity.class);

        startActivity(intentClick);


    }
}
