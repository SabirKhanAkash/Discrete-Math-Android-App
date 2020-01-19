package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.*;

public class lcm extends AppCompatActivity implements OnClickListener {
    private EditText et1,et2;
    private TextView tv;
    private Button lcmButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcm);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et1 = (EditText) findViewById(R.id.lcm1);
        et2 = (EditText) findViewById(R.id.lcm2);

        tv = (TextView) findViewById(R.id.lcm);
        lcmButton = (Button) findViewById(R.id.lcmbutton);

        lcmButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();

        int r,x,y;

        if(v.getId() == R.id.lcmbutton) {
            if (num1.length() == 0 || num2.length() == 0)
                Toast.makeText(this, "Please Enter the Values", Toast.LENGTH_SHORT).show();
            else {
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                x = n1;
                y = n2;
                while (y != 0) {
                    r = x % y;
                    x = y;
                    y = r;
                }
                int result = (n1 * n2) / x;
                tv.setText("The LCM of " + n1 + " and " + n2 + " is: " + result);
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
