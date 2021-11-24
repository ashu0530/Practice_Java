package com.assignments;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your base and height: ");
        float base = input.nextFloat();
        float height = input.nextFloat();

        float ans  = base*height;
        System.out.println("The area of parallelogram is: " + ans);
    }
}
