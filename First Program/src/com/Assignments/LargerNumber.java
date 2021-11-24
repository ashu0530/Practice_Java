//Take 2 numbers as input and print the largest number.
package com.Assignments;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two value to compare which is largest number");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("The num1 is larger than num 2");
        }
    }
}