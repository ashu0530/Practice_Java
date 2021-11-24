package com.assignments;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter base and height of prism to calculate volume");
        float base = in.nextFloat();
        float height = in.nextFloat();

        if ( base <= 0 || height <= 0){
            System.out.println("base and height should be positive");
        }
        else{
            System.out.println("The volume of prism is: " + base*height );
        }
    }
}
