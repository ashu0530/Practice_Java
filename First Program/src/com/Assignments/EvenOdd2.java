// Write a program to print whether a number is even or odd, also take input.
package com.Assignments;

import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = input.nextInt();

        if ( num > 0 ){
            System.out.println("The number is Positive");
            if ( num % 2 == 0){
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        else if ( num < 0){
            System.out.println("The number is negative");
            if ( num % 2 == 0){
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        else {
            System.out.println("Zero");
        }
    }
}
