package com.assignments;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your side: ");
        double side = in.nextDouble();

        if(side<=0){
            System.out.println("Please enter positive value");
        }
        else{
            System.out.println("The volume of cube is: " + 6*side*side);
        }

    }
}
