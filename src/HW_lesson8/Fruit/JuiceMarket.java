package HW_lesson8.Fruit;

public class JuiceMarket {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("Apple calories = " + apple.getCalories());
        apple.removeSeeds();
        apple.makeJuice();
        System.out.println();
        Banana banana = new Banana();
        System.out.println("Banana calories = " + banana.getCalories());
        banana.peel();
        banana.makeJuice();
        System.out.println();
        Fruit apple1 = new Fruit();
        apple1.makeJuice();
        System.out.println();
        Lemon lemon = new Lemon();
        System.out.println("Lemon calories = " + lemon.getCalories());
        lemon.peel();
        lemon.removeSeeds();
        lemon.makeJuice();
        System.out.println();
        Orange orange = new Orange();
        System.out.println("Orange calories = " + orange.getCalories());
        orange.peel();
        orange.removeSeeds();
        orange.makeJuice();
    }
}

