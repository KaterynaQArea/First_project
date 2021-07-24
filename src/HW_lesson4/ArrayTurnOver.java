package HW_lesson4;

public class ArrayTurnOver {
    public static void main(String[] args) {
        int[] array = {-1, 5, 7, 4, 8, 0};
        System.out.println("Initial array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        reverse(array);
        System.out.println("\nReversible array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
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
