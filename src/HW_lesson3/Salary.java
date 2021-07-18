package HW_lesson3;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter how many sales the manager made:");
        int num = n.nextInt();
        int rate = 1000;
        int bonus = 250;
        int s;
        if (num > 10) {
            s = rate + bonus;
        } else {
            s = rate;
        }
        System.out.println("Salary: " + s + "$");
    }
}
