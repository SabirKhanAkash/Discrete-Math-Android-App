package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class fib extends AppCompatActivity implements OnClickListener {
    private EditText e1;
    private Button b;
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fib);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        e1 = (EditText) findViewById(R.id.fib);
        b = (Button) findViewById(R.id.fibbutton);
        t = (TextView) findViewById(R.id.fibtext);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = e1.getText().toString();
        if(v.getId() == R.id.fibbutton)
        {
            if(num1.length() == 0)
                Toast.makeText(this,"Please Enter a Value",Toast.LENGTH_SHORT).show();
            else {
                ArrayList<String> result = new ArrayList<>();
                int n1 = Integer.parseInt(num1);
                long[] fib = new long[10000];
                long x=0,y=1,a,b;

                fib[0] = x;
                fib[1] = y;
                result.add(String.valueOf(x));
                for(long i=0,k=2 ; k<=n1 ; i++)
                {
                    a = x + y;
                    fib[(int) k++] = a;
                    result.add(String.valueOf(a));
                    y = x;
                    x = a;
                }
                t.setText("The " + n1 + "th fibonacci Sequence is: " + result);
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
