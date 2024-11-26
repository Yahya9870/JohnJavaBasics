package com.company;

import java.util.Scanner;

public class SumOfDigitsUntilSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        while (number >= 10) {  // this is condition for 1 digit final answer
            int sum = 0;
            int R;   // remainder

            // Code logic for sum of digits

            while (number > 0) {

                R=number%10;
                sum =sum+ R;

                number /= 10;
            }

            // updating the number after each cycle of sum of digits

            number = sum;
        }

        System.out.println("The single-digit sum is: " + number);

        scanner.close();  // not mandatory step however a good programming practice.
    }
}

