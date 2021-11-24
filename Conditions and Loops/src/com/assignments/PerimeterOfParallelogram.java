package com.assignments;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your base and side of parallelogram: ");
        float base = in.nextFloat();
        float side = in.nextFloat();

        if(base <= 0 || side <= 0){
            System.out.println("Please enter positive side and base");
        }
        else {
            System.out.println("The perimeter of parallelogram is: " + 2*(base+side));
        }
    }
}
