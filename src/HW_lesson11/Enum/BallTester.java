package HW_lesson11.Enum;

public class BallTester {
    public static void main(String[] args) {
        Ball[] balls = Ball.values();
        for (Ball b : balls) {
            System.out.println(b);
        }
    }
}
