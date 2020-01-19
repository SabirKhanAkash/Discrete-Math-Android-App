package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.security.PrivateKey;

public class pcheck extends AppCompatActivity implements OnClickListener {
    private EditText et1;
    private Button bt;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcheck);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et1 = (EditText) findViewById(R.id.pcheckid);
        bt = (Button) findViewById(R.id.pcheckbutton);
        res = (TextView) findViewById(R.id.pcheck);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.pcheckbutton) {
            String number = et1.getText().toString();
            if (number.length() == 0)
                Toast.makeText(this, "Please Enter a Value", Toast.LENGTH_SHORT).show();

            else {
                int num = Integer.parseInt(number);
                if (isprime(num) == true) {
                    res.setText(num + " is a Prime number");
                } else
                    res.setText(num + " is not a Prime number");
            }
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
