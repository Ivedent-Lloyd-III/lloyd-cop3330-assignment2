package oop.assignment2.ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class solution35 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        namesLoop();

    }

    private static void namesLoop(){

        String input;

        List<String> listofNames = new ArrayList<String>();

        while (true){
            System.out.print("Enter a name: ");
            input = in.nextLine();
            if (input.equals("done")){
                break;
            }
            else {

                listofNames.add(input);
            }
        }

        Random rand = new Random();

        int randomInt = rand.nextInt(listofNames.size());

        String randomName = listofNames.get(randomInt);

        System.out.print("The winner is..." + randomName);
    }
}

