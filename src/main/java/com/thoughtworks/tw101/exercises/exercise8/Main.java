// package com.thoughtworks.tw101.exercises.exercise8;
import java.util.*;
import java.io.*;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

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
