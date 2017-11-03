package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {

        /*
        HashMap: Make a program similar to GradebookHashMap,
        but which takes in students names and ID numbers (as integers)
        instead of names and grades. In this case, however, the keys
        should be integers (the IDs) and the values should be
        strings (the names). Modify the roster printing code accordingly.
        */

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID#: ");
                Integer newID = in.nextInt();
                students.put(newID, newStudent);

                in.nextLine();
            }

        } while(!newStudent.equals(""));


        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
