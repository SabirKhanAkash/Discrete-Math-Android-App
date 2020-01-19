package com.example.ismail.discreteproblems;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contents(View v)
    {
        Intent intent = new Intent(this,Second_Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    StringBuffer builder = new StringBuffer(
            ">>> This App is developed by \n"
            + "\n"
            + "Sabir Khan Akash (RUET-CSE'16) and \n"
            + "Ismail Hossain (RUET-CSE'15)\n"
            + "\n"
            + "Current Version: v1.0 \n"
            + "\n"
            + "*** All Rights Reserved ***"
    );

    StringBuffer builder2 = new StringBuffer(
            ">>> Currently Discrete Mathematics's Version is v1.0 \n"
                    + "\n"
                    + "That means you are using the latest version of this app\n\n"
                    + "Thanks for using this app. Support us.  \n"
                    + "\n"
                    + "*** All Rights Reserved ***"

    );

    private void showDlg(String title, String body)
    {
        new AlertDialog.Builder(this).setMessage(body).setTitle(title).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        int id = menuItem.getItemId();
        switch (id)
        {
            case R.id.bookid:
                Toast.makeText(this,"Reference Book and Slides is selected",Toast.LENGTH_SHORT).show();
                Intent bookintent = new Intent(this,bs.class);
                startActivity(bookintent);
                break;
            case R.id.aboutid:
                Toast.makeText(this, "About is selected", Toast.LENGTH_SHORT).show();
                showDlg("About Discrete Mathematics",builder.toString() );
                break;
            case R.id.helpid:
                Toast.makeText(this, "Help is selected", Toast.LENGTH_SHORT).show();
                Intent helpintent = new Intent(this,help.class);
                startActivity(helpintent);
                break;
            case R.id.shareid:
                Toast.makeText(this,"Share is Selected",Toast.LENGTH_SHORT).show();
                Intent myintent = new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String shareBody = "Hey I'm Akash.\n"+ "This is my 2nd Year Odd Semester Project, an Android app on Discrete Mathemstics. \nYou can download the app from the link below: \n\n"+"https://drive.google.com/file/d/1L_jmavDExXlYH2i9Y4z96Qn8t2UDNkMP/view?usp=drivesdk";
                String shareSub = "Discrete Math App";
                myintent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myintent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myintent,"Share using"));
                break;
            case R.id.cfuid:
                Toast.makeText(this, "Checking Finished", Toast.LENGTH_SHORT).show();
                showDlg("Check for updates",builder2.toString());
                break;
            case R.id.exitid:
                final AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);

                builder.setMessage("Confirm Exit?\n\nDo you really want to exit?");

                builder.setCancelable(true);
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                });

                AlertDialog alertdialog = builder.create();
                alertdialog.show();
                    break;

        }
        return true;
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);

        builder.setMessage("Confirm Exit?\n\nDo you really want to exit?");

        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertdialog = builder.create();
        alertdialog.show();

    }
}
