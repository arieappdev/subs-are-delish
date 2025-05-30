package com.subsaredelish.ui;

import com.subsaredelish.data.ReceiptFileManager;
import com.subsaredelish.model.*;

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
        System.out.println(" Please select option: ");

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
                    //SandwichView.addSandwich(currentOrder)  if you wanted to create a new view for adding a sandwich
                    addSandwich(currentOrder);
                    break;
                case "2":
                    addDrink(currentOrder);
                    break;
                case "3":
                    addChips(currentOrder);
                    break;
                case "4":
                 displayCheckoutScreen(currentOrder);
                    returnToHomeScreen();
                    currentOrder = new Order();
                    ordering = false;
                    break;
                case "0":
                    System.out.println(" Your order has been cancelled. Returning to home screen...\n ");
                    ordering = false;
                    currentOrder = new Order();
                    break;
                default:
                    System.out.println("Invalid option. Please re-enter.");

            }
        }
    }

    //loop through all the sandwich options bread, meat, cheese, toppings, sauces, sides, any extras (advise cost)
    // i'd like to do an if or streams for regular vs premium toppings to loop through upon user input-Toppings array list
    private void addSandwich(Order order) {
        //   Order currentOrder = new Order();
        Sandwich sandwich = new Sandwich();

        System.out.println("\n----Let's Make A Sandwich----");
        System.out.println("What size sandwich would you like? ");
        System.out.println("4");
        System.out.println("8");
        System.out.println("12");

        //  String choice = scanner.nextLine().trim();

        String sandwichSize = scanner.nextLine();
        sandwich.setSandwichSize(sandwichSize);
//        String size = "";
//        if (sandwichSize.equals("1")) size = "4 " ;
//        else if (sandwichSize.equals("2")) size = "8 " ;
//        else if (sandwichSize.equals("3")) size = "12 ";
//        else size = "Invalid";


        System.out.println("What bread would you like for your sandwich ?");
        System.out.println("""
                1) White
                2) Wheat
                3) Rye
                4) Wrap
                """);
        String breadType = scanner.nextLine();

        if (breadType.equals("1")) breadType = "White";
        else if (breadType.equals("2")) breadType = "Wheat";
        else if (breadType.equals("3")) breadType = "Rye";
        else if (breadType.equals("4")) breadType = "Wrap";
        else breadType = "White";

        sandwich.setBreadType(breadType);

        boolean addingMeat = true;

        while (addingMeat) {
            System.out.println("Choose Meat: ");

            //meats
            for (String meat : SandwichHelper.MEAT) {
                System.out.println(meat);
            }
            String meatSelection = scanner.nextLine();
            Meat meatTopping = new Meat(meatSelection, "meat");
            sandwich.addTopping(meatTopping);

            System.out.println("Would you like to add more?");
            System.out.println("Y/N");
            if (!scanner.nextLine().equalsIgnoreCase("y")) {
                addingMeat = false;
            }
//if we dont say yes we want more it should break out of the
// while loop else it should repeat this part of the menu

        }
        //cheese
        boolean addingCheese = true;
        while (addingCheese) {
            System.out.println("Choose Cheese: ");

            //meats
            for (String cheese : SandwichHelper.CHEESE) {
                System.out.println(cheese);
            }
            String cheeseSelection = scanner.nextLine();

            Cheese cheeseTopping = new Cheese(cheeseSelection, "cheese");
            sandwich.addTopping(cheeseTopping);

            System.out.println("Would you like to add more?");
            System.out.println("Y/N");
            if (!scanner.nextLine().equalsIgnoreCase("y")) {
                addingCheese = false;
            }

        }
            //veggies


            //sauces


            System.out.println("Would you like your sandwich toasted? ");
            System.out.println("Y/N");
            if (!scanner.nextLine().equalsIgnoreCase("y")) {
                sandwich.setToasted(false);
            } else {
                sandwich.setToasted(true);
            }

            order.addItemToOrder(sandwich);

        }


    //loop through size of drinks and what kind of drink (advise cost)
    private void addDrink (Order order) {

                System.out.println("What size drink would you like? (small/medium/large) ");
                String size = scanner.nextLine();


                System.out.println("What flavor would you like?");
                //print out the differnt they can choose from
                String flavor =scanner.nextLine();


                order.addItemToOrder(new Drink(size,flavor));


    }

    private void addChips(Order order) {


        System.out.println("What kind of chips would you like?");
        System.out.println(" Lays");
        System.out.println(" Pringles");
        System.out.println(" Hot Cheetos");
        System.out.println(" Takis");
        System.out.println(" Doritos");

        String type = scanner.nextLine();

        // if we number the menu we need to switch on the nu,ber
//        switch (type){
//            case "1":
//                order.addItemToOrder(new Chips("Lays"));
       // break;
//
//        }


        //chips should be added to order inside of a switch statemnt
        order.addItemToOrder(new Chips(type));
    }

    public void displayCheckoutScreen(Order order) {
        //show summary of total what was ordered w/ price

        //display order
      for(OrderItem item: order.getItems()){
        System.out.println(item);
      }
        System.out.println(order.getOrdertotal());

            System.out.println("1- Confirm"); //upon pressing receipt writes to file and loops back to home screen
            System.out.println("2- Cancel"); //deletes order and loops back to home screen

        if(scanner.nextLine().equalsIgnoreCase("1")){
            checkout(order);
        } else {
            System.out.println("Order Canceled");
        }
        }

        private void checkout(Order order){

        // save item to recept folder
            ReceiptFileManager.saveReceipt(order);
        }
}




