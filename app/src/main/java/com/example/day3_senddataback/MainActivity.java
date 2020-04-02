package com.example.day3_senddataback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnNext;
    private EditText edtEnterText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = findViewById(R.id.button1);
        edtEnterText = findViewById(R.id.editText1);

        btnNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String text = edtEnterText.getText().toString().trim();
                if (text.isEmpty()){
                    edtEnterText.setError("Please Enter any text");
                }
                else {
                    Intent sint = new Intent(MainActivity.this, SecondActivity.class);
                    sint.putExtra("text", text);
                    startActivity(sint);
                }
            }
        });
    }
}
