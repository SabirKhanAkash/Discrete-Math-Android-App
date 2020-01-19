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

public class plist extends AppCompatActivity {
    ListView listView;
    String[] plist = {"Prime Check", "Primes between two numbers", "Prime Factorization","Twin Prime Numbers","Twin Primes between 1 to n"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plist);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.primelistid);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,plist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " is selected", Toast.LENGTH_SHORT).show();

                if(position==0)
                {
                    Intent intent = new Intent(view.getContext(),pcheck.class);
                    startActivityForResult(intent,0);
                }
                if(position==1)
                {
                    Intent intent1 = new Intent(view.getContext(),pmn.class);
                    startActivityForResult(intent1,0);
                }
                if(position==2)
                {
                    Intent intent2 = new Intent(view.getContext(),pf.class);
                    startActivityForResult(intent2,0);
                }
                if(position==3)
                {
                    Intent intent3 = new Intent(view.getContext(),tp.class);
                    startActivityForResult(intent3,0);
                }
                if(position==4)
                {
                    Intent intent4 = new Intent(view.getContext(),tpn.class);
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
