package HW_lesson2;

public class Convert_meters_to_inches {
    public static void main(String[] args) {
        double meter = 7;
        double inch = meter*39.37;
        System.out.println(meter + "  meter(s) = " + inch + "  inch(es)" );

        double inch_1 = 111;
        double meter_1 = inch_1/39.37;
        System.out.println(inch_1 + "  inch(es) = " + meter_1 + "  meter(s)" );
    }
}
//Formulas:     1m   =   39.37in; 1in   =   1/39.37m