// package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int count;

    public Accumulator(){
        this.count = 0;
    }

    public void increment(){
        this.count += 1;
    }

    public void total(){
        System.out.print("Accumulated has been called " + this.count + " times.");
    }

    public static void main(String[] args) {
        return;
    }
}
