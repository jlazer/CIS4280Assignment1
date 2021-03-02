package com.Lazarski.cis4280assignment1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;



import androidx.appcompat.app.AppCompatActivity;


public class customerPage extends AppCompatActivity {

    private final String TAG = "Lifecycle";

    private String size = "";
    boolean pepperoni;
    boolean chicken;
    boolean mushroom;
    boolean greenPepper;
    boolean olive;
    boolean extraCheese;
    private String t1 = "";
    private String t2 = "";
    private String t3 = "";
    private String t4 = "";
    private String t5 = "";
    private String t6 = "";

    String name = "";
    String phoneNumberString = "";
    String email = "";
    String address = "";

    private int numberOfToppings = 0;

    EditText editTextName;
    EditText editTextPhoneNumber;
    EditText editTextEmail;
    EditText editTextAddress;



    OrderDetails orderDetailsInstance;
    TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_page);
        Log.d(TAG, "onCreate");

         outputTextView = findViewById(R.id.outputTextView);

        // binding editTextName Object to corresponding UI element.
        editTextName = findViewById(R.id.editTextCustomerName);
        editTextPhoneNumber = findViewById(R.id.editTextCustomerPhone);
        editTextEmail = findViewById(R.id.editTextCustomerEmail);
        editTextAddress = findViewById(R.id.editTextCustomerAddress);

        System.out.println("We are on the customer page!");

        // Get the Intent that Started this activity and extract the instance of the OrderDetails class. (old extract the string)
        orderDetailsInstance = (OrderDetails) getIntent().getSerializableExtra("serializable");
        size = orderDetailsInstance.getPizzaSize();

        System.out.println("Pizza Size from main activity: " + size);
        pepperoni = orderDetailsInstance.getPepperoni();
        System.out.println("Pepperoni: " + pepperoni);
        chicken = orderDetailsInstance.getChicken();
        System.out.println("chicken: " + chicken);
        mushroom = orderDetailsInstance.getMushroom();
        System.out.println("mushroom: " + mushroom);
        greenPepper = orderDetailsInstance.getGreenPepper();
        System.out.println("green pepper: " + greenPepper);
        olive = orderDetailsInstance.getOlive();
        System.out.println("olive: " + olive);
        extraCheese = orderDetailsInstance.getExtraCheese();
        System.out.println("extraCheese: " + extraCheese);

        if (pepperoni) {
            numberOfToppings += 1;
            t1 = "Pepperoni\n";
        } else {
            System.out.println("no Pepperoni");
        }

        if (chicken) {
            numberOfToppings += 1;
            t2 = "Chicken\n";
        } else {
            System.out.println("no chicken");
        }

        if (mushroom) {
            numberOfToppings += 1;
            t3 = "Mushroom\n";
        } else {
            System.out.println("no mushroom");
        }

        if (greenPepper) {
            numberOfToppings += 1;
            t4 = "Green Pepper\n";

        } else {
            System.out.println("no greenPepper");
        }

        if (olive) {
            numberOfToppings += 1;
            t5 = "Olive\n";

        } else {
            System.out.println("no olive");
        }
        if (extraCheese) {
            numberOfToppings += 1;
            t6 = "Extra Cheese\n";
        } else {
            System.out.println("no extraCheese");
        }


        System.out.println(numberOfToppings);
        orderDetailsInstance.setNumberOfToppings(numberOfToppings);
        System.out.println("orderDetails number of toppings " + orderDetailsInstance.getNumberOfToppings());

        orderDetailsInstance.calculateTotal(size, numberOfToppings);
    }

    @Override
    protected void onStart(){
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

    public void submit(View view) {
        // Hides the keyboard on submit.
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow((null == getCurrentFocus()) ? null : getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        // Makes image visible
        ImageView img= findViewById(R.id.imageView1);
        img.setVisibility(View.VISIBLE);

        // Convert EditTextView to string/int variables
        name = editTextName.getText().toString();
        phoneNumberString = editTextPhoneNumber.getText().toString();
        long phoneNumberLong;
        phoneNumberLong= Long.parseLong(phoneNumberString);
        System.out.println(phoneNumberLong);
        email = editTextEmail.getText().toString();
        address = editTextAddress.getText().toString();

        // setting orderDetails attributes with appropriate value.
        orderDetailsInstance.setCustomerName(name);
        String str1 = "Order: \n Name: " + orderDetailsInstance.getCustomerName();
        orderDetailsInstance.setCustomerPhone(phoneNumberLong);
        String str2 = "\n Phone Number: " + orderDetailsInstance.getCustomerPhone();
        orderDetailsInstance.setCustomerEmail(email);
        String str3 = "\n Email: " + orderDetailsInstance.getCustomerEmail();
        orderDetailsInstance.setCustomerAddress(address);
        String str4 = "\n Address: " + orderDetailsInstance.getCustomerAddress();
        String str5 = "\n Toppings: \n";

        //orderDetailsInstance.calculateTotal();
        //System.out.println("Total: " + orderDetailsInstance.calculateTotal());

        // Populate outputTextView with order details.


        String outputString = str1 + str2 + str3 + str4 + str5 + t1 + t2 + t3 + t4 + t5 + t6 + "Size: " + orderDetailsInstance.getPizzaSize() + "\n Order total: $" + orderDetailsInstance.calculateTotal(size, numberOfToppings);




        outputTextView.setText(outputString);

    }
}