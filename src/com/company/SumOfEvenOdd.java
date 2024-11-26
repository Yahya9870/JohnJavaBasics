package com.company;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want sum of odd and even numbers: ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("The sum of even numbers is: ");

        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                evenSum += i; // evenSum = evenSum+i;
            }

        }

        System.out.println(evenSum);

        System.out.println("The sum of odd numbers is: ");
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                oddSum += i; // oddSum = oddSum+i;
            }
        }

        System.out.println(oddSum);

    }
}


