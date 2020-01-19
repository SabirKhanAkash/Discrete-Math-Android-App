package com.example.ismail.discreteproblems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class dmslide extends AppCompatActivity {
    ListView listView;
    String[] chapter = {"Propositional Logic","Set and Function","The Fundamentals Algorithms, the Integers and Matrices", "Counting","Relations","Graphs"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmslide);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.dmslidelistid);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,chapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected",Toast.LENGTH_SHORT).show();
                if(position==0)
                {
                    Intent intent1 = new Intent(view.getContext(),i.class);
                    startActivityForResult(intent1,0);
                }
                if(position==1)
                {
                    Intent intent2 = new Intent(view.getContext(),ii.class);
                    startActivityForResult(intent2,0);
                }
                if(position==2)
                {
                    Intent intent = new Intent(view.getContext(),iii.class);
                    startActivityForResult(intent,0);
                }
                if(position==3)
                {
                    Intent intent3 = new Intent(view.getContext(),iv.class);
                    startActivityForResult(intent3,0);
                }
                if(position==4)
                {
                    Intent intent4 = new Intent(view.getContext(),v.class);
                    startActivityForResult(intent4,0);
                }
                if(position==5)
                {
                    Intent intent5 = new Intent(view.getContext(),vi.class);
                    startActivityForResult(intent5,0);
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
