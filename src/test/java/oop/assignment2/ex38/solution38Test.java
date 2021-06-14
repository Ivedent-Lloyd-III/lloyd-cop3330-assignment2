package oop.assignment2.ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 38 Test
 *  Copyright 2021 Ivedent Lloyd III
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution38Test {

    @Test
    void four_mod_two_equals_zero() {

        int value1 = 4;
        int value2 = 2;
        int result;

        result = value1 % value2;

        assertEquals(0,result);
    }
}