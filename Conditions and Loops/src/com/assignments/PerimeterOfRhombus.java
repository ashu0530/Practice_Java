package com.assignments;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter side of rhombus");
        float side = in.nextFloat();

        if (side <= 0){
            System.out.println("Side should be positive");

        }
        else {
            System.out.println("Perimeter of rhombus is: " + 4*side);
        }
    }
}
