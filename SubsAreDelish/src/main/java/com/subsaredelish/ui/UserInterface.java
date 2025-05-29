package com.subsaredelish.ui;

import java.util.Scanner;

//this is where your home screen, order screen,
//and add sandwich screen go, add to order, checkout/receipt

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private boolean running = true;

    public void homeScreen() {
        while (running) {
            displayHomeScreen();
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                    startOrder();
                    break;
                case "0":
                    System.out.println("Thank you for choosing Subs Are Delish! Have a great day...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please re-enter ");
            }
        }
    }

    public void displayHomeScreen() {
        System.out.println("Welcome to Subs Are Delish\uD83E\uDD6A");
        System.out.println("----------------------------");
        System.out.println("Flavor that obeys your every bite!\n");
        System.out.println(" 1) Create Order ");
        System.out.println(" 0) Exit Application \n");
        System.out.println(" Please select option:  ");
    }

    private void returnToHomeScreen() {
        System.out.println("\nPress Enter to return to the home screen...");
        scanner.nextLine();
    }

    private void startOrder() {
        Order currentOrder = new Order();
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n Order Menu");
            System.out.println("-----------------");
            System.out.println("1) Add Sandwich ");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips ");
            System.out.println("4) Checkout ");
            System.out.println("0) Cancel Order ");
            System.out.println("Please select option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addSandwich(currentOrder);
                    break;
                case "2":
                    addDrink(currentOrder);
                    break;
                case "3":
                    addChips(currentOrder);
                case "4":
                    checkout(currentOrder);
                    ordering = false;
                    break;
                case "0":
                    System.out.println(" Your order has been cancelled. Returning to home screen... ");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid option. Please re-enter.");
            }
        }
    }

    //loop through all the sandwich options bread, meat, cheese, toppings, sauces, sides, any extras (advise cost)
    // i'd like to do an if or streams for regular vs premium toppings to loop through upon user input-Toppings array list
    private void addSandwich(Order order) {
        System.out.println("What bread would you like for your sandwich ? ");
        System.out.println("What size sandwich would you like? ");
        System.out.println("What toppings would you like on your sandwich? ");
        System.out.println("Would you like your sandwich toasted? ");
    }

    //loop through size of drinks and what kind of drink (advise cost)
    private void addDrink (Order order) {
        System.out.println("What size drink would you like?");
        System.out.println("What flavor would you like?");
    }

    private void addChips(Order order) {
        System.out.println("What kind of chips would you like?");
    }

    public void displayCheckoutScreen() {
        //show summary of total what was ordered w/ price

            System.out.println("1- Confirm"); //upon pressing receipt writes to file and loops back to home screen
            System.out.println("2- Cancel"); //deletes order and loops back to home screen
        }
}




