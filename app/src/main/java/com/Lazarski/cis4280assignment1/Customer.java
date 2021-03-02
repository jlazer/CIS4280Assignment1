package com.Lazarski.cis4280assignment1;

public class Customer implements java.io.Serializable {

    private String name = "";
    private String phone = "";
    private String email = "";
    private String address = "";

    public Customer() {
        super();
    }

    public Customer(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    // Getter Methods
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // implement pizza class
    // a customer has-a pizza!
    private Pizza pizza;

    //public Customer() {
       // this.pizza = new Pizza();
     //   pizza.setTopping;
   // }



}
