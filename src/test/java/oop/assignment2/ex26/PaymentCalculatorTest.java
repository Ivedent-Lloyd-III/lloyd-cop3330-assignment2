package oop.assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculate_Months_Until_Paid_Off_Test() {

        double n;
        double i = .12 / 365.0;
        double b = 5000;
        double p = 100;

        n = -( 1.0 / 30.0 ) * Math.log( (1 + b/p * ( 1 - Math.pow( ( 1 + i ), 30 ) ) ) ) / Math.log( ( 1 + i ) );
        int n_final_value = (int) Math.ceil(n);

        assertEquals(70,n_final_value);

    }
}