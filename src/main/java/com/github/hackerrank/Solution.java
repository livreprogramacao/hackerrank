package com.github.hackerrank;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printWeirdOrNotWeird(N);
        scanner.close();
    }

    /**
     * Print Weird if the number is weird; otherwise, print Not Weird.
     */
    static void printWeirdOrNotWeird(int number) {

        final String numberIsWeird = "Weird";
        final String numberIsNotWeird = "Not " + numberIsWeird;

        String message = numberIsWeird;

        final boolean even = number % 2 == 0;

        if (even) {
            boolean range = number > 1 && number < 6;
            boolean rangeNotWeird = number > 20;
            if ( range || rangeNotWeird ) {
                message = numberIsNotWeird;
            }
        }

        System.out.println(message);

    }

}