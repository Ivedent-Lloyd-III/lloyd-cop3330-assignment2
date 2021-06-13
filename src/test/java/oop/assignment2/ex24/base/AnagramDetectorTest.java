package oop.assignment2.ex24.base;

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
