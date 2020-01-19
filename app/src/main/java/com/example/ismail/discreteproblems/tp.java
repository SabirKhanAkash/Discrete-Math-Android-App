package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import static java.lang.Math.abs;

public class tp extends AppCompatActivity implements OnClickListener {
    private TextView textView;
    private Button button;
    private EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText1 = (EditText) findViewById(R.id.tpn1);
        editText2 = (EditText) findViewById(R.id.tpn2);
        button = (Button) findViewById(R.id.tpbutton);
        textView = (TextView) findViewById(R.id.tptext);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();

        if(number1.length() == 0 || number2.length() == 0)
            Toast.makeText(this,"Please Enter the Values",Toast.LENGTH_SHORT).show();
        else {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            int diff = abs(num1 - num2);
            if (isprime(diff) == true && isprime(num1) == true && isprime(num2) == true) {
                textView.setText(num1 + " and " + num2 + " are twin primes");
            }
            if (isprime(diff) == false && (isprime(num1) == true && isprime(num2) == true))
                textView.setText(num1 + " and " + num2 + " are not twin primes");
            if (isprime(num1) == false && isprime(num2) == false)
                textView.setText("Both " + num1 + " and " + num2 + " are not prime");
            else if (isprime(num1) == false)
                textView.setText(num1 + " is not a prime");
            else if (isprime(num2) == false)
                textView.setText(num2 + " is not a prime");

        }
    }
    boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2; i<n; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
