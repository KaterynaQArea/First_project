package HW_lesson11;

public class StringFourth {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(backAround(s));
    }

    public static String backAround(String str) {
        String outputString;
        int length = str.length();
        String subStr = str.substring(length - 1, length);
        outputString = subStr.concat(str).concat(subStr);
        return outputString;
    }
}
