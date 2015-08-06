package com.salestax;

import java.util.ArrayList;
import java.util.Scanner;

public class IO {

    ArrayList<String> notToadd;
    ArrayList<String> toAdd;


    public IO(ArrayList<String> notToadd, ArrayList<String> toAdd) {
        this.notToadd = notToadd;
        this.toAdd = toAdd;
    }

    public void acceptInput() {
        System.out.print("Enter the Number of Items:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
    }


    public void acceptItems(ArrayList<String> notToadd, ArrayList<String> toAdd) {
        System.out.print("\nEnter the Item details:\n");
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[3];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter the item");
            items[i] = scanner.nextLine();
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("imported")) {
                notToadd.add(items[i]);
            } else {
                toAdd.add(items[i]);
            }
        }
    }
}

