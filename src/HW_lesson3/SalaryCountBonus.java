package HW_lesson3;

import java.util.Scanner;

public class SalaryCountBonus {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter how many sales the manager made:");
        int num = n.nextInt();
        int rate = 1000;
        int bonus = 250;
        int remain;
        int s;
        if (num > 10) {
            s = rate + bonus;
            System.out.println("The manager will get a bonus");
        } else {
            s = rate;
            remain = 10 - num;
            System.out.println("To get the bonus you have to make " + remain + " more sale(s)");
        }
        System.out.println("Salary: " + s + "$");
    }
}
