package com.company;

import java.util.Scanner;

public class CountOfDigits {
    // Write a Java Program that prompts user to enter an integer and returns number of digits in that particular integer provided by the user.
    // Sample Input: 1234
    // Sample Output: 4
    // Sample Input: 54321
    // Sample Output: 5
    public static void main(String[] args) {
        // If we do %10 with any integer in the world then it will give last digit of that number.
        // for ex: 1234%10=4,  6278%10=8,  3251%10=1

        // If we do /10 with integer in the world then it will eliminate last of that number.
        // for ex: 1234/10= 123

        // RealTime Examples:
//         int num= 1235;
//         int a=num/10;
//         System.out.println(a);
//         System.out.println(a%10);
        // Write a Java Program that prompts user to enter an integer and returns number of digits in that particular integer provided by the user.
        // Sample Input: 1234
        // Sample Output: 4
        // Sample Input: 54321
        // Sample Output: 5

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int count = 0;
        // suppose num is  0  1  2    3
        while (num != 0) {
            num=num/10;
            count++; // 1,2, 3
        }

        System.out.println("The number of digits is: " + count);
    }
}
