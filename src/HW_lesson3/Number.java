package HW_lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = s1.nextDouble();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        double num2 = s2.nextDouble();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter the third number:");
        double num3 = s3.nextDouble();

        if( num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println("The first number has the greatest value: " + num1 +
            "\nThe second number has the middle value: " + num2 +
                    "\nThe third number has the smallest value: " + num3);
        } else if (num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println("The second number has the greatest value: " + num2 +
                    "\nThe first number has the middle value: " + num1 +
                    "\nThe third number has the smallest value: " + num3);
        } else if(num3 > num1 && num3 > num2 && num1 > num2){
            System.out.println("The third number has the greatest value: " + num3 +
                    "\nThe first number has the middle value: " + num1 +
                    "\nThe second number has the smallest value: " + num2);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println("The first number has the greatest value: " + num1 +
                    "\nThe third number has the middle value: " + num3 +
                    "\nThe second number has the smallest value: " + num2);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.println("The second number has the greatest value: " + num2 +
                    "\nThe third number has the middle value: " + num3 +
                    "\nThe first number has the smallest value: " + num1);
        } else if (num3 > num1 && num3 > num2 && num2 > num1){
            System.out.println("The third number has the greatest value: " + num3 +
                    "\nThe second number has the middle value: " + num2 +
                    "\nThe first number has the smallest value: " + num1);
        } else {
            System.out.println("You have entered values, some of which are equal");
        }
    }
}
