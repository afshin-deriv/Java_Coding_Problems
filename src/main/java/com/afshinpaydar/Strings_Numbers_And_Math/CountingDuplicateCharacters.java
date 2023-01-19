package com.afshinpaydar.Strings_Numbers_And_Math;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Question: Write a program that counts duplicate characters from a given string
 *
 * @author  Afshin Paydar
 * @version 1.0
 * @since   2023-01-19
 */
public class CountingDuplicateCharacters {
    private static String readString() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please type a string that includes duplicate characters: ");
        String inputString = s.nextLine();
        return inputString;
    }
    public static void main(String[] args) {
        String inputString = readString();
        Set<Character> seenUniqueChars = new HashSet<>();
        for (char c: inputString.toCharArray()) {
            seenUniqueChars.add(c);
        }
        int countOfDuplicateChars = inputString.length() - seenUniqueChars.size();
        System.out.println("Input string has " + countOfDuplicateChars + " duplicate characters.");

    }
}
