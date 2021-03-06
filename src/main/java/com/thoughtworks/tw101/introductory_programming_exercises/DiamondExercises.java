import java.util.*;
import java.text.*;
import java.io.*;

public class DiamondExercises {
    public static void isosceles(int n) {
        int spaces = n - 1;
        int stars = 1;

        System.out.println("This is the output of the isosceles function.");

        for (int i = 0; i < n; i++) {
            printCharacter(" ", spaces);
            printCharacter("*", spaces);
            printCharacter(" ", spaces);

            spaces -= 1;
            stars += 2;
            System.out.print("\n");
        }
    }

    public static void diamond(int n) {
        int spaces = n - 1;
        int stars = 1;

        System.out.println("This is the output of the diamond function.");

        for (int i = 0; i < 2 * n; i++) {
            printCharacter(" ", spaces);
            printCharacter("*", stars);
            printCharacter(" ", spaces);

            if (i < n - 1) {
                spaces -= 1;
                stars += 2;
            } else {
                spaces += 1;
                stars -= 2;
            }

            System.out.print("\n");
        }
    }

    public static void diamond(int n, String name) {
        int spaces = n - 1;
        int stars = 1;

        System.out.println("This is the output of the special diamond function with the name as an input.");

        for (int i = 0; i < 2 * n; i++) {
            if (i == n - 1) {
                System.out.print(name);
                spaces += 1;
                stars -= 2;
            } else {
                printCharacter(" ", spaces);
                printCharacter("*", spaces);
                printCharacter(" ", spaces);

                if (i < n - 1) {
                    spaces -= 1;
                    stars += 2;
                } else {
                    spaces += 1;
                    stars -= 2;
                }
            }

            System.out.print("\n");
        }
    }

    private void printCharacter(String characterStr, int numOfTimes) {
        for (int j = 0; j < numOfTimes; j++) {
            System.out.print(characterStr);
        }
    }

    public static void main(String[] args) throws IOException {
        isosceles(3);
        System.out.print("\n");
        diamond(3);
        diamond(3, "Tyrone");
    }
}