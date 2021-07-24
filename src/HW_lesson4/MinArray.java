package HW_lesson4;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            int num1 = 0;
            int num2 = 100;
            array[i] = rnd(num1, num2);
        }
        System.out.println("Your random array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int min = min(array);
    }

    //Метод получения случайного целого числа от num1 до num2 (включая num2);
    private static int rnd(int num1, int num2) {
        return (int) (Math.random() * ++num2);
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min of array " + min);
        return min;
    }
}