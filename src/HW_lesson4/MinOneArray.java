package HW_lesson4;

public class MinOneArray {
    public static void main(String[] args) {
        int[] array = {5, 0, -39, 175, 11, 3};
        int result = min(array);
    }
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The array min value is: " + min);
        return min;
    }

}
