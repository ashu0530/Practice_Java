package com.assignments;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter length and width: ");
        float length = in.nextFloat();
        float width = in.nextFloat();

        if (length<=0 || width <=0){
            System.out.println("Please enter positive length and width");
        }
        else {
            System.out.println("The perimeter of rectangle is: " + 2*(length+width));
        }
    }
}
