package com.assignments;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ans = 0;
        double PI = 3.14;
        while (true) {

            System.out.println("Enter a circle radius: ");
            double radius = input.nextDouble();

            if (radius > 0) {
                ans = PI * radius * radius;
            }
            System.out.println(ans);

        }

    }
}