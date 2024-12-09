package com.company;

public class DoWhileLoop {
    public static void main(String[] args) {
        // The do while loop.

        // This is the only loop that gets executed one time at least even if the given condition is not true.

        int i = 0;

        do{
            System.out.println("Hello World!!!!");
            i++;
        }
        while (i > 1000);

        for (int j = 0; j >1000 ; j++) {

            System.out.println("Hello For Loop");

        }

        int k=0;

        while(k>1000){
            System.out.println("Hello While Loop");
            k++;
        }
    }
}
