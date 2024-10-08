package com.company;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Write a Java Program that prompts user to enter an integer and returns sum of digits in that particular integer provided by the user.
// Sample Input: 1234
// Sample Output: 10
// Sample Input: 54321
// Sample Output: 15

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int sum = 0;
        int r;  // remainder
        // num =   1   2      3          4+3+2+1
        while (num != 0) {
            r = num % 10;
            sum = sum + r;

            num = num / 10;

        }


        System.out.println("Sum of digits is: " + sum);
    }
}
