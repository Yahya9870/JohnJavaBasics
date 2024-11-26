package com.company;

public class Methods {
    // Methods are generally code snippets that are designed to perform specific tasks.
    // reduce repetition of code and increases code reusability.

    // In other programming languages like c, python we call functions and in java we call methods.

    // Question: Write a program to print you name.

    public static void main(String[] args) {
       // System.out.println("John");

        // some other coding logic 100 lines

       // System.out.println("John");

        // Calling a method

        //printName();

        int tom=10;
        int harry=20;

//        addIntegers(tom,harry);

        // Option 1:

       // System.out.println("The product of given numbers is: "+intProd(tom,harry));
        // Option 2:
       int ans = intProd(tom,harry) ;

       System.out.println("The product of given numbers is: "+ans);

        // Difference between parameters and arguments?

        // Parameters are like what and how many values taken by method is set while creating a method.

        // Arguments are real values according to parameters at the time pf calling.



    }

    // declaration and definition of a method
    // non-returning and non parameterized methods.
    public static void printName(){
        System.out.println("Method Called successfully");
        System.out.println("My Name is John");
        System.out.println("I live in GVA");
        System.out.println("I am from South Korea");

        System.out.println("-----------------------------------------------");
    }

    // There are 4 types of methods.

    // 1. non-returning and non parameterized methods.
    // 2. non-returning and parameterized methods.
    // 3. returning and parameterized methods.


    // non-returning and parameterized methods.

    // Question: Write a method that take 2 integers values and add it.

    public static void addIntegers(int a, int b){

        int sum = a + b;

        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }

    // Question: Write a program that take 2 int values and return their product.

    public static int intProd(int a, int b){

        int product = a * b;

        return product;
    }



}
