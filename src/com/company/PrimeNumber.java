package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int count = 0;
        // if number is 18 loop will from 2 to 17

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break; // it terminates the loop
            }


        }

        if (count == 1) {
            System.out.println("Composite Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}
