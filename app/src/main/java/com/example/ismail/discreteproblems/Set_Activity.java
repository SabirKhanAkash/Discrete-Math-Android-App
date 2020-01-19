package com.example.ismail.discreteproblems;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.Math.abs;

/**
 * Created by Ismail_CSE'15 on 4/30/2017 and
 * Updated by Akash_CSE'16 on .
 */
public class Set_Activity extends AppCompatActivity implements OnClickListener {
    String[] elemA, elemB,elemC,elemD,elemE,elemF;
    String[] elemG,elemH;
    int co = 0,co1 = 0,hello=0;
    EditText editText1, editText2;
    Button unionbutton;
    Button intersectionbutton;
    Button differencebutton;
    Button cardinality1button;
    Button cardinality2button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Toast.makeText(this,"Set is Selected", Toast.LENGTH_SHORT).show();

        editText1 = (EditText) findViewById(R.id.et1);
        editText2 = (EditText) findViewById(R.id.et2);

        unionbutton = (Button) findViewById(R.id.Unionbuttonid);
        intersectionbutton = (Button) findViewById(R.id.Intersectionbuttonid);
        differencebutton = (Button) findViewById(R.id.Differencebuttonid);
        cardinality1button = (Button) findViewById(R.id.cardinality1buttonid);
        cardinality2button = (Button) findViewById(R.id.cardinality2buttonid);

        result = (TextView) findViewById(R.id.resultid);

        unionbutton.setOnClickListener(this);
        intersectionbutton.setOnClickListener(this);
        differencebutton.setOnClickListener(this);
        cardinality1button.setOnClickListener(this);
        cardinality2button.setOnClickListener(this);

    }

    public void VennDiagram(View v) {
            Intent vennintent = new Intent(this, VennDiagram.class);
            startActivity(vennintent);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.Unionbuttonid) {
            elemA = editText1.getText().toString().split(",");
            elemB = editText2.getText().toString().split(",");

            for (int i = 0; i < elemA.length; i++) {
                elemA[i] = elemA[i].trim();
            }
            for (int i = 0; i < elemB.length; i++) {
                elemB[i] = elemB[i].trim();
            }

            ArrayList<String> union = new ArrayList<>();

            for (int i = 0; i < elemA.length; i++) {
                if (!union.contains(elemA[i])) {
                    union.add(elemA[i]);
                }
            }
            for (int i = 0; i < elemB.length; i++) {
                if (!union.contains(elemB[i])) {
                    union.add(elemB[i]);
                }
            }

            StringBuilder builder = new StringBuilder("{");

            for (int i = 0; i < union.size(); i++) {
                builder.append(union.get(i) + ",");
            }
            builder.append("}");

            if(union.toString().length() == 2) {
                Toast.makeText(this, "Union not found. Please Enter the valid Values", Toast.LENGTH_SHORT).show();
                hello = 1;
            }
                else {
                result.setText("The Union is: " + union);
                hello = 0;
            }
        }

        if(view.getId() == R.id.Intersectionbuttonid) {
            elemC = editText1.getText().toString().split(",");
            elemD = editText2.getText().toString().split(",");

                for (int i = 0; i < elemC.length; i++) {
                    elemC[i] = elemC[i].trim();
                }
                for (int i = 0; i < elemD.length; i++) {
                    elemD[i] = elemD[i].trim();
                }

                ArrayList<String> elemCL = new ArrayList(Arrays.asList(elemC));
                ArrayList<String> elemDL = new ArrayList(Arrays.asList(elemD));
                ArrayList<String> intersection = new ArrayList<>();

                Log.d("---------", elemCL.get(0));

                for (int i = 0; i < elemCL.size(); i++) {
                    if (!intersection.contains(elemCL.get(i)) && elemDL.contains(elemCL.get(i))) {
                        intersection.add(elemCL.get(i));
                    }
                }

                Log.d("---------", elemCL.get(0));

                for (int i = 0; i < elemDL.size(); i++) {
                    if (!intersection.contains(elemDL.get(i)) && elemCL.contains(elemDL.get(i))) {
                        intersection.add(elemDL.get(i));
                    }
                }

                StringBuilder builder = new StringBuilder("{");

                for (int i = 0; i < intersection.size(); i++) {
                    builder.append(intersection.get(i) + ",");
                }

                builder.append("}");
                if(intersection.toString().length() == 2) {
                    Toast.makeText(this, "Intersection not found. Please Enter the another Values", Toast.LENGTH_SHORT).show();
                    hello = 1;
                }
                else {
                    result.setText("The Intersection is: " + intersection);
                    hello = 0;
                }
        }
        if(view.getId() == R.id.Differencebuttonid) {
            int flag = 0;
            elemE = editText1.getText().toString().split(",");
            elemF = editText2.getText().toString().split(",");

                for (int i = 0; i < elemE.length; i++) {
                    elemE[i] = elemE[i].trim();
                }
                for (int i = 0; i < elemF.length; i++) {
                    elemF[i] = elemF[i].trim();
                }

                ArrayList<String> elemEL = new ArrayList(Arrays.asList(elemE));
                ArrayList<String> elemFL = new ArrayList(Arrays.asList(elemF));
                ArrayList<String> Difference = new ArrayList<>();

                for (int j = 0; j < elemEL.size(); j++) {
                    if (!elemFL.contains(elemEL.get(j)) && !Difference.contains(elemEL.get(j))) {
                        Difference.add(elemEL.get(j));
                    }
                }

                StringBuilder builder1 = new StringBuilder("{");

                for (int i = 0; i < Difference.size(); i++) {
                    builder1.append(Difference.get(i) + ",");
                }

                builder1.append("}");
                if(Difference.toString().length() == 2)
                {
                    Toast.makeText(this, "Difference not found. Please Enter another Values", Toast.LENGTH_SHORT).show();
                    hello = 1;
                }
                else {
                    result.setText("The Difference is: " + Difference );
                    hello = 0;
                }

        }
        if(view.getId() == R.id.cardinality1buttonid) {
            elemG = editText1.getText().toString().split(",");

                for (int i = 0; i < elemG.length; i++) {
                    elemG[i] = elemG[i].trim();
                }
                int l = elemG.length;
                ArrayList<String> elemGL = new ArrayList<String>(Arrays.asList(elemG));
                for (int index = 0; index < elemGL.size(); index++) {
                    for (int j = index + 1; j < elemGL.size(); j++) {
                        if (elemGL.get(index).equals(elemGL.get(j))) {
                            co++;
                            break;
                        }
                    }
                }
                int answer = l - co;
                if( hello == 1)
                    Toast.makeText(this,"Please Enter the set Values",Toast.LENGTH_SHORT).show();
                else {
                    result.setText("The Cardinality of Set A is: " + answer);
                    co = 0;
                    hello = 0;
                }

        }
        if(view.getId() == R.id.cardinality2buttonid) {
            elemH = editText2.getText().toString().split(",");
                for (int i = 0; i < elemH.length; i++) {
                    elemH[i] = elemH[i].trim();
                }

                int x = elemH.length;
                ArrayList<String> elemHL = new ArrayList<String>(Arrays.asList(elemH));
                for (int index = 0; index < elemHL.size(); index++) {
                    for (int j = index + 1; j < elemHL.size(); j++) {
                        if (elemHL.get(index).equals(elemHL.get(j))) {
                            co1++;
                            break;
                        }
                    }
                }
                int answer = x - co1;
                if (hello == 1)
                    Toast.makeText(this, "Please Enter the set Values", Toast.LENGTH_SHORT).show();
                else {
                    result.setText("The Cardinality of Set B is: " + answer);
                    co1 = 0;
                    hello =0;
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
