package com.salestax;

import java.util.Scanner;

public class IO {

    public void acceptInput() {
        System.out.print("Enter the Number of Items:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
    }


    public void acceptItems() {
        System.out.print("\nEnter the Item details:\n");
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[3];
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter the item");
            items[i] = scanner.nextLine();
        }

    }


  /*
    public void cointainsImported() {
        str1.toLowerCase().contains(str2.toLowerCase())
    }*/
}
