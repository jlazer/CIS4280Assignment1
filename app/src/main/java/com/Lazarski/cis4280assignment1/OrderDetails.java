package com.Lazarski.cis4280assignment1;

import java.io.Serializable;

public class OrderDetails implements java.io.Serializable {

    private String customerName = "";
    private long customerPhone = 0;
    private String customerEmail = "";
    private String customerAddress = "";

    private String pizzaSize = "";

    private boolean pepperoni;
    private boolean chicken;
    private boolean mushroom;
    private boolean greenPepper;
    private boolean olive;
    private boolean extraCheese;
    private int numberOfToppings = 0;


    //private String[] toppingsArray = {"Pepperoni", "Chicken", "Mushroom", "Green Pepper", "Olive", "Extra Cheese"};

    // No parameter constructor
    public OrderDetails() {

    }

    public OrderDetails(String pizzaSize, int numberOfToppings ) {
        setPizzaSize(pizzaSize);
        setNumberOfToppings(numberOfToppings);
    }


    // Getter Methods

    public String getCustomerName() {
        return customerName;
    }

    public long getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public boolean getPepperoni() {
        return pepperoni;
    }

    public boolean getChicken() {
        return chicken;
    }

    public boolean getMushroom() {
        return mushroom;
    }

    public boolean getGreenPepper() {
        return greenPepper;
    }

    public boolean getOlive() {
        return olive;
    }

    public boolean getExtraCheese() {
        return extraCheese;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }


    // toppings will be sent in a boolean (true or false) will need to write logic(in a method?) to convert to string. i.e. if checkbox1 is true then pepperoni is on pizza.

    // Setter Methods


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(long customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    public void setGreenPepper(boolean greenPepper) {
        this.greenPepper = greenPepper;
    }

    public void setOlive(boolean olive) {
        this.olive = olive;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }


    // TODO method to print relevant order details in textview.

    // TODO method for calculating the order price. each topping needs a price and size
    public double calculateTotal(String pizzaSize, int numberOfToppings) {
        double totalCost = 0.0;
        double numberOfToppingsDouble = numberOfToppings;

        if (pizzaSize.equals("small")) {
            totalCost += 10.0;

        } else if (pizzaSize.equals("medium")) {
            totalCost += 15.0;
        } else if (pizzaSize.equals("large")) {
            totalCost += 20.0;
        }
        System.out.println(totalCost);
        System.out.println(numberOfToppingsDouble);
        totalCost += numberOfToppingsDouble * 1.5;
        System.out.println(totalCost);

        return totalCost;
    }


}
