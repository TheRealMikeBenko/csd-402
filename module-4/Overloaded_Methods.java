package overloaded_methods;

/*
 * Michael Benko
 * 2026-11-07
 * CSD402-302E Java for Programmers (2273-DD)
 * Module 4.2 Programming Assignment – Overloaded Methods
 *
 * Description:
 * This program demonstrates method overloading by calculating
 * the average value of arrays containing different numeric
 * data types. The program displays the original array
 * elements and the average value returned by each overloaded
 * method.
 */
public class Overloaded_Methods {

    public static void main(String[] args) {
        // Test arrays of different data types and sizes
        short[] shortArray = {2, 4, 6}; // 3 elements
        int[] intArray = {10, 20, 30, 40}; // 4 elements
        long[] longArray = {100, 200, 300, 400, 500}; // 5 elements
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5}; // 6 elements
        
        // Display array contents and calculated average
        System.out.println("Short Array:");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(shortArray)+"\n");

        System.out.println("Int Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(intArray)+"\n");
        
        System.out.println("Long Array:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(longArray)+"\n");
        
        System.out.println("Double Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray)+"\n");

    }
    public static short average(short[] array) {
        short total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return (short)(total / array.length);
    }

    public static int average(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    public static long average(long[] array) {
        long total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    public static double average(double[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
    
}
