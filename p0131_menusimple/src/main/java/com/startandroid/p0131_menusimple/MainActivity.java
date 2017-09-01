package com.startandroid.p0131_menusimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main  );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("menu1");
        menu.add("menu2");
        menu.add("menu3");

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_cat1:
                Toast.makeText(this, "Первый экран", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_cat2:
                Toast.makeText(this, "Second screen", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cat3:
                Toast.makeText(this, "Third screen", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
