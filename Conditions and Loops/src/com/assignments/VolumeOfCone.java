package com.assignments;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius and height for cone: ");
        float radius = in.nextFloat();
        float height = in.nextFloat();
        float PI = 3.14f;
        if ( radius <= 0 || height <= 0){
            System.out.println("Please enter positive value");
        }
        else {
            System.out.println("The volume of cone is: " + PI*radius*radius*height/3);
        }
    }
}
