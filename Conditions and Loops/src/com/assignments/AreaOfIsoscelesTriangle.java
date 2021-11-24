package com.assignments;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base and height\n");
        double base = input.nextDouble();
        double height = input.nextDouble();

        double ans = (1 * base * height) / 2;
        System.out.println("The area is: " + ans );
    }
}
