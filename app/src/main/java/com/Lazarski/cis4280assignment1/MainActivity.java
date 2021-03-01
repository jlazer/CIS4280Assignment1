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


    // Creating checkbox objects
    private CheckBox toppingCheckbox1;
    private CheckBox toppingCheckbox2;
    private CheckBox toppingCheckbox3;
    private CheckBox toppingCheckbox4;
    private CheckBox toppingCheckbox5;
    private CheckBox toppingCheckbox6;
    //private RadioGroup pizzaSizeRadioGroup;
    private OrderDetails orderDetailsInstance = new OrderDetails();

    // Initializing pizza size string
    private String size = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding checkbox objects to corresponding UI element
        toppingCheckbox1 = (CheckBox) findViewById(R.id.checkBoxPepperoni);
        toppingCheckbox2 = (CheckBox) findViewById(R.id.checkBoxChicken);
        toppingCheckbox3 = (CheckBox) findViewById(R.id.checkBoxMushroom);
        toppingCheckbox4 = (CheckBox) findViewById(R.id.checkBoxGreenPepper);
        toppingCheckbox5 = (CheckBox) findViewById(R.id.checkBoxOlive);
        toppingCheckbox6 = (CheckBox) findViewById(R.id.checkBoxExtraCheese);

        //todo need to check value of checkbox when and be able to add it to an instance of the order details class. then try and pass order details object to next activity via intent.


    }




    public void sendMessage(View view) {
        //Do something in response to button

        // assigning rg object to corresponding UI element
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);



        // get the ID of the checked radio button from rg Object
        int rgChecked = rg.getCheckedRadioButtonId();

        // converting checkedRadioButtonId to string format size.
        if (rgChecked == R.id.smallPizzaRadioButton) {
            size = "small";
            orderDetailsInstance.setPizzaSize(size);
            System.out.println(size);

        } else if (rgChecked == R.id.mediumPizzaRadioButton) {
            size = "medium";
            orderDetailsInstance.setPizzaSize(size);
            System.out.println(size);

        } else if (rgChecked == R.id.largePizzaRadioButton) {
            size = "large";
            orderDetailsInstance.setPizzaSize(size);
            System.out.println(size);

        }

        // Setting the toppings of the pizza in the orderDetails instance to the boolean value of the corresponding topping object.
        orderDetailsInstance.setPepperoni(toppingCheckbox1.isChecked());
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
        //intent.putExtra("checked", rgChecked);
        //intent.putExtra("OrderDetails", orderDetailsInstance);


        System.out.println("Button Click");

        //EditText editText =(EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();

        //intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);


    }

    public void onCheckboxClicked(View view) {
    }

    //public static int pizzaSizeConversion (int rgValue) {

    //}
}