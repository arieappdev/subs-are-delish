package com.subsaredelish.model;

public class Toppings implements OrderItem {

    private String nameOfTopping;
    private String toppingType ;
    private boolean isPremium; //I never actually used this but keeping for example

    public Toppings(String nameOfTopping, String toppingType) {
        this.nameOfTopping = nameOfTopping; //steak, ham, chicken, bacon
        this.toppingType = toppingType.toLowerCase(); //meat, extra meat, cheese, extra cheese, sauces, sides
      //  this.isPremium = isPremium; //shows if it will be premium or regular depending on if it costs
    }

    public String getNameOfTopping() {
        return nameOfTopping;
    }

    public String getToppingType() {
        return toppingType;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public String toString() {
    return nameOfTopping + (isPremium ? " (premium) " : " ");

    }

    public double getPrice(String sandwichSize) {
        double price = 0.0;

        if (!isPremium) {
            return 0.0;
        }

        switch (toppingType) {
            case "meat":
                if (sandwichSize.equals("4 in")) price = 1.00;
                else if (sandwichSize.equals("8 in")) price = 2.00;
                else if (sandwichSize.equals("12 in")) price = 3.00;
                break;

            case "extra meat":
                if (sandwichSize.equals("4 ih")) price = 0.50;
                else if (sandwichSize.equals("8 in")) price = 1.00;
                else if (sandwichSize.equals("12 in")) price = 1.50;
                break;

            case "cheese":
                if (sandwichSize.equals("4 in")) price = 0.75;
                else if (sandwichSize.equals("8 in")) price = 1.50;
                else if (sandwichSize.equals("12 in")) price = 2.25;
                break;

            case "extra cheese":
                if (sandwichSize.equals("4 in")) price = 0.30;
                else if (sandwichSize.equals("8 in")) price = 0.60;
                else if (sandwichSize.equals("12 in")) price = 0.90;
                break;
        }

        return price;
    }

    @Override
    public double getItemCost() {
        return 0;
    }
}