package exercises;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        double milesTravelled;
        double gasUsed;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the miles travelled: ");
        milesTravelled = in.nextDouble();

        System.out.println("Enter gallons of gas consumed: ");
        gasUsed = in.nextDouble();

        mpg = milesTravelled / gasUsed;
        System.out.println("Your miles per gallon rating is: " + mpg);
    }
}


