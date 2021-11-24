package com.assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int ans = 0;  //Initialise the ans with 0 first
        while ( true ){
            //take the operator as input         //Take input operator from user till user doesn't press q
            System.out.println("Enter the Operator: ");
            char op = in.next().trim().charAt(0);   //Take character symbol at first index
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){  //Condition check for operator

                // input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();  //new line


                if ( op == '+'){
                    ans = num1 + num2;
                }
                if ( op == '-'){
                    ans = num1-num2;
                }
                if ( op == '*'){
                    ans = num1*num2;
                }
                if ( op == '/') {
                    if (num2 !=0) {
                        ans = num1/num2;
                    }
                }
                if ( op == '%'){
                    ans = num1%num2;
                }
            } else if ( op == 'q' || op == 'Q'){     //For quiting the calculator
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }

    }
}
