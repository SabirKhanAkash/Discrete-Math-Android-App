package com.example.ismail.discreteproblems;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.Set;

public class graph extends AppCompatActivity {
    ListView listView;
    String[] chapter = {"Graph Terminology","Different types of Graphs","Generating Graphs"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Toast.makeText(this,"Graph is Selected", Toast.LENGTH_SHORT).show();

        listView = (ListView) findViewById(R.id.graphlistid);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,chapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected",Toast.LENGTH_SHORT).show();
                if(position==0)
                {
                    Intent intent1 = new Intent(view.getContext(),gterm.class);
                    startActivityForResult(intent1,0);
                }
                if(position==1)
                {
                    Intent intent = new Intent(view.getContext(),tog.class);
                    startActivityForResult(intent,0);
                }
                if(position==2)
                {
                    Intent intent3 = new Intent(view.getContext(),gg.class);
                    startActivityForResult(intent3,0);
                }
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}