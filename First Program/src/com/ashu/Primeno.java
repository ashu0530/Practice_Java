package com.ashu;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a value to check it is prime or not: ");
        int a = input.nextInt();

        if ( a % 2 == 0){
            System.out.println("The number is Prime");
        }
        else {
            System.out.println("The number is not prime");
        }
    }
}
