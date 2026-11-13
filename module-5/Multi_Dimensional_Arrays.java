package multi_dimensional_arrays;

/*
 * Michael Benko
 * 2026-11-13
 * CSD402-302E Java for Programmers (2273-DD)
 * Module 5.2 Programming Assignment – Multi-Dimensional Arrays
 *
 * Description:
 * This program demonstrates method overloading by using
 * overloaded methods to locate the largest and smallest
 * elements in two-dimensional int and double arrays.
 * Each method returns a one-dimensional array containing
 * the row and column location of the element found.
 */
public class Multi_Dimensional_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test arrays used to verify largest and smallest location methods
        double[][] doubleArray = {{3.2, 4.1, 9.5},{1.7, 8.8, 2.4}};
        int[][] intArray = {{3, 4, 9},{1, 8, 2}};
        
        // Store locations returned by each overloaded method
        int[] largestDoubleLocation = locateLargest(doubleArray);
        int[] largestIntLocation = locateLargest(intArray);
        int[] smallestDoubleLocation = locateSmallest(doubleArray);
        int[] smallestIntLocation = locateSmallest(intArray);
        
        // Display returned row and column locations
        System.out.println("Largest double location: Row " + largestDoubleLocation[0] + ", Column " + largestDoubleLocation[1]);
        System.out.println("Which holds the value of "+ doubleArray[largestDoubleLocation[0]][largestDoubleLocation[1]]+"\n");
        System.out.println("Largest int location: Row " + largestIntLocation[0] + ", Column " + largestIntLocation[1]);
        System.out.println("Which holds the value of "+ intArray[largestIntLocation[0]][largestIntLocation[1]]+"\n");
        System.out.println("Smallest double location: Row " + smallestDoubleLocation[0] + ", Column " + smallestDoubleLocation[1]);
        System.out.println("Which holds the value of "+ doubleArray[smallestDoubleLocation[0]][smallestDoubleLocation[1]]+"\n");
        System.out.println("Smallest int location: Row " + smallestIntLocation[0] + ", Column " + smallestIntLocation[1]);      
        System.out.println("Which holds the value of "+ intArray[smallestIntLocation[0]][smallestIntLocation[1]]+"\n");
    }
    
    public static int [ ] locateLargest (double [ ][ ] arrayParam){
        // Initialize the largest value using the first element
        double largestValue = arrayParam[0][0];

        // Track the location of the largest value found
        int largestRow = 0;
        int largestColumn = 0;
        
        // Traverse every row and column in the array
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                // Update location when a larger value is found
                if (arrayParam[row][col] > largestValue) {
                    largestValue = arrayParam[row][col];
                    largestRow = row;
                    largestColumn = col;
                }
            }
        }
        // Return the row and column location of the largest value
        return new int[] {largestRow, largestColumn};
    }
    
    public static int [ ] locateLargest (int [ ][ ] arrayParam){
        // Initialize the largest value using the first element
        int largestValue = arrayParam[0][0];
        
        // Track the location of the largest value found
        int largestRow = 0;
        int largestColumn = 0;
        
        // Traverse every row and column in the array
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                // Update location when a larger value is found
                if (arrayParam[row][col] > largestValue) {
                    largestValue = arrayParam[row][col];
                    largestRow = row;
                    largestColumn = col;
                }
            }
        }
        // Return the row and column location of the largest value
        return new int[] {largestRow, largestColumn};
    }
    
    public static int [ ] locateSmallest (double [ ][ ] arrayParam){
        // Initialize the smallest value using the first element
        double smallestValue = arrayParam[0][0];
        
        // Track the location of the smallest value found
        int smallestRow = 0;
        int smallestColumn = 0;
        
        // Traverse every row and column in the array
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                // Update location when a smaller value is found
                if (arrayParam[row][col] < smallestValue) {
                    smallestValue = arrayParam[row][col];
                    smallestRow = row;
                    smallestColumn = col;
                }
            }
        }
        // Return the row and column location of the smallest value
        return new int[] {smallestRow, smallestColumn};
    }
    
    public static int [ ] locateSmallest (int [ ][ ] arrayParam){
        // Initialize the smallest value using the first element
        int smallestValue = arrayParam[0][0];
        
        // Track the location of the smallest value found
        int smallestRow = 0;
        int smallestColumn = 0;
        
        // Traverse every row and column in the array
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                // Update location when a smaller value is found
                if (arrayParam[row][col] < smallestValue) {
                    smallestValue = arrayParam[row][col];
                    smallestRow = row;
                    smallestColumn = col;
                }
            }
        }
        // Return the row and column location of the smallest value
        return new int[] {smallestRow, smallestColumn};
    }
}
