package com.assignments;

import java.util.Scanner;

public class UpperandLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); //it will trim the string and give result of index0 char
        //String word = "Hello";
        //System.out.println(word.charAt(2)); //print l
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");

        } else {
            System.out.println("UpperCase");
        }
    }
}
