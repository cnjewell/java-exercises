package exercises;

public class ExerciseSix {
    public static void main(String[] args) {
        /*
        ArrayList and Strings:
        Write a static method to print out each
        word in a list that has exactly 5 letters.
        */

        /*
        Create a list of words (ArrayList? Annoying to initialize)
        for word in wordlist
            if word.length == 5
                print word
        */
        String[] wordList = {"Chris", "Dog", "Four", "Brian"};
        for (String word : wordList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }

    }
}
