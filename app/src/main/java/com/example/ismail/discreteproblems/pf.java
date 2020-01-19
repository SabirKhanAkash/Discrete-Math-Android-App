package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class pf extends AppCompatActivity implements OnClickListener{
    private EditText editText;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pf);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText = (EditText) findViewById(R.id.n1);
        button = (Button) findViewById(R.id.pfbutton);
        textView = (TextView) findViewById(R.id.pftext);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number1 = editText.getText().toString();


        if(v.getId() == R.id.pfbutton) {
            if (number1.length() == 0)
                Toast.makeText(this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
            else {
                ArrayList<String> result = new ArrayList<>();
                int num1 = Integer.parseInt(number1);
                int x = num1;
                int[] array = new int[100000];
                int divisor1 = 2, i = 0, cPF1 = 0;
                while (num1 > 1) {
                    while (num1 % divisor1 == 0) {
                        cPF1++;
                        array[i++] = divisor1;
                        result.add(String.valueOf(divisor1));
                        Log.d("num: ", String.valueOf(array[i]));
                        num1 = num1 / divisor1;
                    }
                    divisor1++;
                }
                textView.setText("The prime facorization of " + x + " is: " + result);
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
