// package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.

public class Main {
    public static void main(String[] args) {
        Monster[] monsterArray = {
            new Troll("Troll1"),
            new Orc("Orc2"),
            new Troll("Troll2"),
            new Orc("Orc4"),
            new Troll("Troll9")
        };

        for (int i = 0; i < monsterArray.length; i++){
            monsterArray[i].takeDamage(10);    
        }

        for (int j = 0; j < monsterArray.length; j++){
            monsterArray[j].reportStatus();
        }
    }
}
