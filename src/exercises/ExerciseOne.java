package exercises;

import java.util.Scanner;

/*
    Input, output: Modify your "Hello, World" program to prompt the user for their name, and greet them by name.
 */

public class ExerciseOne {
    public static void main(String[] args) {
        String username;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        username = in.next();

        System.out.println("Hello, " + username);
    }
}
