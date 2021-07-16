package HW_lesson2;

public class Purchase {
    public static void main(String[] args) {
    int presenceOfClass_1_apples = 0;
    int presenceOfClass_2_apples = 23;
    boolean presence = methodPurchase (presenceOfClass_1_apples,presenceOfClass_2_apples);
        System.out.println(presence);
    }

    public static boolean methodPurchase(int presenceOfClass_1_apples, int presenceOfClass_2_apples) {
        return presenceOfClass_1_apples > 0 || presenceOfClass_2_apples > 0;
        /*if (PresenceOfClass_1_apples > 0 || PresenceOfClass_2_apples >0)
                return true;
        else
            return false;*/

    }
}
