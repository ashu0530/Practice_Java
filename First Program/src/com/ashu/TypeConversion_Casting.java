package com.ashu;

import java.util.Scanner;

public class TypeConversion_Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*    float num = input.nextFloat();
        int num = input.nextFloat();  //give error because int smaller than float
        int num = input.nextInt();  //give error if you give input float value
        System.out.println(num);
    */

    //Type Casting
        //int num = 67.56f; //Throwing error because integer can't be float
       // int num = (int)(67.56f);
       // System.out.println(num);  //print 67 this is known as type casting

    //Narrowing Conversion
/*
        int a = 127;
        byte b;
        b = (byte) a;    //byte = 127
        System.out.println(b);
*/
    //Automatic type promotion in expressions
       // int a = 257;
       // byte b = (byte)(a);  //Explicitly cast into byte a byte is 256
       // System.out.println(b); //output is 1  257 % 256 = 1


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;   //2000/100 = 20
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number);  //Ascii value of A is 65

    //The Type Promotion Rules:

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);

        //float + integer - double = double
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);



    }

}
// Input an integer but it print float Destination type is greater than source type