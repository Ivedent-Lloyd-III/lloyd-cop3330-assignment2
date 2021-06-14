package oop.assignment2.ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 38
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution38 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

       String userInput =  arrayInput();
       char[] inputArray = inputArray(userInput);

       outputStatement(inputArray, userInput);
    }


    private static String arrayInput(){

        System.out.print("Enter a list of numbers separated by spaces: ");
        String userInput = in.nextLine();

        return userInput;

    }

    private static char[] inputArray(String userInput){

        char[] inputArray = new char[userInput.length()];
        for( int i = 0; i < userInput.length(); i++ ){
            inputArray[i] = userInput.charAt(i);
        }
        return inputArray;
    }

    private static void outputStatement(char[] inputArray, String userInput){

        System.out.print("The even numbers are");

        for( int i = 0; i < userInput.length(); i++ ){
            if ( inputArray[i] % 2 == 0 ){
                System.out.print(""+inputArray[i]);
            }
        }
    }
}
