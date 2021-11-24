//Write a program to print factorial of a number, also take input.

package com.Assignments;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("Invalid input\n");
        }
        else if ( num > 0){
            n = num * (num-1);   //Factorial formula
            System.out.println("Factorial of " + num
                    + " is " + n );
        }

    }
}
