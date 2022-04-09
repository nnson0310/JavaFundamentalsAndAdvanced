import java.util.Scanner;

public class ConditionalStatement {

    /*
    * Trong Java, ta chỉ có thể so sánh nếu 2 chuỗi bằng nhau
    * bằng phương thức Object.equals(). Không thể so sánh bằng toán tử "=="
    * vì "==" chỉ dùng để so sánh tham chiếu (reference equality) chứ
    * không so sánh giá trị (value equality)
    * VD:
    * String textA = new String("hello");
    * String textB = "hello";
    * textA = textB (return false vi 2 object này k là một, chúng
    * tham chiếu đến 2 ô nhớ khác nhau)
    * */

    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {
        // checkOddNumber();
        // compareNumber();
        // compareHumanName();
        // findBiggestNumber();
        // checkNumberInRange();
        rankStudentScore();
    }

    public static void checkOddNumber() {
        System.out.println("Input random number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("This number " + number + " is even number.");
        }
        else {
            System.out.println("This number " + number + " is odd number.");
        }
    }

    public static void compareNumber() {
        System.out.println("Input two random number");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        if (numberA >= numberB) {
            System.out.println(numberA + " >= " + numberB);
        }
        else {
            System.out.println(numberA + " <= " + numberB);
        }

    }
    public static void compareHumanName() {
        System.out.println("Input two random human name");
        String nameA = scanner.nextLine();
        String nameB = scanner.nextLine();

        if (nameA.equals(nameB)) {
            System.out.println("These names are the same.");
        }
        else {
            System.out.println("These names are different.");
        }

    }

    public static void findBiggestNumber() {
        System.out.println("Input three random number");
        Integer[] arrayNum = new Integer[3];

        for (int i = 0; i < arrayNum.length ; i++) {
            arrayNum[i] = scanner.nextInt();
        }

        int max = arrayNum[0];

        for (int i = 0; i < arrayNum.length ; i++) {
            if (max <= arrayNum[i]) {
                max = arrayNum[i];
            }
        }

        System.out.println("The biggest number in three is " + max);
    }

    public static void checkNumberInRange() {
        System.out.println("Input a random number");
        int numberA = scanner.nextInt();

        if (numberA >= 10 && numberA <= 100) {
            System.out.println(numberA + " is in range from 10 to 100");
        }
        else {
            System.out.println(numberA + " out of range from 10 to 100");
        }
    }

    //check if student score is more than 0 or less than 10
    public static int inputStudentScore() {
        System.out.println("Input student score. Student score must be more than 0 and less than 10");
        int studentScore = scanner.nextInt();
        if (studentScore > 10 || studentScore < 0) {
            inputStudentScore();
        }
        return studentScore;
    }

    public static void rankStudentScore() {
        int studentScore = inputStudentScore();

        if (studentScore < 5) {
            System.out.println("Rank is D");
        }
        else if (studentScore < 7.5) {
            System.out.println("Rank is C");
        }
        else if (studentScore < 8.5) {
            System.out.println("Rank is B");
        }
        else {
            System.out.println("Rank is A");
        }
    }

}
