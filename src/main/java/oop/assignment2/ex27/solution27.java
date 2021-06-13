package oop.assignment2.ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution27 {

    private static final Scanner in = new Scanner(System.in);

    private static String firstName;
    private static String lastName;
    private static String inputZIP;
    private static String inputEmployeeID;
    private static int noErrors = 0;

    public static void main(String[] args) {
        userInput();
        validateInput();
    }

    private static void userInput() {

        System.out.print("Enter the first name: ");
        firstName = in.nextLine();

        System.out.print("Enter the last name: ");
        lastName = in.nextLine();

        System.out.print("Enter the ZIP code: ");
        inputZIP = in.nextLine();

        System.out.print("Enter the employee ID: ");
        inputEmployeeID = in.nextLine();
    }

    private static void validateInput() {

       String firstNameValidated = firstnameValidation();
       String lastNameValidated = lastnameValidation();
       String zipValidated = zipValidation();
       String employeeIDValidated = employeeIDValidation();

       outputStatement(firstNameValidated, lastNameValidated, zipValidated, employeeIDValidated);
    }

    private static String firstnameValidation() {


        if( firstName.isBlank() ){
            return "The first name must be filled in.";
        }
        else if ( firstName.length() <= 2 ) {
           return "The first name must have at least two letters.";
        }
        else{
            noErrors = noErrors + 1;
            return "";
        }
    }
    private static String lastnameValidation() {

        if( lastName.isBlank() ){
            return "The last name must be filled in.";
        }
        else if (lastName.length() <= 2) {
            return "The last name must have at least two letters.";
        }
        else{
            noErrors = noErrors + 1;
            return "";
        }
    }
    private static String zipValidation() {

        if(inputZIP.matches("[a-zA-Z_]+")){
            return "The zip code must be a 5 digit number.";
        }
        else if (inputZIP.length() != 5) {
            return "The zip code must be 5 digits long.";
        }
        else{
            noErrors = noErrors + 1;
            return "";
        }
    }
    private static String employeeIDValidation(){

        if(inputEmployeeID.matches("[A-Z]{2}[-]{1}[0-9]{4}")){
            noErrors = noErrors + 1;
            return "";
        }
        else{
            return "The employee ID must be in the format AA-1234";
        }
    }

    private static void outputStatement(String firstNameValidated, String lastNameValidated, String zipValidated, String employeeIDValidated) {

        if(noErrors == 4){
            System.out.print("There were no errors found.");
        }
        else {
            System.out.print("" +firstNameValidated+ "\r\n" +lastNameValidated+ "\r\n" +zipValidated+ "\r\n" +employeeIDValidated+ "");
        }
    }
}


