package com.example.ismail.discreteproblems;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Function extends AppCompatActivity {
    ListView listView;
    String[] funclist = {"Generate Function Diagram","Domain and Co-domain", "One-to-one Function", "Increasing and Decreasing Function", "Onto Function", "Inverse Function"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.function_layout);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Toast.makeText(this,"Function is Selected", Toast.LENGTH_SHORT).show();

        listView = (ListView) findViewById(R.id.functionlistid);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,funclist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected",Toast.LENGTH_SHORT).show();
                if(position == 0)
                {
                    Intent intentx = new Intent(view.getContext(),gf.class);
                    startActivityForResult(intentx,0);
                }
                else if(position==1)
                {
                    Intent intent = new Intent(view.getContext(),DomainCoDomain.class);
                    startActivityForResult(intent,0);
                }
                else if(position==2)
                {
                    Intent intent2 = new Intent(view.getContext(),OnetoOneActivity.class);
                    startActivityForResult(intent2,0);
                }
                else if(position==3)
                {
                    Intent intent3 = new Intent(view.getContext(),IncDecActivity.class);
                    startActivityForResult(intent3,0);
                }
                else if(position==4)
                {
                    Intent intent4 = new Intent(view.getContext(),Onto.class);
                    startActivityForResult(intent4,0);
                }
                else if(position==5)
                {
                    Intent intent5 = new Intent(view.getContext(),Inverse.class);
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
