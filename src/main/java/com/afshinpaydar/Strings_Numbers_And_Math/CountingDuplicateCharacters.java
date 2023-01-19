package com.afshinpaydar.Strings_Numbers_And_Math;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingDuplicateCharacters {
    public static String readString() {
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
