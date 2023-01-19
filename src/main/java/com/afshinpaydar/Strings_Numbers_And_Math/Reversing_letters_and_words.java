package com.afshinpaydar.Strings_Numbers_And_Math;

import java.util.Scanner;

/**
 * Question: Write a program that reverses the letters of each word and a program that reverses
 * the letters of each word and the words themselves
 *
 * @author  Afshin Paydar
 * @version 1.0
 * @since   2023-01-19
 */
public class Reversing_letters_and_words {

    private static boolean lettersAndWords() {
        Scanner s = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Reverse word only?(W) or reverse letters and words(A)? ");
            answer = s.next();
        } while (!answer.equals("W") && !answer.equals("A"));
        return answer.equals("A") ? true: false;
    }
    private static String readString() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please type a line of string included with words: ");
        String inputString = s.nextLine();
        return inputString;
    }

    private static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }
    public static void main(String[] args) {
        boolean answer = lettersAndWords();
        String inputLine = readString();
        String[] words = inputLine.split(" ");
        StringBuilder reverseWords = new StringBuilder();
        if(answer) {
            // Reverse word letter and words.
            reverseWords.append(reverse(inputLine));
        } else {
            // Reverse word only
            for(String word: words) {
                reverseWords.append(reverse(word) + " ");
            }
        }
        // Print the result
        System.out.println(reverseWords);
    }
}
