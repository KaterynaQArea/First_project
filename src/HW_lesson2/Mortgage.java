package HW_lesson2;

public class Mortgage {
    public static void main(String[] args) {
        int husbandAge = 34;
        int wifeAge = 34;
        boolean b = methodAge(husbandAge, wifeAge);
        System.out.println(b);
        if (b == true)
        System.out.println( "They’re both under 35 years old");
        else
            System.out.println("Some of them over 35");
    }
    public static boolean methodAge(int husbandAge, int wifeAge){
        if (husbandAge < 35 && wifeAge < 35 )
            return true;
        else
            return false;

    }
}


