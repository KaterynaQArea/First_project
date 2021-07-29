package HW_lesson5;

import java.sql.SQLOutput;

public class SalesAgentSalary {
    public static void main(String[] args) {
        Salary salary = new Salary();
        int hours = 176;
        double bonusHours = salary.overWorkBonus(hours, 21.5);
        System.out.println("Overworking bonus is equal: " + bonusHours + "$");
        double rate = salary.rateForBaseHours(7);
        System.out.println("Coefficient for base hours is equal: " + rate + " $/h");
        double bonusForSale = salary.bonusForSale(21);
        System.out.println("Bonus for sales is equal: " + bonusForSale + "$");
        double salesBonus = salary.salesBonus(36578.50);
        System.out.println("Bonus for sum of sales is equal: " + salesBonus + "$");
        double finalSalary = salary.finalSalary(hours, rate, bonusHours, bonusForSale, salesBonus);
        System.out.println("Salary is equal: " + finalSalary + "$");
    }
}

class Salary {
    double rate;
    double bonus;

    double overWorkBonus(int hours, double rate) {
        if (hours > 160) {
            int overhours = hours - 160;
            double bonus = overhours * rate * 1.5;
            return bonus;
        } else {
            return 0;
        }
    }

    double rateForBaseHours(int years) {
        if (years < 2) {
            rate = 1;
        } else if (years >= 2 && years < 4) {
            rate = 1.2;
        } else if (years >= 4 && years < 6) {
            rate = 1.3;
        } else if (years >= 6) {
            rate = 1.4;
        }
        return rate;
    }

    double bonusForSale(int num) {
        if (num >= 20) {
            bonus = 250;
        } else if (num < 10) {
            bonus = -150;
        }
        return bonus;
    }

    double salesBonus(double sum) {
        if (sum > 15000) {
            bonus = 500;
        }
        return bonus;
    }

    double finalSalary(int hours, double rate, double bonusHours, double bonusForSale, double salesBonus) {
        double salary = hours * rate + bonusHours + bonusForSale + salesBonus;
        return salary;
    }
}




