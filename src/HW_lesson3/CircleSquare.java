package HW_lesson3;

import java.util.Scanner;

public class CircleSquare {
    public static void main(String[] args) {
        Scanner с = new Scanner(System.in);
        System.out.println("Enter the area of the circle:");
        double circle = с.nextDouble();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the area of the square:");
        double square = s.nextDouble();

        final double pi = 3.1415926536;
        double r = Math.sqrt(circle / pi); // the radius of the circle
        double d = 2 * r;
        double a = Math.sqrt(square); // side of the square
        double h = Math.sqrt(2) * a; // diagonal of the square
        if (a >= d){
            System.out.println("The circle can be placed inside the square");
        } else if (h <= d){
            System.out.println("The square can be placed inside the circle");
        } else {
            System.out.println("The circle can't be placed inside the square");
        }
    }
}
