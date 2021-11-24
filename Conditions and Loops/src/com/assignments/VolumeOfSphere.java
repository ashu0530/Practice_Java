package com.assignments;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your radius to determine volume of sphere");
        double radius = in.nextDouble();
        double PI = 3.14;
        if(radius<=0){
            System.out.println("Please enter positive value");

        }
        else {
            System.out.println("The volume of sphere is: " + (4.0/3.0)*PI*(radius*radius*radius) );
        }
    }
}
