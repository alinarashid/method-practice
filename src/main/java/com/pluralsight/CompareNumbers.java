package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        // Test isEven: odd number should print false
        System.out.println(isEven(5));

        // Test isPositive: negative number should print false
        System.out.println(isPositive(-4));

    }

    /* Checks if a number is even
       Returns a boolean: true if even, false if odd
       % 2 gives the remainder; a remainder of 0 means even
    */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


    /* Checks if a number is positive
       Returns a boolean: true if greater than 0, false otherwise
    */
    public static boolean isPositive(double number) {
        return number > 0;
    }
}
