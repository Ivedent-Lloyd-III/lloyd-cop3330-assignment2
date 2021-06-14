package oop.assignment2.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 24 Test
 *  Copyright 2021 Ivedent Lloyd III
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_other_anagrams() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "tone");

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_non_anagrams() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("difo", "god");

        assertFalse(actual);
    }
}