package HW_lesson2;

public class Purchase {
    public static void main(String[] args) {
    int PresenceOfClass_1_apples = 0;
    int PresenceOfClass_2_apples = 23;
    boolean presence = methodPurchase (PresenceOfClass_1_apples,PresenceOfClass_2_apples);
        System.out.println(presence);
    }

    public static boolean methodPurchase(int PresenceOfClass_1_apples, int PresenceOfClass_2_apples) {
        return PresenceOfClass_1_apples > 0 || PresenceOfClass_2_apples > 0;
        /*if (PresenceOfClass_1_apples > 0 || PresenceOfClass_2_apples >0)
                return true;
        else
            return false;*/

    }
}
