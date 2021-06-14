package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution28Test {

    @Test
    void addition_test() {

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;
        int value4 = 4;
        int value5 = 5;

        int result = value1+value2+value3+value4+value5;

        assertEquals(15,result);
    }
}