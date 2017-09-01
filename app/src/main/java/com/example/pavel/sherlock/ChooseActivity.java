package com.example.pavel.sherlock;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sherlock);
    }

    public final static String THIEF = "THIEF";


    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();

        switch (v.getId()) {
            case R.id.radioDog:
                answerIntent.putExtra(THIEF, "Сраный пёсик");
                break;
            case R.id.radioCrow:
                answerIntent.putExtra(THIEF, "Ворона");
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Кот Васька");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }


}
