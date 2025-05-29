package com.subsaredelish.model;

public class Chips implements OrderItem {

    private String chipType;
    private double chipPrice;

    public Chips(String chipType) {
        this.chipType = chipType;
        this.chipPrice = 1.50;
    }

    public String getChipType() {
        return chipType;
    }

    public double getChipPrice() {
        return chipPrice;
    }

    public String toString() {
        return chipType + "Chips - $" + String.format("%.2f", chipPrice);

    }

    @Override
    public double getItemCost() {
        return chipPrice;
    }
}


