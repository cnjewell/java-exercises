package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner in;
        double userInput;
        double area;

        in = new Scanner(System.in);

        do {
            System.out.println("Enter the radius of your circle: ");
            userInput = in.nextDouble();
            if (userInput < 0) System.out.println("No negative numbers, try again.");
        } while (userInput < 0);

        area = userInput * userInput * Math.PI;
        System.out.println("The area of that circle is: "+area);

    }
}
