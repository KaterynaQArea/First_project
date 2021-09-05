package HW_lesson11;


import java.util.Locale;

public class StringFirst {
    public static void main(String[] args) {
        String inputString = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";
        System.out.println(afterFeelInUpperCase(inputString));
    }

    public static String afterFeelInUpperCase(String inputString) {
        String s = "feel";
        int length = s.length();
        int index = inputString.indexOf(s); //13
        if (index < 0) {
            return "The word '" + s + "' not found!";
        }
        int beginOfNextWord = index + length + 1;
        int endOfNextWord = inputString.indexOf(" ", beginOfNextWord);
        String subStr = inputString.substring(beginOfNextWord, endOfNextWord);
        String upperCaseStr = subStr.toUpperCase(Locale.ROOT);
        return upperCaseStr;
    }
}