package oop.assignment2.ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 31
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution31 {
    private static final Scanner in = new Scanner(System.in);

    private static int userAge;
    private static int userRestingRate;
    private static int targetHeartRate;

    public static void main(String[] args){

        System.out.print("What is your age? ");
        userAge = userNumericalInput();
        System.out.print("What is your resting heart rate? ");
        userRestingRate = userNumericalInput();

        targetHeartRateOutput();

    }

    private static int userNumericalInput(){

        int count = 1;
        String userInput;

        do {
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
        } while( count != 0 );

        int numericalOutput = Integer.parseInt(userInput);
        return numericalOutput;
    }

    private static void targetHeartRateOutput(){

        System.out.println("Resting Pulse: "+userRestingRate+"\t\t\t\tAge: "+userAge+"");

        System.out.println("Intensity \t\t| Rate");
        System.out.println("________________|__________________");
        for( int i = 55; i < 100; i++ ) {

            targetHeartRate = (int) ((((220 - userAge) - userRestingRate) * ( i / 100.0 ) ) + userRestingRate);
            System.out.println(+i+"%\t\t\t\t| "+targetHeartRate+" bpm");
            i = i + 4;

        }
    }

}
