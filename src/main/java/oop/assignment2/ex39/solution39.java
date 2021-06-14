package oop.assignment2.ex39;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 39
 *  Copyright 2021 Ivedent Lloyd III
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution39 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        namesListArray();

    }

    private static void namesListArray() {

        List<String> namesList = new ArrayList<>();
        namesList.add("John Johnson");
        namesList.add("Tou Xiong");
        namesList.add("Michaela Michaelson");
        namesList.add("Jake Jacobson");
        namesList.add("Jacquelyn Jackson");
        namesList.add("Sally Webber");

    }

}
