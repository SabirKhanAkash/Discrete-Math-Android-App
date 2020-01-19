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

public class bs extends AppCompatActivity {
    ListView listView;
    String[] chapter = {"Discrete Mathematics and Its Application (7th Edition) -By  Kenneth H. Rosen","Solution of the above book","Slides on Discrete Mathematics"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bs);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.bslistid);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,chapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected",Toast.LENGTH_SHORT).show();
                if(position==0)
                {
                    Intent intent1 = new Intent(view.getContext(),dmbook.class);
                    startActivityForResult(intent1,0);
                }
                if(position==1)
                {
                    Intent intent2 = new Intent(view.getContext(),dmbooksol.class);
                    startActivityForResult(intent2,0);
                }
                if(position==2)
                {
                    Intent intent = new Intent(view.getContext(),dmslide.class);
                    startActivityForResult(intent,0);
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