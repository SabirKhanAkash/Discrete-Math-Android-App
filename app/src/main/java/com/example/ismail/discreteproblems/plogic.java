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

public class plogic extends AppCompatActivity {
    ListView listView;
    String[] chapter = {"Logical Operators","Truth Tables","Propositional Laws","Rules of Inference"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plogic);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Toast.makeText(this,"Propositonal Logic is Selected", Toast.LENGTH_SHORT).show();

        listView = (ListView) findViewById(R.id.list_item_1);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,chapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected",Toast.LENGTH_SHORT).show();

                if(position==0)
                {
                    Intent intent1 = new Intent(view.getContext(),lo.class);
                    startActivityForResult(intent1,0);
                }
                if(position==1)
                {
                    Intent intent2 = new Intent(view.getContext(),tt.class);
                    startActivityForResult(intent2,0);
                }
                if(position==2)
                {
                    Intent intent3 = new Intent(view.getContext(),pl.class);
                    startActivityForResult(intent3,0);
                }
                if(position==3)
                {
                    Intent intent4 = new Intent(view.getContext(),roi.class);
                    startActivityForResult(intent4,0);
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
