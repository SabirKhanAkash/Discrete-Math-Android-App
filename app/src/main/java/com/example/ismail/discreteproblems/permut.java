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

public class permut extends AppCompatActivity implements OnClickListener {
    private EditText e1,e2;
    private Button b1;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permut);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        e1 = (EditText) findViewById(R.id.np);
        e2 = (EditText) findViewById(R.id.rp);

        b1 = (Button) findViewById(R.id.nprbutton);
        t1 = (TextView) findViewById(R.id.npr);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = e1.getText().toString();
        String num2 = e2.getText().toString();

        if(v.getId() == R.id.nprbutton) {
            if (num1.length() == 0 || num2.length() == 0)
                Toast.makeText(this, "Please Enter the Values", Toast.LENGTH_SHORT).show();
            else {
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                t1.setText("The P(" + n1 + "," + n2 + ") is: " + p(n1, n2));
            }
        }
    }

    int fact(int n)
    {
        if(n <= 1 && n>=0)
            return 1;
        return n*fact(n-1);
    }

    int p(int n, int r)
    {
        int x = n - r;
        return fact(n)/fact(x);
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
