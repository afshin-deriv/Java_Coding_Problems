package com.afshinpaydar.Strings_Numbers_And_Math;

import java.util.Scanner;

/**
 * Question: Write a program that checks whether the given string contains only digits
 *
 * @author  Afshin Paydar
 * @version 1.0
 * @since   2023-01-19
 */
public class Checking_whether_a_string_contains_only_digits {
    public static void main(String[] args) {
        System.out.print("Please enter a string: ");
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        boolean contains_only_digits = true;

        for(char c : inputString.toCharArray()) {
            short charNumber = (short) c;
            if (charNumber < 48 || charNumber > 57) {
                contains_only_digits = false;
                break;
            }
        }
        String result = contains_only_digits ? "This string contains only digits!" : "This string doesn't contain only digits!";
        System.out.println(result);

    }
}
