//package com.subsaredelish.model;
//
//import java.util.ArrayList;
////import java.util.List;
////
//where you put all the bread and toppings along with pricing
//public class Sandwich {
//
//    private String size; // "4", "8", "12"
//    private String breadType;
//    private boolean isToasted;
//
//    private List<Topping> meats = new ArrayList<>();
//    private List<Topping> cheeses = new ArrayList<>();
//    private List<Topping> regulars = new ArrayList<>();
//    private List<Topping> sauces = new ArrayList<>();
//
//    public Sandwich(String size, String breadType, boolean isToasted) {
//        this.size = size;
//        this.breadType = breadType;
//        this.isToasted = isToasted;
//    }
//
//    public void addTopping(Topping topping) {
//        switch (topping.getType()) {
//            case MEAT: meats.add(topping); break;
//            case CHEESE: cheeses.add(topping); break;
//            case REGULAR: regulars.add(topping); break;
//            case SAUCE: sauces.add(topping); break;
//        }
//    }
//
//    @Override
//    public double getPrice() {
//        double basePrice = getBasePrice();
//        double toppingsCost = 0.0;
//
//        for (Topping topping : meats) toppingsCost += topping.getPrice(size);
//        for (Topping topping : cheeses) toppingsCost += topping.getPrice(size);
//        // regular and sauces = $0
//
//        return basePrice + toppingsCost;
//    }
//
//    private double getBasePrice() {
//        switch (size) {
//            case "4": return 5.50;
//            case "8": return 7.00;
//            case "12": return 8.50;
//            default: return 0.0;
//        }
//    }
//
//    public String getDescription() {
//        return size + "\" " + breadType + " Sandwich" + (isToasted ? " (Toasted)" : "");
//    }
//}
