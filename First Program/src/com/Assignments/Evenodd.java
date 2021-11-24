// Write a program to print whether a number is even or odd, also take input.
package com.Assignments;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Number\n");
        int num = input.nextInt();

        if (num < 0){
            System.out.println("Please enter positive number");
        }
        else if (num % 2 == 0 ){
            System.out.println("The number " + num + "is even" );
        }
        else {
            System.out.println("The number is odd");
        }

    }
}
