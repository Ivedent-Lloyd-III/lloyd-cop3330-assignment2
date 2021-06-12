package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class solution32 {

    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number! ");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int difficulty = in.nextInt();

        if (difficulty == 1){

            difficulty1();
        }
        else if(difficulty == 2){

            //difficulty2();
        }
        else {

            // difficulty3();
        }
    }

    private static void difficulty1(){

        int i = 1;
        int guess;
        int randomNumber;
        Random rand = new Random();

        randomNumber = rand.nextInt(9);
        int randomNumberCorrect = randomNumber + 1;

        System.out.print("I have my number. What's your guess?");
        guess = in.nextInt();

        while (guess != randomNumberCorrect) {

            if (guess < randomNumberCorrect) {

                System.out.print("Too low. Guess again: ");
                i = i + 1;
                guess = in.nextInt();

            }
            if (guess > randomNumberCorrect){

                System.out.print("Too high. Guess again: ");
                i = i + 1;
                guess = in.nextInt();
            }

            else {
                break;
            }

            System.out.print("You got it in " + i +" guesses!");

        }

        System.out.print("You got it in " + i +" guesses!");
    }

}


