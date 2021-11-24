package com.assignments;

import java.util.Scanner;

public class Findnoofnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number\n");
        int num = in.nextInt();

        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if(rem == 3){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }

}
