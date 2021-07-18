package HW_lesson3;

import java.util.Scanner;

public class Finger {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the finger:");
        int num = s.nextInt();

        switch(num) {
            case 1:
                System.out.println("Thumb");
                break;
            case 2:
                System.out.println("Index finger");
                break;
            case 3:
                System.out.println("Middle finger");
                break;
            case 4:
                System.out.println("Ring finger");
                break;
            case 5:
                System.out.println("Pinky");
                break;
            default:
                System.out.println("The value must be between 1 and 5");
        }
    }
}
