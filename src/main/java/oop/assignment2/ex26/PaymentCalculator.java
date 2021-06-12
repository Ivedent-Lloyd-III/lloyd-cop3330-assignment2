package oop.assignment2.ex26;

import java.lang.Math;

public class PaymentCalculator {

    public double calculateMonthsUntilPaidOff(double userBalance, double userAPR, double userMonthlyPayment) {

    double n;
    double i = userAPR / 365.0;
    double b = userBalance;
    double p = userMonthlyPayment;

    n = -( 1.0 / 30.0 ) * Math.log( (1 + b/p * ( 1 - Math.pow( ( 1 + i ), 30 ) ) ) ) / Math.log( ( 1 + i ) ) ;
    int n_final_value = (int) Math.ceil(n);

    return n_final_value;
    }
}
