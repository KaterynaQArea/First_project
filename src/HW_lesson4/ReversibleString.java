package HW_lesson4;

public class ReversibleString {
    public static void main(String[] args) {
        String s = "Start New Consent";
        System.out.println("Your string:\n" + s);
        char[] arrayOfChars = s.toCharArray();
        reverse(arrayOfChars);
        System.out.println("Reversible string:");
        for (int i = 0; i < arrayOfChars.length; i++) {
            System.out.print(arrayOfChars[i]);
        }
    }

    public static void reverse(char[] arrayOfChars) {
        char temp;
        for (int i = 0; i < arrayOfChars.length / 2; i++) {
            temp = arrayOfChars[i];
            arrayOfChars[i] = arrayOfChars[arrayOfChars.length - i - 1];
            arrayOfChars[arrayOfChars.length - i - 1] = temp;
        }
    }
}
