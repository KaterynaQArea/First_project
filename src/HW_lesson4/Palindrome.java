package HW_lesson4;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Madam I'm Adam";
        s = s.toLowerCase(); //changing a string to a lower case
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", ""); //removing special characters
        char[] arrayOfChars = s.toCharArray();

        System.out.println("The array of chars:");
        for (int i = 0; i < arrayOfChars.length; i++) {
            System.out.println("arrayOfChars[" + i + "]=" + arrayOfChars[i]);
        }
        System.out.println();
        isItPalindrome(arrayOfChars);
    }

    public static void isItPalindrome(char[] arrayOfChars) {
        int i = 0;
        while (arrayOfChars[i] == arrayOfChars[arrayOfChars.length - i - 1] && i < arrayOfChars.length - 1 ) {
            i++;
        }
        if (i == arrayOfChars.length - 1) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}

