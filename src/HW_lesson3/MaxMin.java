package HW_lesson3;

public class MaxMin {
    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 2;
        // int max = Math.max(n1, n2);
        int max = max(n1, n2);
        System.out.println("The number "+ max +" has the greatest value");
    }
    public static int max(int n1, int n2) {
        int max;
        if(n1 > n2)
            max = n1;
        else
            max = n2;
        return max;
    }
}
