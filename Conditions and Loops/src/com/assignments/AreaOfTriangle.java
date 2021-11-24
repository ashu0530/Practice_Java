package com.assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your base and height of a triangle: ");
        double base = input.nextDouble();
        double height = input.nextDouble();

        double ans = (base*height)/2;
        System.out.println(ans);
    }
}
