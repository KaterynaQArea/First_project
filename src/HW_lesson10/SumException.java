package HW_lesson10;

import java.util.Scanner;

public class SumException {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Please input the number:");
                Scanner scanner = new Scanner(System.in);
                double number = scanner.nextDouble();
                sum = sum + number;
            } catch (Exception e) {
                System.out.println("Your number is invalid!");
                i--;
            }
        }
        System.out.println("The sum of numbers: " + sum);
    }
}
