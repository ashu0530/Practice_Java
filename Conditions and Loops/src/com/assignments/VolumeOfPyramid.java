package com.assignments;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter length width and height to determine volume of pyramid: ");
        double length = in.nextDouble();
        double width = in.nextDouble();
        double height = in.nextDouble();

        if ( length <= 0 || width <=0 || height <=0){
            System.out.println("Please enter positive value");
        }
        else {
            System.out.println("The volume of pyramid is: " + (length*width*height)/3);
        }

    }
}
