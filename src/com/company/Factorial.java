package com.company;

public class Factorial {
    public static void main(String[] args) {
        int num=6; // 6X5X4X3X2X1= 720 is the factorial of 6
        int factorial=1;
        for (int i = 1; i <=num ; i++) {
            factorial=factorial*i;
        }
        // John is learning Java.
        // Iterations of above for loop.
        // 1. factorial=1, num=4, i=1
        // 2. factorial=1, num=4, i=2
        // 3. factorial=2, num=4, i=3
        // 4. factorial=6, num=4, i=4
        // 5. factorial=24 num=4, i=5 (loop terminates)
        System.out.println("Factorial of " + num + " is: " + factorial);

    }

}
