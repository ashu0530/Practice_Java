//Q- Find the nth Fibonacci number
package com.assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to get fibonacci number\n");
        int n = in.nextInt();

        int a = 0; //previous
        int b = 1; //Current index
        //We have 2 numbers so we start from 2
        int count = 2;
        while (count <= n) { //we want count should be less than user input
           int temp = b; //This temp variable is going to index variable
           b = b+a; // 1+0 = 0
           a = temp; //now p = 1
           count++;
        }
        System.out.println(b);
    }

}
