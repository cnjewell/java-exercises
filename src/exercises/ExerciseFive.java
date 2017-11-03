package exercises;

import java.util.ArrayList;

public class ExerciseFive {
    public static void main(String[] args) {

        /*
        ArrayList: Write a static method to find the sum of all the even numbers in a list.
        Within main, create a list with at least 10 integers and call your method on the list.
        */


        /*
        Create a list of 10 integers
        Create a return variable for the sum of even numbers
        For each number in this list
            if the number is even
                add this number to a return variable
        Print the compete Sum of Even Number return variable
        */

        Integer evenSums = 0;

        Integer numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (Integer num : numbers) {
            if ((num % 2) == 0) {
                evenSums += num;
            }
        }

        System.out.print(evenSums);

    }
}
