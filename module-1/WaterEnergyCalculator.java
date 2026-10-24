/*
 * Michael Benko
 * 2026-10-24
 * CSD402-302E Java for Programmers (2273-DD)
 * Module 1.3 Programming Assignment – Water Heating Energy Calculator
 *
 * Description:
 * This program calculates the amount of energy (in Joules) required
 * to heat water from an initial temperature to a final temperature.
 * The user enters:
 *   - water mass in kilograms
 *   - initial temperature in Celsius
 *   - final temperature in Celsius
 *
 * Formula:
 *   Q = waterMass * (finalTemperature - initialTemperature) * 4184
 *
 * Q represents the energy in Joules.
 */

import java.util.Scanner;

public class WaterEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for water mass
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble(); // Assumes valid numeric input as exception handling is not yet covered in this module.

        // Prompt user for initial temperature
        System.out.print("Enter the initial temperature (C): "); // Removed ° due to a character encoding mismatch when displayed. 
        double initialTemperature = input.nextDouble(); // Assumes valid numeric input as exception handling is not yet covered in this module.

        // Prompt user for final temperature
        System.out.print("Enter the final temperature (C): "); // Removed ° due to a character encoding mismatch when displayed. 
        double finalTemperature = input.nextDouble(); // Assumes valid numeric input as exception handling is not yet covered in this module.

        // Calculate energy using the formula
        double q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display result
        System.out.println("\nThe energy needed (Q) is " + q + " Joules.");

        input.close();
    }
}
