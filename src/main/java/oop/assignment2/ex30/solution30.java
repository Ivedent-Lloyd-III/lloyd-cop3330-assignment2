package oop.assignment2.ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

public class solution30 {

    public static void main(String[] args) {

        for(int i = 1; i <= 12; i++){

            for(int j = 1; j <= 12; j++){

                int numberCell = i * j;

                System.out.print(String.format("%5d", numberCell));

                    if( j == 12 ){

                        System.out.println("");

                    }
            }
        }
    }
}
