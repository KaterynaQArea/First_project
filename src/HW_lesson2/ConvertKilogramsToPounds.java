package HW_lesson2;

public class ConvertKilogramsToPounds {
    public static void main(String[] args) {
        double kgWeight = 15;
        double lbWeight =  kgWeight * 2.2046;
        System.out.println(kgWeight + "  kilogram(s) = " + lbWeight + "  pound(s)" );

        double lbWeight1 = 120;
        double kgWeight1 =  lbWeight1 / 2.2046;
        System.out.println(lbWeight + " pound(s) = " + kgWeight1 + "  kilogram(s)" );
    }
}
//1kg   =   2.2046lb
