package HW_lesson3;
import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter wife's age:");
        int age1 = a1.nextInt();

        Scanner a2= new Scanner(System.in);
        System.out.println("Enter husband's age:");
        int age2 = a2.nextInt();

        if (age1 < 35){
            if (age2 < 35){
                System.out.println("You can get a credit!");
            } else{
                System.out.println("You can't get a credit!");
            }
        } else{
            System.out.println("You can't get a credit!");
        }
    }
}
