package HW_lesson4;

import java.util.Scanner;

public class SortFromMinToMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int length = s.nextInt();
        int[] array = new int[length];
        //array initialization
        for (int i = 0; i < array.length; i++) {
            int num1 = 0;
            int num2 = 21;
            array[i] = rnd(num1, num2);
        }
        //array output
        System.out.println("Your random array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //sorted array
        sortFromMinToMax(array);
        System.out.println("The sorted array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //method of generating random integer from num1 to num2
    private static int rnd(int num1, int num2) {
        return (int) (Math.random() * num2);
    }

    //bubble sort
    public static void sortFromMinToMax(int[] array) {
        int x;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    x = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = x;
                }
            }
        }
    }
}
