package Bolante.Shekinah;

// Bolante Shekinah | BSCS-DS 1st Year | Midterms 2nd Semester
// Write a Java program to find the sum of digits of a large number using BigInteger.

import java.io.File;  // Code Structure: Import necessary libraries
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

class MidtermReq {
    public static void main(String[] args) {
        // File to be read
        File file = new File("input.txt");

        try {
            Scanner scanner = new Scanner(file);

            // Read the large number from the text file
            String numberStr = scanner.nextLine();
            BigInteger number = new BigInteger(numberStr);

            // Calculate the sum of the digits of the large number
            BigInteger sumOfDigits = calculateSumOfDigits(number);

            // Print the sum of digits
            System.out.println("\nThe Sum of digits: " + sumOfDigits + "\n ~Thanks and Have a great day! \n");
            // I added a couple of '\n' just to ensure the neatness of the output.

            scanner.close();  // Close the scanner to free resources
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
            e.printStackTrace();
        }
    }

    
    private static BigInteger calculateSumOfDigits(BigInteger number) {
        BigInteger sumOfDigits = BigInteger.ZERO;

        while (number.compareTo(BigInteger.ZERO) > 0) {
            // Extract the last digit
            BigInteger lastDigit = number.remainder(BigInteger.TEN);
            // Add the last digit to the sum
            sumOfDigits = sumOfDigits.add(lastDigit);
            // Remove the last digit from the number
            number = number.divide(BigInteger.TEN);
        }

        return sumOfDigits;
    }
}
