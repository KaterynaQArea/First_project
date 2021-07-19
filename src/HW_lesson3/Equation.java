package HW_lesson3;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter b:");
        double b = num2.nextDouble();
        System.out.println("a = " + a + ", b = " + b);

        double x = 0;
        if (a == 0 && b < 0) {
            System.out.println("The value x tends to ∞");
        } else if (a == 0 && b > 0) {
            System.out.println("The value x tends to -∞");
        } else if (b == 0) {
            System.out.println("x = " + x);
        } else {
            x = -b / a;
            System.out.println("x = " + x);
        }
    }
}
