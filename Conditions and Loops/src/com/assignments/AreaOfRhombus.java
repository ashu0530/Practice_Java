package com.assignments;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your diagonal lentgth: ");
        float p = input.nextFloat();
        float q = input.nextFloat();

        if (p <= 0 || q <= 0) {
            System.out.println("Length should be positive");
        }

        else {
                System.out.println("Area of rhombus = "
                            + (p * q) / 2);
        }
        }

    }

