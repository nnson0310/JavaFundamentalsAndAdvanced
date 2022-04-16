import java.util.*;
import java.lang.String;

public class StringJava {

    static Scanner scanner = new Scanner(System.in);

    static String str = "Automation Testing 345 Tutorials Online 789";

    public static void main(String[] args) {
        // printNumUpperChar();
        // changeStr();
        reverseStr();
    }

    public static void printNumUpperChar() {
        System.out.println("Input a random string:");
        String text = scanner.nextLine().trim();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;

        char[] charArr = text.toCharArray();

        for (char character : charArr) {
            if (character <= 'Z' && character >= 'A') {
                countUpper++;
            }
            if (character <= 'z' && character >= 'a') {
                countLower++;
            }

            if (character <= '9' && character >= '0') {
                countNumber++;
            }

        }

    //        for (int i = 0; i < text.length(); i++) {
    //            if (Character.isUpperCase(text.charAt(i))) {
    //                countUpper++;
    //            }
    //        }

        System.out.println("The number of uppercase char in string  = " + countUpper);
        System.out.println("The number of lower char in string  = " + countLower);
        System.out.println("The number of number char in string  = " + countNumber);

    }

    public static void changeStr() {
        //count the char = a in string
        int countChar = 0;

        for(int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                countChar++;
            }
        }

        System.out.println("Number of a char in string  = " + countChar);

        //check if string contains "Testing" or not
        String containedStr = "Testing";
        System.out.println("String contains \"" + containedStr + "\" is " + str.contains(containedStr));

        //check if string starts with "Automation"
        containedStr = "Automation";
        System.out.println("String starts with \"" + containedStr + "\" is " + str.startsWith(containedStr));

        //check if string end with "Online"
        containedStr = "Online";
        System.out.println("String ends with \"" + containedStr + "\" is " + str.endsWith(containedStr));

        //get position of "Tutorials" in string
        containedStr = "Tutorials";
        System.out.println("Position of \"" + containedStr + "\" is " + str.indexOf(containedStr));

        //replace "Online" with "Offline"
        String replaceStr = "Offline";
        System.out.println("String after replace will be \"" + str.replace("Online", replaceStr) + "\"");

        //count number of number char in string
        countChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                countChar++;
            }
        }
        System.out.println("The number of number char in string  = " + countChar);

    }


    public static void reverseStr() {

        System.out.println("Input a random string which will be reversed: ");
        String inputStr = scanner.nextLine().trim();

        //To reverse a string in java we can use
        //reverse method of StringBuilder object

        // System.out.println(new StringBuilder(inputStr).reverse().toString());

        //Method 2:
        char[] charArr = inputStr.toCharArray();
        int charArrLength = charArr.length;

        for (int i = charArrLength - 1; i >= 0 ; i--) {
            char temp = charArr[i];
            charArr[i] = charArr[0];
            charArr[0] = temp;
        }

        System.out.println(new StringBuilder().append(charArr));

    }
}
