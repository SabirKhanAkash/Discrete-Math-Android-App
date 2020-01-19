package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class tog extends AppCompatActivity {
    PDFView booktog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tog);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        booktog = (PDFView) findViewById(R.id.togid);

        booktog.fromAsset("tog.pdf").load();
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
