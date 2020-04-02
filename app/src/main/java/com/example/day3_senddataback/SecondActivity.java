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
        String a = rInt.getStringExtra("text");
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
                alert.setMessage("Upper Case");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

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
                alert.setMessage("Lower Case");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
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
                alert.setMessage("Number of Words");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
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
                alert.setMessage("Length");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
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
