package com.afshinpaydar.Strings_Numbers_And_Math;

import javax.xml.stream.events.Characters;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Question: Write a program that returns the first non-repeated character from a given string
 *
 * @author  Afshin Paydar
 * @version 1.0
 * @since   2023-01-19
 */

public class Finding_first_non_repeated_character {

    public static String readString() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please type a string that includes duplicate characters: ");
        String inputString = s.nextLine();
        return inputString;
    }
    public static void main(String[] args) {
        String inputString = readString();
        Set<Character> seenChars = new HashSet<>();
        StringBuilder nonRepeatedPrefix = new StringBuilder();

        for (Character c : inputString.toCharArray()) {
            if (!seenChars.contains(c)) {
                nonRepeatedPrefix.append(c);
                seenChars.add(c);
            } else {
                break;
            }
        }
        System.out.println("First non-repeated prefix is: " + nonRepeatedPrefix);

    }
}
