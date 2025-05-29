package com.subsaredelish.model;

import java.util.ArrayList;
import java.util.List;

//where you put the screens home, order

    public class Order {

       private String customerName;

       //list of OrderItems
        List<OrderItem> items;


        public Order(){
            this.items = new ArrayList<>();
        }

        public void addItemToOrder(OrderItem item){
            this.items.add(item);
        }

        //toString to print out the order to the user
        //and you can use the same to string to print out the order to the receipt

    }

