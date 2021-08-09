package HW_lesson6;

public class SalaryCalculation {
    public static void main(String[] args) {

        SalesAgentSalary agentSalary1 = new SalesAgentSalary(100, 11);
        System.out.println("Salary of agent who didn't pass trial period: " + agentSalary1.getSalary() + "$");

        SalesAgentSalary agentSalary2 = new SalesAgentSalary(176, 11, 9, 21, 111000);
        System.out.println("Salary of agent who passed trial period: " + agentSalary2.getSalary() + "$");

    }
}

class SalesAgentSalary {
    private final int hours;
    private final double rate;
    private int years;
    private int numberOfSales;
    private double sumOfSales;
    private double coefficient;
    private double bonus;
    private double salary;

    public SalesAgentSalary(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
        salary = setSalary(hours, rate);
    }

    public SalesAgentSalary(int hours, double rate, int years, int numberOfSales, double sumOfSales) {
        this.hours = hours;
        this.rate = rate;
        this.years = years;
        this.numberOfSales = numberOfSales;
        this.sumOfSales = sumOfSales;
        salary = setSalary(hours, rate, years, numberOfSales, sumOfSales);
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(int hours, double rate) {
        if (hours > 160) {
            int overtime = hours - 160;
            double bonus = overtime * rate * 1.5;
            salary = 160 * rate + bonus;
        } else {
            salary = hours * rate;
        }
        return salary;
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
        if (num > 20) {
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

    double setSalary(int hours, double rate, int years, int numberOfSales, double sumOfSales) {
        double salaryWithOvertimeBonus = setSalary(hours, rate);
        double coefficient = coefficientForBaseHours(years);
        double bonusForNumberOfSales = bonusForNumberOfSales(numberOfSales);
        double bonusForSumOfSales = bonusForSumOfSales(sumOfSales);
        return salary = coefficient * salaryWithOvertimeBonus + bonusForNumberOfSales + bonusForSumOfSales;
    }
}
