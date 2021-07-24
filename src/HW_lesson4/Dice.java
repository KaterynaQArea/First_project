package HW_lesson4;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        dice();
    }

    public static void dice() {
        int pitch = 5;
        int move = 0;
        for (int i = 1; i < pitch + 1; i++) {
            Random random = new Random();
            int num = random.nextInt(6) + 1;
            System.out.println();
            move = move + num;
            int remain = 20 - move;
            if (remain < 0) {
                System.out.println("There are only 20 fields on the board");
                break;
            }
            System.out.println(i + " throw of dice:");
            System.out.println("You are on the " + move + " field");
            System.out.println("You have to pass " + remain + " fields");
        }
        System.out.println("\nYou scored: " + move);
        if (move != 20) {
            System.out.println("You have lost!");
        } else {
            System.out.println("You won!");
        }
    }
}


