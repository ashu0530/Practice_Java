package com.assignments;

import java.util.Scanner;

public class Productalldigitofthenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
/* While loop
        int mul = 1;
        while ( num != 0){
            mul = mul* (num%10);
            num = num/10;
        }
        System.out.println(mul);
*/   //using for loop
    int mul;
    for (mul = 1; num != 0; mul = mul*(num%10), num = num/10   )  ;
    System.out.println(mul);


    }
}
