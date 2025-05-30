package com.subsaredelish.model;

import java.util.ArrayList;
import java.util.List;

// where you put all the bread and toppings along with pricing
public class Sandwich implements OrderItem {

    private String sandwichSize; // "4", "8", "12"
    private String breadType;
    private boolean toasted;

    private List<Toppings> toppings = new ArrayList<>();

    public Sandwich(String sandwichSize, String breadType, boolean toasted) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.toasted = toasted;
    }

    public Sandwich() {
    }

    private double calculateBasePrice() {

        if (sandwichSize.equals("4")) {
            return 5.50;
        } else if (sandwichSize.equals("8")) {
            return 7.00;
        } else if (sandwichSize.equals("12")) {
            return 8.50;
        } else {
            return 0.00;
        }
    }

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    // add toppings to
    public String toString() {
        return sandwichSize + " " + breadType + " Sandwich" + (toasted ? " (toasted)" : "");
    }

    @Override
    public double getItemCost() {
        //all the math for the Sandwich
        double total = 0;

        //add base price
        total += calculateBasePrice();

        //add meat price
        total += getMeatPrice();

        //add cheese price
        total += getCheesePrice();

        return total;
    }

    //meatprice helper method
    private double getMeatPrice() {
        double meatPrice = 0;

        switch (sandwichSize) {
            case "4":

                boolean isExtra4 = false;

                for (Toppings topping : toppings) {
                    //check what kind of topping to ensure we're calculating only meat
                    if (topping.getToppingType().equalsIgnoreCase("meat")) {
                        //check if it's the first meat or and extra
                        if (isExtra4) {
                            meatPrice += .50;
                        } else {
                            meatPrice += 1.00;
                            isExtra4 = true;
                        }
                    }
                }
                break;

            case "8":
                boolean isExtra8 = false;

                for (Toppings topping : toppings) {
                    //check what kind of topping to ensure we're calculating only meat
                    if (topping.getToppingType().equalsIgnoreCase("meat")) {
                        //check if it's the first meat or and extra
                        if (isExtra8) {
                            meatPrice += 1.00;
                        } else {
                            meatPrice += 2.00;
                            isExtra8 = true;
                        }
                    }
                }
                break;

            case "12":
                boolean isExtra12 = false;

                for (Toppings topping : toppings) {
                    //check what kind of topping to ensure we're calculating only meat
                    if (topping.getToppingType().equalsIgnoreCase("meat")) {
                        //check if it's the first meat or and extra
                        if (isExtra12) {
                            meatPrice += 1.50;
                        } else {
                            meatPrice += 3.00;
                            isExtra12 = true;
                        }
                    }
                }
                break;

        }

        return meatPrice;
    }

    //cheese helper method
    private double getCheesePrice() {
        double cheesePrice = 0;

        switch (sandwichSize) {
            case "4":

                boolean isExtra4 = false;

                for (Toppings topping : toppings) {
                    //check what kind of topping to ensure we're calculating only cheese
                    if (topping.getToppingType().equalsIgnoreCase("cheese")) {
                        //check if it's the first cheese or and extra
                        if (isExtra4) {
                            cheesePrice += .30;
                        } else {
                            cheesePrice += .75;
                            isExtra4 = true;
                        }
                    }
                }
                break;

            case "8":

                boolean isExtra8 = false;

                for (Toppings topping : toppings) {
                    if (topping.getToppingType().equalsIgnoreCase("cheese")) {

                        if (isExtra8) {
                            cheesePrice += .60;
                        } else {
                            cheesePrice += 1.50;
                            isExtra8 = true;
                        }
                    }
                }
                break;

            case "12":

                boolean isExtra12 = false;

                for (Toppings topping : toppings) {

                    if (topping.getToppingType().equalsIgnoreCase("cheese")) {

                        if (isExtra12) {
                            cheesePrice += .90;
                        } else {
                            cheesePrice += 2.25;
                            isExtra12 = true;
                        }
                    }
                }
                break;

        }
        return cheesePrice;
    }


    public void addTopping(Toppings topping) {
        toppings.add(topping);

    }
}

