package HW_lesson8.Fruit;

public class Lemon extends Fruit {
    public Lemon() {
        setCalories(29);
    }

    public void removeSeeds() {
        System.out.println("The seeds are removing from lemon now");
    }

    public void peel() {
        System.out.println("Now the lemon is being peeled off");
    }

    public void makeJuice() {
        System.out.println("Lemon juice is ready");
    }
}
