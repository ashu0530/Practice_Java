//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.Assignments;

import java.util.Scanner;

public class OperatorQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for Add\n");
        System.out.println("Press 2 for Subtract\n");
        System.out.println("Press 3 for Multiply\n");
        System.out.println("Press 4 for Divide\n");

        int choice = input.nextInt();

        System.out.println("Enter two value");
        double num1 = input.nextInt();
        double num2 = input.nextInt();

        if (choice == 1){
            double a = num1+num2;
            System.out.println("The Addition of two number is "
            + a );
        }
        else if ( choice == 2){
            double b = num1-num2;
            System.out.println("The subtraction of two number is "
            + b );
        }
        else if ( choice == 3){
            double c = num1*num2;
            System.out.println("The Multiplication of two number is "
            + c );
        }
        else if ( choice == 4){
            double d = num1/num2;
            System.out.println("The Division of two number is "
            + d );
        }
        else {
            System.out.println("The choice you select is invalid\n");
        }



    }
}
