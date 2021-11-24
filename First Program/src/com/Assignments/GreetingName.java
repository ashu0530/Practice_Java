//Take name as input and print a greeting message for that name.
package com.Assignments;

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = input.nextLine();

        System.out.println("Welcome " + name
                + " to java world");
    }
}
