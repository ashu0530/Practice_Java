//Input currency in rupee and output in dollar.
package com.Assignments;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your currency in Rupees : \n");
        double rupees = input.nextDouble();

        int dollar = 70;
        System.out.println("Dollars = "
                + rupees/dollar );

        System.out.println();


    }
}
