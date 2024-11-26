package com.company;

import java.util.Scanner;

public class PerfectNumber {
//    Problem Statement: Perfect Number Check
//    A perfect number is a positive integer that is equal to the sum of its proper divisors (divisors excluding the number itself). For example, the number 6 is a perfect number because its proper divisors are 1, 2, and 3, and the sum of these divisors is:
//
//            1+2+3=6
//    Task: Write a Java program to determine if a given number is a perfect number or not.
//
//            Input:
//    A single integer n (1 ≤ n ≤ 10^6).
//    Output:
//    Print "Yes" if the number is a perfect number.
//    Print "No" if the number is not a perfect number.

    // n=7
    // 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum=0;

        for (int i = 1; i <n ; i++) {

            if(n % i == 0) {
                sum = sum+i;
                System.out.println("Proper divisor of the given number: "+i);
            }


        }

        System.out.println("Actual Number entered by user: "+n);
        System.out.println("Sum of its proper divisor: "+sum);

        if(sum==n){
            System.out.println("Yes its a perfect number");
        }

        else {
            System.out.println("Not a perfect number");
        }

    }
}
