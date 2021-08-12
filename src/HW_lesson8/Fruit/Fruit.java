package HW_lesson8.Fruit;

public class Fruit {
    private int calories;

    public void setCalories(int fruitCalories) {
        calories = fruitCalories;
    }

    public int getCalories() {
        return calories;
    }

    public void makeJuice() {
        System.out.println("The juice is ready");
    }
}
