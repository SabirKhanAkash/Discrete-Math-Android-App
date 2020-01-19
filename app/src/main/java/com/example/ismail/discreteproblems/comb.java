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

public class comb extends AppCompatActivity implements OnClickListener {
    private EditText e1,e2;
    private Button b1;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comb);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        e1 = (EditText) findViewById(R.id.nc);
        e2 = (EditText) findViewById(R.id.rc);

        b1 = (Button) findViewById(R.id.ncrbutton);
        t1 = (TextView) findViewById(R.id.ncr);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = e1.getText().toString();
        String num2 = e2.getText().toString();
            if (num1.length() == 0 || num2.length() == 0)
                Toast.makeText(this, "Please Enter the Values", Toast.LENGTH_SHORT).show();

            else {
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                if (n1 > 0 && n2 > 0)
                    t1.setText("The C(" + n1 + "," + n2 + ") is: " + c(n1, n2));
        }
    }

    int fact(int n)
    {
        if(n <= 1 && n>=0)
            return 1;
        return n*fact(n-1);
    }

    int c(int n, int r)
    {
        int x = n-r;
        return fact(n)/(fact(r)*fact(x));
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
