package com.Lazarski.cis4280assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.Lazarski.cis4280assignment1.MESSAGE";
    private CheckBox toppingCheckbox1;
    private CheckBox toppingCheckbox2;
    private CheckBox toppingCheckbox3;
    private CheckBox toppingCheckbox4;
    private CheckBox toppingCheckbox5;
    private CheckBox toppingCheckbox6;
    private RadioGroup pizzaSizeRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        //Do something in response to button
        Intent intent = new Intent(this, customerPage.class);
        EditText editText =(EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);


    }


    public void onCheckboxClicked(View view) {

    }
}