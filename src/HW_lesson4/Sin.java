package HW_lesson4;

public class Sin {
    public static void main(String[] args) {
        double[] array = new double[37];
        double[] resultArray = calculateSin(array);
    }

    public static double[] calculateSin(double[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.sin(Math.toRadians(x));
            System.out.println("sin(" + x + "°)=" + array[i]);
            x = x + 10;
        }
        return array;
    }
}
