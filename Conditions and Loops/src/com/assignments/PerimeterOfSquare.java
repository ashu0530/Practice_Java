package com.assignments;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter side of square");
        float side = in.nextFloat();

        if (side <= 0){
            System.out.println("Side should be positive");

        }
        else {
            System.out.println("Perimeter of square is: " + 4*side);
        }
    }
}
