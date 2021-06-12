package oop.assignment2.ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution28 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       double sums = numberInputs();
       outputStatement(sums);

    }

    private static double numberInputs(){

        double sums = 0;
        for(int i = 0; i < 5; i++){

            System.out.print("Enter a number: ");
            double inputValues = in.nextDouble();
            sums = inputValues + sums;

        }
        return sums;
    }

    private static void outputStatement(double sums){

        System.out.print("The total is "+sums+".");

    }

}
