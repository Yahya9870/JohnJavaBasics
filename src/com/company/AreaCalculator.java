package com.company;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello John");
        System.out.println("Welcome to Area Calculator Java Program");

        int choice;
        do {
            System.out.println("Please select your choice:");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Rectangle");
            System.out.println("5. Rhombus");
            System.out.println("6. Kite");
            System.out.println("7. Parallelogram");
            System.out.println("8. Trapezium");
            System.out.println("9. Quit the Application");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = input.nextDouble();
                    areaCircle(radius);
                    break;
                case 2:
                    System.out.print("Enter the side of the square: ");
                    double side = input.nextDouble();
                    areaSquare(side);
                    break;
                case 3:
                    System.out.print("Enter the height of the triangle: ");
                    double height = input.nextDouble();
                    System.out.print("Enter the base of the triangle: ");
                    double base = input.nextDouble();
                    areaTriangle(height, base);
                    break;
                case 4:
                    System.out.print("Enter the height of the rectangle: ");
                    double height1 = input.nextDouble();
                    System.out.print("Enter the base of the rectangle: ");
                    double base1 = input.nextDouble();
                    areaRectangle(height1, base1);
                    break;
                case 5:
                    System.out.print("Area of Rhombus yet to implement\n");
                    break;
                case 6:
                    System.out.print("Area of Kite yet to implement\n");
                    break;
                case 7:
                    System.out.print("Area of Parallelogram yet to implement\n");
                    break;
                case 8:
                    System.out.print("Area of Trapezium yet to implement\n");
                    break;
                case 9:
                    System.out.println("Exiting the Application...");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a number between 1 and 9.");
            }
        } while (choice != 9);

        System.out.println("Good Bye!");
        input.close();
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
        double rectangleArea = height * base;
        System.out.println("The area of the rectangle is " + rectangleArea);
    }
}
