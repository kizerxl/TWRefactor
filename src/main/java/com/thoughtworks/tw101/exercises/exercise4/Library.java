// package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        System.out.println("These are the books containing the partial: " + partialBookTitle);
        for (int i = 0; i < this.books.length; i++){
            if (this.books[i].contains(partialBookTitle)){
                System.out.println(this.books[i]);
            }
        }
    }

    public static void main(String[] args) {
        return;
    }
}
