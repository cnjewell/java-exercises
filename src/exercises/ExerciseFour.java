package exercises;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        String aliceQuote;
        String aliceQuery;
        Scanner in;

        aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        aliceQuote = aliceQuote.toLowerCase();

        in = new Scanner(System.in);
        System.out.println("Enter a term to search for: ");
        aliceQuery = in.next().toLowerCase();

        if (aliceQuote.contains(aliceQuery)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
