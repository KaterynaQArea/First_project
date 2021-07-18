package HW_lesson3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = s.nextDouble();

        if (-5 < num && num < 3){
            System.out.println("The number belongs to the interval");
        } else {
            System.out.println("The number doesn't belong to the interval");
        }
    }
}
