package com.assignments;

import java.util.Scanner;

public class Leetcode1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();



        int sum = 0;
        int mul = 1;

        while ( num !=0 ){
            int t = num%10;
            sum = sum + t;
            mul = mul * t;
            num = num/10;
        }
        System.out.println(mul-sum);
    }



}

