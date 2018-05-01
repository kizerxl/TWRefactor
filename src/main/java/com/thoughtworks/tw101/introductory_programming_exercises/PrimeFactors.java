// package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.*;

public class PrimeFactors {
    public String name;
    
    public PrimeFactors(String myName){
        this.name = myName;
    }

    public static void myPrimes(int n) {
        System.out.println("These are the primes for the number " + n + ".");
        ArrayList<Integer> container = new ArrayList<Integer>(2);

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0 && isPrime(i)) {
                container.add(i);
            }
        }

        System.out.println(container);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        myPrimes(30);
        myPrimes(1);
        return;
    }
}
