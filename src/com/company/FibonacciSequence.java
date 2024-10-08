package com.company;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the terms of the sequence: ");
        int length = input.nextInt();
        int num1 = 0; // first term
        int num2 = 1; // second term
        int num3;     // third term
        System.out.println("The fibonacci sequence is: ");

        for (int i = 0; i <length ; i++) {   // 1. num1=0; num3=0+1=1; num1=1; num2=1
            // 2. num1=1; num3=1+1=2; num1=1; num2=2
            // 3. num1=1; num3=1+2=3; num1=2; num2=3
            // 4. num1=2; num3=2+3=5; num1=3; num2=5
            // 5. num1=3; num3=3+5=8; num1=5; num2=8
            // 6. num1=5; num3=5+8=13; num1=8; num2=13
            // Output on console: 0,1,1,2,3,5
            System.out.print(num1+" ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;


        }
    }
}

