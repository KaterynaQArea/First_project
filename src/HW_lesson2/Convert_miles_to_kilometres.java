package HW_lesson2;

public class Convert_miles_to_kilometres {
    public static void main(String[] args) {
        double mileDistance = 15;
        double kilometerDistance =  mileDistance*1.609;
        System.out.println(mileDistance + "  mile(s) = " + kilometerDistance + "  kilometer(es)" );

        double kilometerDistance1 = 120;
        double mileDistance1 =  kilometerDistance1/1.609;
        System.out.println(kilometerDistance1 + " kilometer(es) = " + mileDistance1 + "  mile(s)" );
    }
}
//1mi   =   1.609km, 1km = 1/1.609mi