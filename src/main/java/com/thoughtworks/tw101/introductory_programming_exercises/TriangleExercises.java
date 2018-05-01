// package com.thoughtworks.tw101.introductory_programming_exercises;



public class TriangleExercises {
    public static void vertical(int n) {
        int count = n;
        System.out.print("This is an example of the vertical function printing " + n + " times.\n");
        while (n > 0) {
            System.out.println("*");
            n--;
        }
        return;
    }

    public static void horizontal(int n) {
        int count = n;
        while (n > 0) {
            System.out.print("*");
            n--;
        }
        System.out.print("\n");
        return;
    }

    public static void right(int n) {
        System.out.print("This is an example of the right function printing " + n + " times.\n");
        for (int i = 1; i < n + 1; i++) {
            horizontal(i);
        }

        return;
    }

    public static void main(String[] args) {
        System.out.print("This is the single asterisk print.\n");
        System.out.println("*\n");
        vertical(8);
        System.out.println("\nThis is the horizontal print");
        horizontal(10);
        System.out.print("\n");
        right(3);
        return;
    }
}
