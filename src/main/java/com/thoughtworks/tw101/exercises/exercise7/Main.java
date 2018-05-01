// package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        Number attempt = new Number(1, 100);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess a number: ");
            String a_recent_guess = scanner.next();
            int myGuess = Integer.parseInt(a_recent_guess);
            attempt.aGuess(myGuess);
        } while (!attempt.guessedYet());

        return;
    }
}
