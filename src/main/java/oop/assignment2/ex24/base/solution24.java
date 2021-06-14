package oop.assignment2.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 24 Test
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args){

        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);
        System.out.print(output);
    }

    public static void readUserInput(){
        System.out.println("Enter word 1");
        word1 = in.nextLine();

        System.out.println("Enter word 2");
        word2 = in.nextLine();
    }

    public static String generateOutput(boolean isAnagram){
        String output;
        if(isAnagram){
            output = "\"" +word1+ "\" and \"" +word2+ "\" are anagrams.";
        }
        else {
            output = "\"" +word1+ "\" and \"" +word2+ "\" are not anagrams.";
        }
        return output;
    }
}