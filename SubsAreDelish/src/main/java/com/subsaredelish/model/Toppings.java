//package com.subsaredelish.model;
//
//public class Toppings {
//
//    private String name;
//    private ToppingType type;
//    private boolean isExtra;
//
//    public Topping(String name, ToppingType type, boolean isExtra) {
//        this.name = name;
//        this.type = type;
//        this.isExtra = isExtra;
//    }
//
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
//    public double getPrice(String size) {
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
