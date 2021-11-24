//Input a number and print all the factors of that number
package com.Assignments;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to find all factors");
        int num = input.nextInt();

        System.out.print("Factors of " + num + " are: ");

        // loop runs
        for (int i = 1; i <= num; ++i) {

            // if number is divided by i
            // i is the factor
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
