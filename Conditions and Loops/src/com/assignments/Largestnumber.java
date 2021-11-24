//Find the largest of the 3 numbers
package com.assignments;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number\n");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>b && b>c){
            System.out.println("A is largest number : "
                + a);
        } else if ( b>a && b>c){
            System.out.println("B is the largest number: "
            + b);
        } else {
            System.out.println("C is the largest number: "
            + c);
        }



    }
}
