package com.Lazarski.cis4280assignment1;

public class OrderDetails implements java.io.Serializable {

    private String customerName = "";
    private int customerPhone;
    private String customerEmail = "";
    private String customerAddress = "";

    private String pizzaSize = "";

    private boolean pepperoni;

    //private String pepperoni = "";
    private boolean chicken;
    private boolean mushroom;
    private boolean greenPepper;
    private boolean olive;
    private boolean extraCheese;


    //private String[] toppingsArray = {"Pepperoni", "Chicken", "Mushroom", "Green Pepper", "Olive", "Extra Cheese"};

    // No parameter constructor
    public OrderDetails() {
        //todo add setter method for initial values
    }

    // Getter Methods

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerPhone() {
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


    // toppings will be sent in a boolean (true or false) will need to write logic(in a method?) to convert to string. i.e. if checkbox1 is true then pepperoni is on pizza.

    // Setter Methods


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(int customerPhone) {
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


    // TODO figure out best way to store toppings? array or array list? what will the getter/setter look like.
    // Setter Methods
    // TODO method for calculating the order price. each topping needs a price and size


}
