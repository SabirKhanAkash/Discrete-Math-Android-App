package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class dmbook extends AppCompatActivity {
    PDFView book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmbook);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        book = (PDFView) findViewById(R.id.dmbook);

        book.fromAsset("dmbook.pdf").load();
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
