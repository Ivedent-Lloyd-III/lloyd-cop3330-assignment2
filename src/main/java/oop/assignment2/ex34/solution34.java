package oop.assignment2.ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class solution34 {
    private static final Scanner in = new Scanner(System.in);

    private static String removedEmployee;

    public static void main(String[] args){

        employeeList();

        nameListReturn nlr = new nameListReturn();
        nlr.newEmployeeNameList(removedEmployee);

    }

    private static void employeeList(){

        System.out.print("""
                There are 5 employees:
                John Smith
                Jackie Jackson
                Chris Jones
                Amanda Cullen
                Jeremy Goodwin""");

        System.out.print("\r\nEnter an employee's name to remove: ");
        removedEmployee = in.nextLine();

    }

}
