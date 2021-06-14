
package oop.assignment2.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 24
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
        char[] word1Array = new char[word1.length()];
        for (int i = 0; i < word1.length(); i++) {
            word1Array[i] = word1.charAt(i);
        }
        char[] word2Array = new char[word2.length()];
        for (int i = 0; i < word2.length(); i++) {
            word2Array[i] = word2.charAt(i);
        }
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        for (int i = 0; i < word1.length(); i++) {
            if (word1Array[i] != word2Array[i]) {
                return false;
            }
        }
        return true;
    }
}

