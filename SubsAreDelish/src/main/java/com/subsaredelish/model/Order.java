//package com.subsaredelish.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
////where you put the screens home, order
//public class Order {
//
//    import java.util.ArrayList;
//import java.util.List;
//
//    public class Order {
//        private List<Sandwich> sandwiches = new ArrayList<>();
//        private List<Drink> drinks = new ArrayList<>();
//        private List<Chip> chips = new ArrayList<>();
//
//        public void addSandwich(Sandwich s) {
//            sandwiches.add(s);
//        }
//
//        public void addDrink(Drink d) {
//            drinks.add(d);
//        }
//
//        public void addChip(Chip c) {
//            chips.add(c);
//        }
//
//        public double calculateTotal() {
//            double total = 0.0;
//            for (Sandwich s : sandwiches) total += s.getPrice();
//            for (Drink d : drinks) total += d.getPrice();
//            for (Chip c : chips) total += c.getPrice();
//            return total;
//        }
//
//        public void printSummary() {
//            System.out.println("---- Order Summary ----");
//            for (Sandwich s : sandwiches) {
//                System.out.println(s.getDescription() + " - $" + s.getPrice());
//            }
//            for (Drink d : drinks) {
//                System.out.println("Drink (" + d.getPrice() + ")");
//            }
//            for (Chip c : chips) {
//                System.out.println("Chips ($1.50)");
//            }
//            System.out.println("Total: $" + calculateTotal());
//        }
//    }
//
//}
