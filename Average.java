import java.util.Scanner;

public class Average {

    // Method to calculate the average of an array of doubles
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Create an array to store the 10 double values
        double[] userInput = new double[10];

        // Prompt the user to enter 10 double values
        System.out.println("Enter 10 double values:");

        // Read the 10 double values from the user
        for (int i = 0; i < 10; i++) {
            userInput[i] = input.nextDouble();
        }

        // Calculate and display the average
        System.out.println("The average is: " + average(userInput));

        // Close the scanner
        input.close();
    }
}

// Pseudocode
// BEGIN
    // FUNCTION average(array)
        // SET sum to 0
        // FOR each number in array
            // ADD number to sum
        // END FOR
        // RETURN sum divided by array length
    // END FUNCTION

    // CREATE scanner for user input
    // CREATE an empty array for 10 doubles

    // PRINT "Enter 10 double values:"
    // FOR i FROM 1 to 10
        // READ user input into the array
    // END FOR

    // CALL average with the array and PRINT the result
    // CLOSE scanner
// END