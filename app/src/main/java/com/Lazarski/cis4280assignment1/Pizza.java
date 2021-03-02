package com.Lazarski.cis4280assignment1;
import java.util.HashMap;

public class Pizza implements java.io.Serializable {
    private String size;
    private double price;

    // implement topping class
    // implement method to calculate price based of size and toppings
    private Toppings toppings;

    public void setSize(String size) {
        this.size = size;
    }


    public Pizza() {
        this.toppings = new Toppings();
        toppings.setPepperoni(true);
    }

}
