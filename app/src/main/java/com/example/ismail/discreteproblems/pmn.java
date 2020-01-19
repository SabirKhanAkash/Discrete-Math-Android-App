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

public class pmn extends AppCompatActivity implements OnClickListener {
    private EditText editText1,editText2;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmn);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText1 = (EditText) findViewById(R.id.number1);
        editText2 = (EditText) findViewById(R.id.number2);
        button = (Button) findViewById(R.id.pmn);
        textView = (TextView) findViewById(R.id.pmntext);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();

        if(v.getId() == R.id.pmn) {
            if (number1.length() == 0 || number2.length() == 0)
                Toast.makeText(this, "Please Enter the Values", Toast.LENGTH_SHORT).show();
            else
                {
                ArrayList<String> result = new ArrayList<>();

                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);
                int temp;
                if(num1>num2)
                {
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                }

                int i,j,k,l = 0;
                int[] array = new int[10000000];
                for (i = num1; i < num2; i++) {
                    for (j = 2; j < i; j++) {
                        if (i % j == 0)
                            break;
                    }
                    if (i == j && !result.contains(i)) {
                        array[l] = i;
                        result.add(String.valueOf(i));
                        Log.d("num: ", String.valueOf(array[l]));
                        l++;
                    }
                }
                textView.setText("The primes between " + num1 + " and " + num2 + " are: " + result);
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
