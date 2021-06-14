package oop.assignment2.ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;
import java.util.Random;

public class solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        String output = magicEightBall();

        System.out.print(""+output+"");

    }

    public static String magicEightBall(){

        System.out.print("What's your question? \r\n > ");
        String userInput = in.nextLine();

        Random rand = new Random();

       int randomNumber = rand.nextInt(4);
       int CaseNumber = randomNumber + 1;

       switch(CaseNumber){

           case 1:
               return "Yes";
           case 2:
               return "No";
           case 3:
               return "Maybe";
           case 4:
               return "Ask again later";
       }
        return "";
    }
}
