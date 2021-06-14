package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class solution32 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");

        do {
            System.out.println("Enter the difficulty level (1, 2, 3) or press 4 to quit: ");
            int inputDifficulty = in.nextInt();
            int maxNumber;

            if (inputDifficulty == 1) {
                maxNumber = 10;
                guessGame(maxNumber);
            } else if (inputDifficulty == 2) {
                maxNumber = 100;
                guessGame(maxNumber);
            } else if (inputDifficulty == 3) {
                maxNumber = 1000;
                guessGame(maxNumber);
            } else if (inputDifficulty == 4){
                break;
            }else{
            System.out.print("That is not a proper difficulty input. ");
            }
        } while(true);

        }

    private static void guessGame(int maxNumber) {
        int count = 1;
        int userGuess;
        int randomNumber;

        Random randomGen = new Random();
        randomNumber = randomGen.nextInt(maxNumber);

        System.out.print("I have my number. What's your guess? ");
        userGuess = in.nextInt();

        do {
            if( userGuess < randomNumber ){
                System.out.println("Too low. Guess again: ");
                userGuess = in.nextInt();
                count++;
            }
            if( userGuess > randomNumber ){
                System.out.println("Too high. Guess again: ");
                userGuess = in.nextInt();
                count++;
            }
            if( userGuess == randomNumber){
                System.out.println("You got it in "+count+" guesses!");
                break;
            }
        } while(true);
    }
}


