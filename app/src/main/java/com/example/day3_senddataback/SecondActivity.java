package com.example.day3_senddataback;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txtView;
    private Button btnUC;
    private Button btnLC;
    private Button btnNo;
    private Button btnLen;

    public static int count_Words(String str)     //https://www.w3resource.com/java-exercises/method/java-method-exercise-5.php
    {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count; // returns 0 if string starts or ends with space " ".
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnUC = findViewById(R.id.button1);
        btnLC = findViewById(R.id.button2);
        btnNo = findViewById(R.id.button3);
        btnLen = findViewById(R.id.button4);

        txtView = findViewById(R.id.textView1);
        Intent rInt =getIntent();
        final String a = rInt.getStringExtra("text");
        txtView.setTextColor(getResources().getColor(R.color.colorRed));
        txtView.setTextSize(20);
        txtView.setText("Welcome, " + a);

        ActionBar actBar =getSupportActionBar();
        actBar.setTitle("String Operations");
        actBar.setSubtitle("By : " + a);

        btnUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(SecondActivity.this);
                alert.setCancelable(false);
                alert.setTitle("Are you sure you want to send data back?");
                alert.setMessage("Upper Cased : "+a);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent sint2 = new Intent(SecondActivity.this, MainActivity.class);
                        sint2.putExtra("text", "Upper Case : " +a.toUpperCase());
                        startActivity(sint2);
                        dialog.dismiss();
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog aDialog = alert.create();
                aDialog.show();
            }
        });
        btnLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(SecondActivity.this);
                alert.setCancelable(false);
                alert.setTitle("Are you sure you want to send data back?");
                alert.setMessage("Lower Cased : "+a);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent sint2 = new Intent(SecondActivity.this, MainActivity.class);
                        sint2.putExtra("text", "Lower Case : "+ a.toLowerCase());
                        startActivity(sint2);
                        dialog.dismiss();
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog aDialog = alert.create();
                aDialog.show();
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(SecondActivity.this);
                alert.setCancelable(false);
                alert.setTitle("Are you sure you want to send data back?");
                alert.setMessage("Number of Words : ");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent sint2 = new Intent(SecondActivity.this, MainActivity.class);
                        sint2.putExtra("text", "Number of words : "+count_Words(a));
                    startActivity(sint2);
                        dialog.dismiss();
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog aDialog = alert.create();
                aDialog.show();
            }
        });
        btnLen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(SecondActivity.this);
                alert.setCancelable(false);
                alert.setTitle("Are you sure you want to send data back?");
                alert.setMessage("Length : "+a);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {Intent sint2 = new Intent(SecondActivity.this, MainActivity.class);
                        sint2.putExtra("text", "Length :  "+a.length());
                        startActivity(sint2);
                        dialog.dismiss();
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog aDialog = alert.create();
                aDialog.show();
            }
        });


    }
}
