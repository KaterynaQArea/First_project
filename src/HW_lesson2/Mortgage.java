package HW_lesson2;

public class Mortgage {
    public static void main(String[] args) {
        int husbandAge = 27;
        int wifeAge = 28;
        boolean b = methodAge(husbandAge, wifeAge);
        System.out.println(b);
    }
    public static boolean methodAge(int husbandAge, int wifeAge){
        return (husbandAge < 35 && wifeAge < 35 );
    }
}


