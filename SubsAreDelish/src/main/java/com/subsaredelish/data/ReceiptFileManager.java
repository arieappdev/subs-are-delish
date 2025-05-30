package com.subsaredelish.data;

import com.subsaredelish.model.Order;
import com.subsaredelish.model.OrderItem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {
    public static void saveReceipt(Order order) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String receiptTimeStamp = LocalDateTime.now().format(formatter)+".txt";
        String receiptFile = "receipts/";


        try (FileWriter fileWriter = new FileWriter(new File(receiptFile,receiptTimeStamp))) {

            for(OrderItem item: order.getItems()){
                fileWriter.write(item.toString());
            }
            System.out.println("Receipt has been saved to: " + receiptTimeStamp);
        } catch (IOException error) {
            System.out.println("Failed to save receipt: " + error.getMessage());
        }
    }
}
