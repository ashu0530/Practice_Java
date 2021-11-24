package com.assignments;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your radius: ");
        float radius = input.nextFloat();
        float PI = 3.14f;
        if ( radius == 0){
            System.out.println("Please enter positive side");
        }
        else {
            System.out.println("The perimeter of circle is: " + (2*PI*radius));
        }
    }
}
