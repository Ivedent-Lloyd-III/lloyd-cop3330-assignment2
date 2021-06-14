package oop.assignment2.ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution30 Test
 *  Copyright 2021 Ivedent Lloyd III
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution30Test {

    @Test
    void multiplication_test() {

        int value1 = 12;
        int value2 = 12;

        int result = value1*value2;
        assertEquals(144,result,0.001);

    }
}