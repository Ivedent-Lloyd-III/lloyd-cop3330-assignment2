package oop.assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculate_Months_Until_Paid_Off_Test(double i, double b, double p) {

        double i = 0.12/365.0;
        double b = 5000;
        double p = 100;

        double expectedResult = 70;

        double result = PaymentCalculator.equals(i, b ,p);
    }
}