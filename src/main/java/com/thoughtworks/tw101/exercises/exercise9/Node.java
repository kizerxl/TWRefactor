
// package com.thoughtworks.tw101.exercises.exercise9;

import java.util.*;

public class Node {
    public String name;
    public Node left;
    public Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (name.compareTo(nameOfNewNode) <= 0) {
            if (right == null) {
                right = new Node(nameOfNewNode);
            } else {
                right.add(nameOfNewNode);
            }
        } else if (name.compareTo(nameOfNewNode) > 0) {
            if (left == null) {
                left = new Node(nameOfNewNode);
            } else {
                left.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> names = new ArrayList<>();
        insertNames(names);
        return names;
    }

    private void insertNames(List<String> names) {
        if (left != null) {
            left.insertNames(names);
        }

        names.add(name);

        if (right != null) {
            right.insertNames(names);
        }
    }

    public static void main(String[] args) {
        return;
    }
}
