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

public class counting extends AppCompatActivity {
    ListView listView;
    String[] chapter = {"The Sum Rule","The Product Rule", "Pigeon Hole Principle" ,"Permutation","Combination"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Toast.makeText(this,"Counting is Selected", Toast.LENGTH_SHORT).show();

        listView = (ListView) findViewById(R.id.list_item_c);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,chapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected",Toast.LENGTH_SHORT).show();
                if(position==0)
                {
                    Intent intent = new Intent(view.getContext(),sumrule.class);
                    startActivityForResult(intent,0);
                }
                if(position==1)
                {
                    Intent intent2 = new Intent(view.getContext(),productrule.class);
                    startActivityForResult(intent2,0);
                }
                if(position==2)
                {
                    Intent intent3 = new Intent(view.getContext(),tpp.class);
                    startActivityForResult(intent3,0);
                }
                if(position==3)
                {
                    Intent intent4 = new Intent(view.getContext(),permut.class);
                    startActivityForResult(intent4,0);
                }
                if(position==4)
                {
                    Intent intent5 = new Intent(view.getContext(),comb.class);
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
