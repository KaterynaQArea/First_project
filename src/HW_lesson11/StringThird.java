package HW_lesson11;

public class StringThird {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(repeatRepeatRepeat(s));
    }

    public static String repeatRepeatRepeat(String inputString) {
        String outputString = "";
        int count = 3;
        if (inputString.length() <= count) {
            outputString = inputString;
        } else {
            String subStr = inputString.substring(0, count);
            for (int i = 1; i <= count; i++) {
                outputString = outputString.concat(subStr);
            }
        }
        return outputString;
    }
}
