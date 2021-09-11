package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {

        int price1, price2, price3, quan1, quan2, quan3;
        double subt, tax, total;
        final double taxrate = 0.055;
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Enter the price of item 1:");
        price1 = input.nextInt();
        System.out.println("Enter the quantity of item 1:");
        quan1 = input.nextInt();
        System.out.println("Enter the price of item 2:");
        price2 = input.nextInt();
        System.out.println("Enter the quantity of item 2:");
        quan2 = input.nextInt();
        System.out.println("Enter the price of item 3:");
        price3 = input.nextInt();
        System.out.println("Enter the quantity of item 3:");
        quan3 = input.nextInt();

        //processing
        subt = (price1 * quan1) + (price2 * quan2) + (price3 * quan3);
        String subs = String.format("$%.2f", subt);
        tax = subt * taxrate;
        String taxs = String.format("$%.2f", tax);
        total = subt + tax;
        String totals = String.format("$%.2f", total);

        //output
        System.out.println("Subtotal: " + subs);
        System.out.println("Tax: " + taxs);
        System.out.println("Total: " + totals);

    }
}
