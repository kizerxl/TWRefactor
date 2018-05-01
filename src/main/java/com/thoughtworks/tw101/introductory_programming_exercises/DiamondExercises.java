import java.util.*;
import java.text.*;
import java.io.*;

public class DiamondExercises {
    public static void isosceles(int n) {
        int spaces = n - 1;
        int stars = 1;

        System.out.println("This is the output of the isosceles function.");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            for (int m = 0; m < spaces; m++) {
                System.out.print(" ");
            }

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
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            for (int m = 0; m < spaces; m++) {
                System.out.print(" ");
            }

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
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < stars; k++) {
                    System.out.print("*");
                }

                for (int m = 0; m < spaces; m++) {
                    System.out.print(" ");
                }

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

    public static void main(String[] args) throws IOException {
        isosceles(3);
        System.out.print("\n");
        diamond(3);
        diamond(3, "Tyrone");
        return;
    }
}