package com.assignments;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your sides: ");
        float side = in.nextFloat();

        if (side < 0){
            System.out.println("Please enter positive side!!");
        }
        else {
            System.out.println("The perimeter of circle is: " + 3*side*side*side );
        }
    }
}
