package com.company;

public class ReverseNumber {
    // Write a java program that prompts user to enter a number and returns its reverse.
    // we have to generate the reverse
    // if user enters 12345
    // Output: 54321

    public static void main(String[] args) {
        int num=12345;

        while(num!=0){
            System.out.print(num%10);
            num=num/10;
        }
    }

}
