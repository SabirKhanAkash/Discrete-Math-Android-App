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

import java.util.ArrayList;

public class tpn extends AppCompatActivity implements OnClickListener {
    private TextView textview;
    private EditText editText;
    private Button button;
    ArrayList<String> result = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpn);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = (TextView) findViewById(R.id.tpntext);
        button = (Button) findViewById(R.id.tpnbutton);
        editText = (EditText) findViewById(R.id.tpn);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number = editText.getText().toString();
        if (number.length() == 0)
            Toast.makeText(this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
        else {
            int num = Integer.parseInt(number);

            if (v.getId() == R.id.tpnbutton) {
                ArrayList<String> r = new ArrayList<>();
                r = printTwinPrime(num);
                textview.setText("The twin prime pairs between 1 to " + num + " is:" + "\n" + r);
            }
        }
    }

    ArrayList<String> printTwinPrime(int n)
    {
        boolean prime[] = new boolean[n + 1];

        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n - 2; i++) {
            if (prime[i] == true && prime[i + 2] == true)
            {
                result.add("(");
                result.add(String.valueOf(i));
                result.add(String.valueOf(i+2));
                result.add(")");
            }
        }
        return result;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
