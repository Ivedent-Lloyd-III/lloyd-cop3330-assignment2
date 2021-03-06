package oop.assignment2.ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 25
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution25 {
    private static final Scanner in = new Scanner(System.in);

    private static int letterCount;
    private static int numberCount;
    private static int otherCount;

    public static void main(String[] args){

        String userInputPassword = userInput();
        passwordValidator(userInputPassword);

        String output = generateoutputStatement(userInputPassword);

        outputStatement(output, userInputPassword);

    }

    private static String userInput(){

        System.out.println("Please input your password to indicate your password's strength.");
        return in.nextLine();

    }

    private static void passwordValidator(String userInputPassword){

        letterCount = 0;
        numberCount = 0;
        otherCount = 0;

        for( int i = 0; i < userInputPassword.length(); i++  ){

            char passwordCharacters = userInputPassword.charAt(i);

            if(Character.isLetter(passwordCharacters)){
                letterCount = letterCount + 1;
            }
            else if(Character.isDigit(passwordCharacters)){
                numberCount = numberCount + 1;
            }
            else{
                otherCount = otherCount + 1;
            }
        }
    }

    private static String generateoutputStatement(String userInputPassword){

        if( userInputPassword.length() < 8 ){

            if( numberCount == (userInputPassword.length() ) ){
                return "very weak password.";
            }
            else if( letterCount == (userInputPassword.length() ) ){
                return "weak password.";
            }
            else{
                return "weak password.";
            }

        }
        else{
            if( letterCount >= 1  ){
                if( numberCount >= 1){
                    if( otherCount >= 1){
                        return"very strong password.";
                    }
                    else {
                        return"strong password.";
                    }
                }
                else{
                    return"weak password.";
                }
            }
            else{
                return"weak password.";
            }
        }
    }

    private static void outputStatement(String output, String userInputPassword){
        System.out.println("The password '" +userInputPassword+"' is a "+output+"");
    }
}
