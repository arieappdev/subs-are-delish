package com.subsaredelish.model;

import com.subsaredelish.ui.UserInterface;

public class Toppings extends UserInterface {

    private String nameOfTopping;
    private String toppingType ;
    private boolean isExtra;

    public Toppings(String nameOfTopping, String toppingType, boolean isExtra) {
        this.nameOfTopping = nameOfTopping; //steak, ham, chicken, bacon
        this.toppingType = toppingType; //meat, extra meat, cheese, extra cheese, sauces, sides
        this.isExtra = isExtra; //shows if it will be premium or regular depending on if it costs
    }

    public String getNameOfTopping() {
        return nameOfTopping;
    }

    public String getToppingType() {
        return toppingType;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public String toString() {
    return nameOfTopping + (isExtra ? " (extra) " : " ");

    }
}

//    public String getName() {
//        return name;
//    }
//
//    public ToppingType getType() {
//        return type;
//    }
//
//    public boolean isExtra() {
//        return isExtra;
//    }
//
//    public double getPrice(String sandwichSize) {
//        // Basic pricing logic for premium toppings
//        switch (type) {
//            case MEAT:
//                return isExtra ? getExtraMeatPrice(size) : getBaseMeatPrice(size);
//            case CHEESE:
//                return isExtra ? getExtraCheesePrice(size) : getBaseCheesePrice(size);
//            default:
//                return 0.0; // Regular/sauces included
//        }
//    }
//
//    private double getBaseMeatPrice(String size) {
//        switch (size) {
//            case "4":
//                return 1.00;
//            case "8":
//                return 2.00;
//            case "12":
//                return 3.00;
//            default:
//                return 0.0;
//        }
//    }
//
//    private double getExtraMeatPrice(String size) {
//        switch (size) {
//            case "4":
//                return 0.50;
//            case "8":
//                return 1.00;
//            case "12":
//                return 1.50;
//            default:
//                return 0.0;
//        }
//    }
//
//    private double getBaseCheesePrice(String size) {
//        switch (size) {
//            case "4":
//                return 0.75;
//            case "8":
//                return 1.50;
//            case "12":
//                return 2.25;
//            default:
//                return 0.0;
//        }
//    }
//
//    private double getExtraCheesePrice(String size) {
//        switch (size) {
//            case "4":
//                return 0.30;
//            case "8":
//                return 0.60;
//            case "12":
//                return 0.90;
//            default:
//                return 0.0;
//        }
//    }
//}
//}
