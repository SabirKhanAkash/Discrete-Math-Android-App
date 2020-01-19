package com.example.ismail.discreteproblems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class gf extends AppCompatActivity implements OnClickListener {
    private EditText editText1,editText2;
    private Button button1,button2;
    private ImageView imageView;

    int onto = R.drawable.onto;
    int onetoone = R.drawable.onetoone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gf);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText1 = (EditText) findViewById(R.id.dom);
        editText2 = (EditText) findViewById(R.id.codom);
        button1 = (Button) findViewById(R.id.onto);
        button2 = (Button) findViewById(R.id.onetoone);
        imageView = (ImageView) findViewById(R.id.fd);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();

        if (view.getId() == R.id.onto) {
            if (number1.length() == 0 || number2.length() == 0)
                Toast.makeText(this, "Please Enter valid Values", Toast.LENGTH_SHORT).show();
            else if(number1.equals("A,B,C,D,E"))
                imageView.setImageResource(onto);
            else
                Toast.makeText(this, "Please Enter valid Values", Toast.LENGTH_SHORT).show();
        }

        else if (view.getId() == R.id.onetoone) {
            if (number1.length() == 0 || number2.length() == 0)
                Toast.makeText(this, "Please Enter valid Values", Toast.LENGTH_SHORT).show();

            else if(number2.equals("1,2,3,4,5"))
                imageView.setImageResource(onetoone);
            else
                Toast.makeText(this, "Please Enter valid Values", Toast.LENGTH_SHORT).show();
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
