package com.assignments;

import java.util.Scanner;

public class AreaOfRectangleProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your length and breadth of rectangle: ");

        double length = input.nextDouble();
        double breadth = input.nextDouble();

        double ans = length*breadth;
        System.out.println(ans);
    }
}
