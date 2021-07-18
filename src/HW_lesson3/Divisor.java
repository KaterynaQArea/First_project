package HW_lesson3;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the first number a: ");
        double a = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the second number b: ");
        double b = num2.nextDouble();

        if( b % a == 0 ){
            System.out.println("Number a is the divisor of b");
        } else {
            System.out.println("Number a isn't a divisor of b");
        }
    }
}
