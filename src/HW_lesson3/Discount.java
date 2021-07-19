package HW_lesson3;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount of purchase:");
        double a = s.nextDouble();

        if (a >= 1000) {
            a = a - (a / 100) * 15;
            System.out.println("Purchase amount discounted:" + a);
        } else {
            System.out.println("You don't have a discount");
        }
    }
}
