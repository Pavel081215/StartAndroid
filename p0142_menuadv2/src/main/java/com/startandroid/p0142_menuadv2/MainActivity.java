package com.startandroid.p0142_menuadv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setOnClickListener(this);
        textView.setText("Короткое меню");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        menu.add(1, 1, 0, "add");

        menu.add(3, 1, 0, "send");
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public void onClick(View v) {
        if (checkBox.isChecked()) {
            textView.setText("Полное меню");

        } else {
            textView.setText("Короткое меню");

        }

    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(0, checkBox.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item1:
                Toast.makeText(this, "item1", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_item2:
                Toast.makeText(this, "item2", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "item3", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "item4", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_item5:
                Toast.makeText(this, "item5", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item6:
                Toast.makeText(this, "item6", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item7:
                Toast.makeText(this, "item7", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item8:
                Toast.makeText(this, "item8", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
