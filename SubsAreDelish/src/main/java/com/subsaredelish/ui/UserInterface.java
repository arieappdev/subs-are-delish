package com.subsaredelish.ui;

import com.subsaredelish.data.ReceiptFileManager;
import com.subsaredelish.model.*;

import java.util.Scanner;

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

    private void addSandwich(Order order) {

        Sandwich sandwich = new Sandwich();

        System.out.println("\n----Let's Make A Sandwich----");
        System.out.println("What size sandwich would you like? ");
        System.out.println("4");
        System.out.println("8");
        System.out.println("12");

        String sandwichSize = scanner.nextLine();
        sandwich.setSandwichSize(sandwichSize);

        //want to make sure i'm utilizing code i created in sandwich class to pull into my UI-see above

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
        //cheese didn't do switch since there is math logic and didn't wanna mess it up same for meat
        boolean addingCheese = true;
        while (addingCheese) {
            System.out.println("Choose Cheese: ");

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

        boolean addingVeggies = true;

        while (addingVeggies) {
            System.out.println("Choose a veggie topping:");
            System.out.println("1) Lettuce");
            System.out.println("2) Peppers");
            System.out.println("3) Onions");
            System.out.println("4) Tomatoes");
            System.out.println("5) Jalapeños");
            System.out.println("6) Cucumbers");
            System.out.println("7) Pickles");
            System.out.println("8) Guacamole");
            System.out.println("9) Mushrooms");
            System.out.println("0) Done adding veggies");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    sandwich.addTopping(new Toppings("Lettuce", "regular"));
                    break;
                case "2":
                    sandwich.addTopping(new Toppings("Peppers", "regular"));
                    break;
                case "3":
                    sandwich.addTopping(new Toppings("Onions", "regular"));
                    break;
                case "4":
                    sandwich.addTopping(new Toppings("Tomatoes", "regular"));
                    break;
                case "5":
                    sandwich.addTopping(new Toppings("Jalapeños", "regular"));
                    break;
                case "6":
                    sandwich.addTopping(new Toppings("Cucumbers", "regular"));
                    break;
                case "7":
                    sandwich.addTopping(new Toppings("Pickles", "regular"));
                    break;
                case "8":
                    sandwich.addTopping(new Toppings("Guacamole", "regular"));
                    break;
                case "9":
                    sandwich.addTopping(new Toppings("Mushrooms", "regular"));
                    break;
                case "0":
                    addingVeggies = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }

//        boolean addingVeggies = true;
//
//        while (addingVeggies) {
//            System.out.println("Choose Veggies: ");
//
//            for (String veggie : SandwichHelper.REGULAR) {
//                System.out.println(veggie);
//            }
//
//            String veggieSelection = scanner.nextLine();
//
//            // Matches your naming style more closely
//            Toppings selectedVeggie = new Toppings(veggieSelection, "regular");
//            sandwich.addTopping(selectedVeggie);
//
//            System.out.println("Would you like to add more?");
//            System.out.println("Y/N");
//
//            if (!scanner.nextLine().equalsIgnoreCase("y")) {
//                addingVeggies = false;
//            }
//        }

            //sauces

        boolean addingSauce = true;
        //mayo, mustard, ketchup, ranch, thousand islands, vinaigrette

        while (addingSauce) {
            System.out.println("Choose a sauce topping:");
            System.out.println("1) Mayo");
            System.out.println("2) Mustard");
            System.out.println("3) Ketchup");
            System.out.println("4) Ranch");
            System.out.println("5) Thousand Island");
            System.out.println("6) Vinaigrette");
            System.out.println("0) Done adding veggies");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    sandwich.addTopping(new Toppings("Mayo", "sauce"));
                    break;
                case "2":
                    sandwich.addTopping(new Toppings("Mustard", "sauce"));
                    break;
                case "3":
                    sandwich.addTopping(new Toppings("Ketchup", "sauce"));
                    break;
                case "4":
                    sandwich.addTopping(new Toppings("Ranch", "sauce"));
                    break;
                case "5":
                    sandwich.addTopping(new Toppings("Thousand Island", "sauce"));
                    break;
                case "6":
                    sandwich.addTopping(new Toppings("Vinaigrette", "sauce"));
                    break;
                case "0":
                    addingSauce = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }

            //side

            System.out.println("Would you like your sandwich toasted? ");
            System.out.println("Y/N");
            if (!scanner.nextLine().equalsIgnoreCase("y")) {
                sandwich.setToasted(false);
            } else {
                sandwich.setToasted(true);
            }

            order.addItemToOrder(sandwich);

        }


    //loop through size of drinks and what kind of drink (advise cost) case small/med/large
    private void addDrink (Order order) {

                System.out.println("What size drink would you like? ");
                System.out.println("small");
                System.out.println("medium");
                System.out.println("large");

                String size = scanner.nextLine();


                System.out.println("What flavor would you like?");
                System.out.println("Coke");
                System.out.println("Sprite");
                System.out.println("Sweet Tea");
                System.out.println("Tahiti Treat");
                System.out.println("Water");

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
//        switch (){
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




