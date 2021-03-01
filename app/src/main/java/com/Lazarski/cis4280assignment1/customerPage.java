package com.Lazarski.cis4280assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class customerPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_page);

        // Get the Intent that Started this activity and extract the string
        Intent intent = getIntent();

        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //int checked;
        int pizzaSizeInt = intent.getIntExtra("checked",0);
        System.out.println("We are on the customer page!");
        System.out.println(pizzaSizeInt);




        //Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.textView4);
        //textView.setText(message);
    }
}