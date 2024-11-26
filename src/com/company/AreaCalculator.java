package com.company;

import java.util.Scanner;

public class AreaCalculator {

    // Write a java program to calculate areas of different shapes such as
    // square, rectangle, circle, triangle and trapezoid.
    // with the help of methods for each figure.
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Hello John");
        System.out.println("Welcome to Area Calculator Java Program");

        System.out.println("Pls select your choice");


        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("4. Rectangle");
        System.out.println("5. Rhombus");
        System.out.println("6. Kite");
        System.out.println("7. Parallelogram");
        System.out.println("8. Trapezium");
        System.out.println("9. Quite the Application");

        int choice = input.nextInt();


        // If else-if ladder

        if (choice == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            areaCircle(radius);
        } else if (choice == 2) {
            System.out.print("Enter the side of the square: ");
            double side = input.nextDouble();
            areaSquare(side);
        } else if (choice == 3) {
            System.out.print("Enter the height of the triangle: ");
            double height = input.nextDouble();
            System.out.print("Enter the base of the triangle: ");
            double base = input.nextDouble();
            areaTriangle(height, base);
        } else if (choice == 4) {

            System.out.println("Enter the height of the rectangle: ");
            double height1 = input.nextDouble();
            System.out.println("Enter the base of the rectangle: ");
            double base1 = input.nextDouble();

            areaRectangle(height1, base1);
        } else if (choice == 5) {
            // write your code here for area of rhombus
            System.out.print(" Yet to implement ");
        } else if (choice == 6) {
            // write your code here for area of kite
            System.out.print(" Yet to implement ");
        } else if (choice == 7) {
            // write your code here for area of parallelogram
            System.out.print(" Yet to implement ");
        } else if (choice == 8) {
            // write your code here for area of trapezium
            System.out.print(" Yet to implement ");
        }

        else {
            System.out.println("Exiting the App . . . ");
            System.out.println("Good Bye");
        }



    }

    public static void areaCircle(double radius) {
        double areaCircle = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + areaCircle);
    }

    public static void areaSquare(double side) {
        double squareArea = side * side;
        System.out.println("The area of the square is " + squareArea);
    }

    public static void areaTriangle(double height, double base) {
        double triangleArea = (height * base) / 2;
        System.out.println("The area of the triangle is " + triangleArea);
    }

    public static void areaRectangle(double height, double base) {
        double rectangleArea = (height * base);
        System.out.println("The area of the rectangle is " + rectangleArea);
    }


}
