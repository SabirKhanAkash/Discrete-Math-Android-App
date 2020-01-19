package com.example.ismail.discreteproblems;

import android.content.Intent;
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

public class ORtt extends AppCompatActivity implements OnClickListener{
    private EditText e1;
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortt);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        e1 = (EditText) findViewById(R.id.ortt);
        b = (Button) findViewById(R.id.orttbutton);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = e1.getText().toString();

        if(num1.length() == 0)
            Toast.makeText(this,"Please Enter a Value",Toast.LENGTH_SHORT).show();

        else {
            int n1 = Integer.parseInt(num1);
            if (n1 == 2) {
                Intent andintent = new Intent(this, ORpdf2.class);
                startActivity(andintent);
            } else if (n1 == 3) {
                Intent andintent2 = new Intent(this, ORpdf3.class);
                startActivity(andintent2);
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
