package com.thoughtworks.tw101.exercises.exercise1;

import java.util.*;
import java.text.*;
import java.io.*;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 100; i+=2){
            System.out.println(i);
            total += i;
        }
        System.out.println("This is the total:" + total);
        return;

    }
}
