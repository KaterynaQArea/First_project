package HW_lesson8.Fruit;

public class Apple extends Fruit {
    public Apple() {
        setCalories(95);
    }

    public void removeSeeds() {
        System.out.println("The seeds are removing from the apple now");
    }

    public void makeJuice() {
        System.out.println("Apple juice is ready");
    }
}

