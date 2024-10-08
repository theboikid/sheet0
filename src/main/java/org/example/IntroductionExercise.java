package org.example;

public class IntroductionExercise {

    // Method to convert a binary number (represented as an integer array) to decimal
    public static int binary2decimal(int[] binary) throws IllegalArgumentException {
        int decimal = 0;

        // Iterate over the binary array
        for (int i = 0; i < binary.length; i++) {
            // Validate if the binary array contains only 0s and 1s
            if (binary[i] != 0 && binary[i] != 1) {
                throw new IllegalArgumentException("Array must contain only binary digits (0 or 1).");
            }
            // Calculate the decimal value using a bitwise left shift (equivalent to 2^x)
            decimal += binary[i] * (1 << (binary.length - 1 - i));
        }

        return decimal;
    }

    // Make sure this is the last closing brace for the class
}

