package oop.assignment2.ex37;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 37
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution37 {

    private static final Scanner in = new Scanner(System.in);

    private static int minimumLength;
    private static int specialCharacters;
    private static int amountNumbers;

    public static void main(String[] args){

        userInput();

        randomPasswordGenerator rpg = new randomPasswordGenerator();
        rpg.generate_random_password_from_lists(minimumLength, specialCharacters, amountNumbers);

    }

    private static void userInput(){

        System.out.print("What's the minimum length? ");
        minimumLength = in.nextInt();
        System.out.print("How many special characters? ");
        specialCharacters = in.nextInt();
        System.out.print("How many numbers? ");
        amountNumbers = in.nextInt();

    }
}
