package com.example.ismail.discreteproblems;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Set;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by Ismail on 4/30/2017.
 */
public class Second_Activity extends AppCompatActivity {
    GridLayout mainGrid;
    String[] chapter = {"Propositional Logic","Set","Function","Number Theoery","Counting","Graphs"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(view.getId() == R.id.pl) {
                        Intent intent1 = new Intent(view.getContext(), plogic.class);
                        startActivityForResult(intent1, 0);
                    }
                    if(view.getId() == R.id.set) {
                        Intent intent1 = new Intent(view.getContext(), Set_Activity.class);
                        startActivityForResult(intent1, 0);
                    }
                    if(view.getId() == R.id.func) {
                        Intent intent1 = new Intent(view.getContext(), Function.class);
                        startActivityForResult(intent1, 0);
                    }
                    if(view.getId() == R.id.numt) {
                        Intent intent1 = new Intent(view.getContext(), NumberTheory.class);
                        startActivityForResult(intent1, 0);
                    }
                    if(view.getId() == R.id.coun) {
                        Intent intent1 = new Intent(view.getContext(), counting.class);
                        startActivityForResult(intent1, 0);
                    }
                    if(view.getId() == R.id.grp) {
                        Intent intent1 = new Intent(view.getContext(), graph.class);
                        startActivityForResult(intent1, 0);
                    }
                }
            });
        }
    }
}