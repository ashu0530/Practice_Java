package com.assignments;

import java.util.Scanner;

public class computealldigitsofthenumber {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();           //put  example 281
/*
            int sum = 0;                    //initially sum = 0  --->  now sum = 1 ---> now sum  = 9 ---> sum = 11
            while ( n != 0){                 //while n! = 0 run loop ---> n is still > 0 ---> n > 0 loop run ---> loop = 0
                sum = sum + n%10;          //sum = sum + n%10  = sum = 0+1 sum = 1 ---> sum = 1+8 ---> sum = 9+2 ==11
                n= n/10;                   //n=281/10 = 28 ---> 28/10 = 2 ---> 2/10 =0

            }
*/

            int sum;

            /* Single line that calculates sum */
            for (sum = 0; n > 0; sum += n % 10, n /= 10);
            System.out.println(sum);

        }
    }

