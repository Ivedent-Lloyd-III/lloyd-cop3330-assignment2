package oop.assignment2.ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */


import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class solution35 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

         String randomWinner = userInputNames();
         outputStatement(randomWinner);
    }

    private static String userInputNames(){
        List<String> userNamesArray = new ArrayList<String>();

        while(true){
            System.out.print("Enter a name: ");
            String userInput = in.nextLine();

            if (userInput.equals( "done" )){
                break;
            }
            else {
                userNamesArray.add(userInput);
            }
        }
        Random randomName = new Random();
        int randomInt = randomName.nextInt(userNamesArray.size());

        return userNamesArray.get(randomInt);
    }

    private static void outputStatement(String randomWinner){
        System.out.print("The winner is... "+randomWinner+"!");
    }
}

