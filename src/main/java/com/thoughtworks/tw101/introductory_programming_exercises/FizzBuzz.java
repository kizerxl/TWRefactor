// package com.thoughtworks.tw101.introductory_programming_exercises;

//FizzBuzz Exercise
//        FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to
//        certain rules.
//
//        Create a fizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".
//
//        Sample Output:
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz

public class FizzBuzz {
    public static void example(int n){
        System.out.println("This is an example of FizzBuzz up to the number: " + n + ".");
        for (int i = 1; i < n + 1; i++){

            boolean three = i % 3 == 0;
            boolean five = i % 5 == 0;

            if (three && five){
                System.out.println("FizzBuzz");
            } else if (three){
                System.out.println("Fizz");
            } else if (five){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        return;
    }

    public static void main(String[] args) {
        example(100);
        return;
    }
}
