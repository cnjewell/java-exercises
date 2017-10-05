package exercises;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        double length;
        double height;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = in.nextDouble();

        System.out.println("Enter the height: ");
        height = in.nextDouble();

        area = length * height;
        System.out.println("The area of that rectangle is: " + area);

    }
}
