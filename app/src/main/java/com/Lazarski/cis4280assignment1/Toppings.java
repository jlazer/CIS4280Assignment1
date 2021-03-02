package com.Lazarski.cis4280assignment1;

public class Toppings implements java.io.Serializable {
    private Boolean pepperoni;
    private Boolean chicken;
    private Boolean mushrooms;
    private Boolean greenPeppers;
    private Boolean olives;
    private Boolean extraCheese;

    // Getter methods
    public Boolean getPepperoni() {
       return pepperoni;
    }
    public Boolean getChicken() {
        return chicken;
    }
    public Boolean getMushrooms() {
        return mushrooms;
    }
    public Boolean getGreenPeppers() {
        return greenPeppers;
    }
    public Boolean getOlives() {
        return olives;
    }
    public Boolean getExtraCheese(){
       return extraCheese;
    }
    // Setter Methods
    public void setPepperoni(Boolean topping1) {
        this.pepperoni = topping1;
    }
    public void setChicken(Boolean topping2) {
        this.chicken = topping2;
    }

}
