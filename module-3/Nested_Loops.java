package nested_loops;

/*
 * Michael Benko
 * 2026-11-1
 * CSD402-302E Java for Programmers (2273-DD)
 * Module 3.2 Programming Assignment – Nested Loops
 *
 * Description:
 * This program uses nested for loops to display a
 * pyramid pattern of powers of 2. Each row increases
 * to a maximum power of 2 and then decreases back to 1,
 * creating a symmetrical pattern. The program formats
 * the output with leading spaces and places an @ symbol
 * at the end of each line as required by the assignment.
 */

public class Nested_Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 7;
        int space;

        for (int i = 0; i < rows; i++) {
            // 1. Print leading spaces for alignment
            // The last row has 0 spaces, and each row up needs extra spaces
            for (space = 0; space < (rows - 1 - i); space++) {
                // Print leading spaces
                System.out.print("  "); 
            }

            // 2. Print increasing powers of 2
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            // 3. Print decreasing powers of 2
            value /= 4; // Step back to the previous power of 2
            for (int j = 0; j < i; j++) {
                System.out.print(value + " ");
                value /= 2;
            }

            // 4. Print the trailing '@' symbol
            System.out.println("  ".repeat(space)+"@");
        }
    }
}
