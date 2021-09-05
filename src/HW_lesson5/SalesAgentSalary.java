package HW_lesson5;

import java.sql.SQLOutput;

public class SalesAgentSalary {
    public static void main(String[] args) {
        Salary salary = new Salary();
        int hours = 176;
        double rate = 11;
        double overtimeBonus = salary.overtimeBonus(hours, rate);
        System.out.println("Overworking bonus is equal: " + overtimeBonus + "$");
        double coefficient = salary.coefficientForBaseHours(7);
        System.out.println("Coefficient for base hours is equal: " + coefficient);
        double bonusForNumberOfSales = salary.bonusForNumberOfSales(25);
        System.out.println("Bonus for sales is equal: " + bonusForNumberOfSales + "$");
        double bonusForSumOfSales = salary.bonusForSumOfSales(36578.50);
        System.out.println("Bonus for sum of sales is equal: " + bonusForSumOfSales + "$");
        double finalSalary = salary.finalSalary(rate, coefficient, overtimeBonus, bonusForNumberOfSales, bonusForSumOfSales);
        System.out.println("Salary is equal: " + finalSalary + "$");
    }
}

class Salary {
    double coefficient;
    double bonus;

    double overtimeBonus(int hours, double rate) {
        if (hours > 160) {
            int overtime = hours - 160;
            double bonus = overtime * rate * 1.5;
            return bonus;
        } else {
            return 0;
        }
    }

    double coefficientForBaseHours(int years) {
        if (years < 2) {
            coefficient = 1;
        } else if (years >= 2 && years < 4) {
            coefficient = 1.2;
        } else if (years >= 4 && years < 6) {
            coefficient = 1.3;
        } else if (years >= 6) {
            coefficient = 1.4;
        }
        return coefficient;
    }

    double bonusForNumberOfSales(int num) {
        if (num >= 20) {
            bonus = 250;
        } else if (num < 10) {
            bonus = -150;
        }
        return bonus;
    }

    double bonusForSumOfSales(double sum) {
        if (sum > 15000) {
            bonus = 500;
        }
        return bonus;
    }

    double finalSalary(double rate, double coefficient, double overtimeBonus, double bonusForNumberOfSales, double bonusForSumOfSales) {
        double salary = 160 * rate * coefficient + overtimeBonus + bonusForNumberOfSales + bonusForSumOfSales;
        return salary;
    }
}




