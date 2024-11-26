package com.company;

import java.util.Scanner;

public class ReverseNumber {
    // Write a java program that prompts user to enter a number and returns its reverse.
    // we have to generate the reverse
    // if user enters 12345
    // Output: 54321

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int temp = num; // thats a temporary variable to store actual value of num
        int rev=0; // reverse
        int R; // Remained

        // Wrong Method

//        while(num!=0){
//            System.out.print(num%10);
//            num=num/10;
//        }

        // Correct Method:
        // Imagine num = 1234
        while (num != 0) {

            R = num % 10; // 1. 4  2. 3    3. 2  4. 1
            rev = rev * 10 + R; //1. 4  2. 43  3. 432  4. 4321
            num = num / 10; // 1. 123  2. 12  3. 1   4. 0

        }

        System.out.println("Reverse of " + temp + " is " + rev);


    }

}
