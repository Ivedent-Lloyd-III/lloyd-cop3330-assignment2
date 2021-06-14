package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution31Test {

    @Test
    void heart_rate_bpm() {

        int value1 = 22;
        int value2 = 65;
        double value3 = 0.55;

        double result;

        result = (int) ((((220 - value1)-value2)*value3)+value2);

        assertEquals(138,result,0.001);
    }
}