package com.subsaredelish.model;

public class Drink implements OrderItem{

    private String drinkSize;
    private String drinkFlavor;

    public Drink(String drinkSize, String drinkFlavor) {
        this.drinkSize = drinkSize.toLowerCase();
        this.drinkFlavor = drinkFlavor;
    }

    //never used get drink size or flavor could've gone in U.I for switch cases but ran out of time
    public String getDrinkSize() {
        return drinkSize;
    }

    public String getDrinkFlavor() {
        return drinkFlavor;
    }

    public double getPrice() {
        switch (drinkSize) {
            case "small":
                return 2.00;
            case "medium":
                return 2.50;
            case "large":
                return 3.00;
            default:
                return 0.0;
        }
    }
    public String toString() {
        return drinkFlavor + "( " + drinkSize + "} - $" + String.format("%.2f" , getPrice());
    }

    @Override
    public double getItemCost() {
        return getPrice();
    }
}
