package HW_lesson8.Fruit;

public class Banana extends Fruit {
    public Banana() {
        setCalories(89);
    }

    public void peel() {
        System.out.println("Now the banana is being peeled off");
    }

    public void makeJuice() {
        System.out.println("Banana juice is ready");
    }
}
