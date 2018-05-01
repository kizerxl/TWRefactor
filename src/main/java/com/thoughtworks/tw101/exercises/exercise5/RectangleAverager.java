// package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public RectangleAverager(){}

    public float averageArea(Rectangle[] rectangles) {
        float total = 0;
        float size = rectangles.length;
        for (int i = 0; i < size; i++){
            total += rectangles[i].area();
        }

        return total / size;
    }

    public static void main(String[] args) {
        return;
    }
}
