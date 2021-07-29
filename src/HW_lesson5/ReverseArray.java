package HW_lesson5;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {3, -9, 0, 4, 111, 97, 274, 61};
        reverse(array);
        System.out.println("Reversed array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
    }

    public static void reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}