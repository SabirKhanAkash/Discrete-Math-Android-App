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

public class gg extends AppCompatActivity implements OnClickListener {
    private EditText editText1,editText2;
    private Button button;
    private ImageView imageView;

    int single = R.drawable.single;
    int iai = R.drawable.iai;
    int iiai = R.drawable.iiai;
    int iiiai = R.drawable.iiiai;
    int ivai = R.drawable.ivai;
    int vai = R.drawable.vai;
    int iiaii = R.drawable.iiaii;
    int iiiaii = R.drawable.iiiaii;
    int ivaii = R.drawable.ivaii;
    int vaii = R.drawable.vaii;
    int iiiaiii = R.drawable.iiiaiii;
    int ivaiii = R.drawable.ivaiii;
    int vaiii = R.drawable.vaiii;
    int ivaiv = R.drawable.ivaiv;
    int vaiv = R.drawable.vaiv;
    int vav = R.drawable.vav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gg);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText1 = (EditText) findViewById(R.id.n);
        editText2 = (EditText) findViewById(R.id.e);
        button = (Button) findViewById(R.id.gg);
        imageView = (ImageView) findViewById(R.id.vnn);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();

        if(v.getId() == R.id.gg) {
            if (number1.length() == 0 || number2.length() == 0)
                Toast.makeText(this, "Please Enter the Values", Toast.LENGTH_SHORT).show();
            else {
                int node = Integer.parseInt(number1);
                int edge = Integer.parseInt(number2);

                if (node == 0 && edge == 0)
                    Toast.makeText(this, "Both nodes and edges cannot be Zero", Toast.LENGTH_SHORT).show();
                else if (node == 1 && edge == 0)
                    imageView.setImageResource(single);
                else if (node == 0)
                    Toast.makeText(this, "Nodes must be more than Zero", Toast.LENGTH_SHORT).show();
                else if (edge == 0)
                    Toast.makeText(this, "Edges must be more than Zero", Toast.LENGTH_SHORT).show();
                else if (edge > node)
                    Toast.makeText(this, "Edges need to be equal or less than nodes", Toast.LENGTH_SHORT).show();

                else if (node == 1 && edge == 1)
                    imageView.setImageResource(iai);
                else if (node == 2 && edge == 1)
                    imageView.setImageResource(iiai);
                else if (node == 3 && edge == 1)
                    imageView.setImageResource(iiiai);
                else if (node == 4 && edge == 1)
                    imageView.setImageResource(ivai);
                else if (node == 5 && edge == 1)
                    imageView.setImageResource(vai);
                else if (node == 2 && edge == 2)
                    imageView.setImageResource(iiaii);
                else if (node == 3 && edge == 2)
                    imageView.setImageResource(iiiaii);
                else if (node == 4 && edge == 2)
                    imageView.setImageResource(ivaii);
                else if (node == 5 && edge == 2)
                    imageView.setImageResource(vaii);
                else if (node == 3 && edge == 3)
                    imageView.setImageResource(iiiaiii);
                else if (node == 4 && edge == 3)
                    imageView.setImageResource(ivaiii);
                else if (node == 5 && edge == 3)
                    imageView.setImageResource(vaiii);
                else if (node == 4 && edge == 4)
                    imageView.setImageResource(ivaiv);
                else if (node == 5 && edge == 4)
                    imageView.setImageResource(vaiv);
                else if (node == 5 && edge == 5)
                    imageView.setImageResource(vav);

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
