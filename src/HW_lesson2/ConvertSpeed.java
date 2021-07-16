package HW_lesson2;

public class ConvertSpeed {
    public static void main(String[] args) {
        double kmSpeed = 11;
        double miSpeed =  kmSpeed * 0.6214;
        System.out.println(kmSpeed + "  km/hr = " + miSpeed + "  mi/hr" );

        double miSpeed1 = 111;
        double kmSpeed1 =  miSpeed1 / 0.6214;
        System.out.println(miSpeed1 + " mi/hr = " + kmSpeed1 + "  km/hr" );
    }
}
//1km/hr   =   0.6214mi/hr
