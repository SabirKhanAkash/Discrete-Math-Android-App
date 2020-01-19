package com.example.ismail.discreteproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OnetoOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onetoone);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = (TextView) findViewById(R.id.onetooneid);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String data="";
        String newline = "\n";
        StringBuffer stringBuffer =new StringBuffer();
        InputStream is =this .getResources().openRawResource(R.raw.ontoone);
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(is));
        if(is!=null)
        {
            try {
                while ((data = bufferedReader.readLine())!=null)
                {
                    stringBuffer.append(data + newline);
                }
                textView.setText(stringBuffer);
                is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
