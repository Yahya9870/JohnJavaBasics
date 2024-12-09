package com.company;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();


        switch (number) {
            case 1:
                System.out.println("First number");
                break;

            case 2:
                System.out.println("Second number");
                break;

            case 3:
                System.out.println("Third number");
        }




    }
}
