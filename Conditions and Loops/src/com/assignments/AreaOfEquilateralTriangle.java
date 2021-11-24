package com.assignments;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your both side: ");
        float side1 = input.nextFloat();
        float side2 = input.nextFloat();

        if (side1 == 0 || side2 == 0){
            System.out.println("Side should be positive");
        }
        else {
            System.out.println("Area of Equilateral Triangle is: " + (1.73*side1*side2)/4);
        }
    }
}
