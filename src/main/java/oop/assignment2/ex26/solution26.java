package oop.assignment2.ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution26 {
    private static final Scanner in = new Scanner(System.in);

    private static double userBalance;
    private static double userAPR;
    private static double userMonthlyPayment;

    public static void main(String[] args){

        userinputNumericalValues();

        PaymentCalculator pc = new PaymentCalculator();
        int totalMonths = (int) pc.calculateMonthsUntilPaidOff(userBalance, userAPR, userMonthlyPayment);

        outputStatement(totalMonths);

    }

    private static void userinputNumericalValues(){

        double inputAPR;

        System.out.print("What is your balance? ");
        userBalance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        inputAPR = in.nextDouble();
        userAPR = inputAPR / 100.0;

        System.out.print("What is the monthly payment you can make? ");
        userMonthlyPayment = in.nextDouble();

    }

    private static void outputStatement(int totalMonths){

        System.out.print("It will take you "+totalMonths+" months to pay off this card.");

    }
}
