package com.subsaredelish.model;

// where you put all the bread and toppings along with pricing
public class Sandwich {

    private String sandwichSize; // "4", "8", "12"
    private String breadType;
    private boolean toasted;
    private double basePrice;

    public Sandwich(String sandwichSize, String breadType, boolean toasted) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.toasted = toasted;
        this.basePrice = calculateBasePrice(sandwichSize);
    }

    private double calculateBasePrice(String sandwichSize) {

        if (sandwichSize.equals("4 inch")) {
            return 5.50;
        } else if (sandwichSize.equals("8 inch")) {
            return 7.00;
        } else if (sandwichSize.equals("12 inch")) {
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

    public double getBasePrice() {
        return basePrice;
    }

    public String toString() {
        return sandwichSize + " " + breadType + " Sandwich" + (toasted ? " (toasted)" : "");
    }
}

//    private List<Topping> meats = new ArrayList<>();
//    private List<Topping> cheeses = new ArrayList<>();
//    private List<Topping> regulars = new ArrayList<>();
//    private List<Topping> sauces = new ArrayList<>();
//
//    }
//
//    public void addTopping(Topping topping) {
//        switch (topping.getType()) {
//            case MEAT: meats.add(topping); break;
//            case CHEESE: cheeses.add(topping); break;
//            case REGULAR: regulars.add(topping); break;
//            case SAUCE: sauces.add(topping); break;

