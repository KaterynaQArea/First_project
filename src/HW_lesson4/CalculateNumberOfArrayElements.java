package HW_lesson4;

public class CalculateNumberOfArrayElements {
    public static void main(String[] args) {
        int[] array = {-10, 3, 48, 6, 14, 9, 8, 24, -16};
        System.out.println("These elements are divided by 2 but not by 3: ");
        int result = calculateArrayNumbers(array);
        System.out.println("\nThe number of array elements is equal: " + result);
    }

    public static int calculateArrayNumbers(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                result++;
                System.out.print(" " + array[i] + ",");
            }
        }
        return result;
    }
}
