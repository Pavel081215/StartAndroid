package com.startandroid.p0191_simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1;
    private EditText editText2;

    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private String oper;

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.etNum1);
        editText2 = (EditText) findViewById(R.id.etNum2);
        buttonPlus = (Button) findViewById(R.id.btnAdd);
        buttonMinus = (Button) findViewById(R.id.btnSub);
        buttonDivide = (Button) findViewById(R.id.btnDiv);
        buttonMultiply = (Button) findViewById(R.id.btnMult);

        tvResult = (TextView) findViewById(R.id.tvResult);

        buttonMultiply.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Reset");
        menu.add(0, 2, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                editText2.setText("");
                editText1.setText("");
                tvResult.setText("");
                break;
            case 2:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        Boolean test = true;

        if (TextUtils.isEmpty(editText1.getText().toString()) || TextUtils.isEmpty(editText2.getText().toString())) {
            Toast.makeText(this, "Введите коректно ", Toast.LENGTH_SHORT).show();
        } else {
            num1 = Float.parseFloat(editText1.getText().toString());
            num2 = Float.parseFloat(editText2.getText().toString());

            switch (v.getId()) {
                case R.id.btnAdd:
                    result = num1 + num2;
                    oper = "+";
                    break;
                case R.id.btnDiv:
                    if (num2 == 0) {
                        Toast.makeText(this, "На ноль делить нельзя", Toast.LENGTH_SHORT).show();
                        test = false;
                    } else {
                        result = num1 / num2;
                        oper = "/";

                    }
                    break;
                case R.id.btnMult:
                    result = num1 * num2;
                    oper = "*";
                    break;
                case R.id.btnSub:
                    result = num1 - num2;
                    oper = "-";
                    break;
                default:
                    break;
            }
            if (test) {
                tvResult.setText(num1 + oper + num2 + "=" + result);
            } else {
                tvResult.setText("На ноль делить нельзя");
            }

        }

    }
}
