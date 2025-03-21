import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first side of the triangle
        System.out.print("Input Side 1: ");
        double s1 = in.nextDouble();

        // Prompt the user to input the second side of the triangle
        System.out.print("Input Side 2: ");
        double s2 = in.nextDouble();

        // Prompt the user to input the third side of the triangle
        System.out.print("Input Side 3: ");
        double s3 = in.nextDouble();

        // Check if the input sides are valid before proceeding
        if (trianglesCheck.inputCheck(s1, s2, s3)) {
            System.out.println("Do the sides form a triangle: " + trianglesCheck.isValidTriangle(s1, s2, s3));
            trianglesCheck.typeofTriangle(s1, s2, s3);
        } else {
            System.out.println("Input sides must be positive numbers greater than 0");
        }
    }
}