package HW_lesson11;

public class StringSecond {
    public static void main(String[] args) {
        String inputString = "A String class and its methods";
        System.out.println(withoutFirstAndLastChar(inputString));
    }

    public static String withoutFirstAndLastChar(String inputString) {
        String outputString;
        int length = inputString.length();
        if (length == 0 | length == 1) {
            outputString = "";
        } else {
          outputString = inputString.substring(1, length - 1);
        }
        return outputString;
    }
}
