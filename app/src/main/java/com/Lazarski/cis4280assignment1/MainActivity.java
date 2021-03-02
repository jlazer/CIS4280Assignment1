package com.Lazarski.cis4280assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private final String TAG = "Lifecycle";
    // Creating checkbox objects
    private CheckBox toppingCheckbox1;
    private CheckBox toppingCheckbox2;
    private CheckBox toppingCheckbox3;
    private CheckBox toppingCheckbox4;
    private CheckBox toppingCheckbox5;
    private CheckBox toppingCheckbox6;

    private OrderDetails orderDetailsInstance = new OrderDetails();


    Toppings toppingsObject = new Toppings();
    Pizza pizzaObject = new Pizza();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        /*if (savedInstanceState != null) {
            // Save the result of any data

        }

         */


        //binding checkbox objects to corresponding UI element
        toppingCheckbox1 = (CheckBox) findViewById(R.id.checkBoxPepperoni);
        toppingCheckbox2 = (CheckBox) findViewById(R.id.checkBoxChicken);
        toppingCheckbox3 = (CheckBox) findViewById(R.id.checkBoxMushroom);
        toppingCheckbox4 = (CheckBox) findViewById(R.id.checkBoxGreenPepper);
        toppingCheckbox5 = (CheckBox) findViewById(R.id.checkBoxOlive);
        toppingCheckbox6 = (CheckBox) findViewById(R.id.checkBoxExtraCheese);
        //todo need to check value of checkbox when and be able to add it to an instance of the order details class. then try and pass order details object to next activity via intent.
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }



    public void sendMessage(View view) {
        //Do something in response to button

        // assigning rg object to corresponding UI element
        RadioGroup rg = findViewById(R.id.radioGroup1);

        // get the ID of the checked radio button from rg Object
        int rgChecked = rg.getCheckedRadioButtonId();

        // converting checkedRadioButtonId to string format size.
        String size = "";
        if (rgChecked == R.id.smallPizzaRadioButton) {
            size = "small";
            pizzaObject.setSize(size);
            //orderDetailsInstance.setPizzaSize(size);
            System.out.println(size);

        } else if (rgChecked == R.id.mediumPizzaRadioButton) {
            size = "medium";
            pizzaObject.setSize(size);
            //orderDetailsInstance.setPizzaSize(size);
            System.out.println(size);

        } else if (rgChecked == R.id.largePizzaRadioButton) {
            size = "large";
            pizzaObject.setSize(size);
            //orderDetailsInstance.setPizzaSize(size);
            System.out.println(size);
        }


        // Setting the toppings of the pizza in the orderDetails instance to the boolean value of the corresponding topping object.
        toppingsObject.setPepperoni(toppingCheckbox1.isChecked());
        Boolean testPepperoni = toppingsObject.getPepperoni();

        System.out.println("if this works: " + testPepperoni);


        //orderDetailsInstance.setPepperoni(toppingCheckbox1.isChecked());
        orderDetailsInstance.setChicken(toppingCheckbox2.isChecked());
        orderDetailsInstance.setMushroom(toppingCheckbox3.isChecked());
        orderDetailsInstance.setGreenPepper(toppingCheckbox4.isChecked());
        orderDetailsInstance.setOlive(toppingCheckbox5.isChecked());
        orderDetailsInstance.setExtraCheese(toppingCheckbox6.isChecked());

        // Prints to console the boolean value of the pepperoni attribute of the orderDetails object
        System.out.println("Pepperoni: " + orderDetailsInstance.getPepperoni());
        Intent intent = new Intent(this, customerPage.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("serializable", orderDetailsInstance);
        intent.putExtras(bundle);
        System.out.println("Button Click");
        startActivity(intent);
    }

    public void onCheckboxClicked(View view) {
    }
}