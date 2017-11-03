package exercises;

public class ExerciseSeven {
    public static void main(String[] args) {
        /* Arrays: Create and initialize an array
        with the following values in a single line:
        1, 1, 2, 3, 5, 8.
        Then loop through the array and print out each value.
         */

        Integer[] fibList = {1, 1, 2, 3, 5, 8};
        for (Integer num : fibList) {
            System.out.println(num);
        }
    }
}
