package HW_lesson8.Cake;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setTaste("chocolate");
        cake.setPrice(131.75);
        System.out.println("Cake has " + cake.getTaste() + " taste and costs " + cake.getPrice() + " hrn per piece");
        System.out.println();

        BirthdayCake cake1 = new BirthdayCake();
        cake1.setTaste("berry");
        cake1.setCandles(21);
        cake1.setPrice(154.9);
        System.out.println("Birthday cake has " + cake1.getCandles() + " candles with " + cake1.getTaste() + " taste and costs " + cake1.getPrice() + " hrn per piece");
        System.out.println();

        WeddingCake cake2 = new WeddingCake();
        cake2.setTaste("cream-cheese");
        cake2.setTiers(3);
        cake2.setPrice(210);
        System.out.println("Wedding cake has " + cake2.getTiers() + " tiers with " + cake2.getTaste() + " taste and costs " + cake2.getPrice() + " hrn per piece");
    }
}
