package HW_lesson4;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {0, 9, -11, 7, -123, 11};
        int[] sortArray = sortArrayFromMinToMax(array);
        System.out.println("Array sorted from min to max:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortArrayFromMinToMax(int[] array) {
        int temp;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
