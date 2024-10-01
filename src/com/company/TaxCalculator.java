package com.company;

/**
 * The {@code TaxCalculator} class calculates income tax based on salary brackets.
 * It contains methods to calculate tax based on different brackets and a main method
 * to run the program.
 * @author Yahiya
 */
public class TaxCalculator {

    /**
     * Calculates tax for a given salary.
     * <p>
     * The method determines the tax bracket based on the salary and applies the corresponding tax rate.
     *
     * @param salary the salary for which the tax is to be calculated
     * @return the calculated tax amount
     */
    public static double calculateTax(double salary) {
        if (salary <= 40000) {
            return salary * 0.10;  // 10% tax
        } else if (salary <= 85000) {
            return 4000 + (salary - 40000) * 0.20;  // $4000 is the tax for the first $40,000
        } else {
            return 13000 + (salary - 85000) * 0.30;  // $13000 is the tax for the first $85,000
        }
    }

    /**
     * This is the main method that initiates the tax calculation process.
     * <p>
     * It prompts the user to input their salary, calculates the tax based on the input,
     * and displays the result.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        double tax = calculateTax(salary);
        System.out.printf("The tax on a salary of $%.2f is $%.2f.%n", salary, tax);

        scanner.close();
    }
}

