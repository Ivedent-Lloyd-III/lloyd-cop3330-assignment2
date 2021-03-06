package oop.assignment2.ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 29
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution29 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       String userReturnRate = userInputValidation();
       int returnRate = Integer.parseInt(userReturnRate);

        outputStatement(returnRate);
    }

    private static String userInputValidation() {
        String userInput;
        do {
            System.out.print("What is the rate of return? ");
            userInput = in.nextLine();

            if( userInput.equals("0") ){
                System.out.println("Sorry, that's not a valid input.");
            }
            else if( userInput.matches("[a-zA-Z_]+")){
                System.out.println("Sorry, that's not a valid input.");
            }
            else{
                break;
            }
        } while(true);
        return userInput;
    }

    private static void outputStatement( int returnRate ){
        int totalYears = 72 / returnRate;
        System.out.print("It will take "+totalYears+" years to double your initial investment.");
    }
}








