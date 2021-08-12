package HW_lesson8.Fruit;

public class Orange extends Fruit {
    public Orange() {
        setCalories(45);
    }

    public void removeSeeds() {
        System.out.println("Now the seeds are removing from the orange");
    }

    public void peel() {
        System.out.println("Now the orange is being peeled off");
    }

    public void makeJuice() {
        System.out.println("The orange juice is ready");
    }
}

