//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
package com.Assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is simple interest program please enter your principle\n");
        float principle = input.nextFloat();
        System.out.println("Please enter your rate\n");
        float rate = input.nextFloat();
        System.out.println("Please enter your time\n");
        float time = input.nextFloat();

        float output = (principle*rate*time)/100;
        System.out.println("Your output is"
                + output );
    }
}
