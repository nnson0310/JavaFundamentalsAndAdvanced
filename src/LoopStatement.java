import java.util.Scanner;

public class LoopStatement {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        // printNumber();
        // printNumberInRange();
        // printEvenNumber();
        // sumNumInRange();
        // sumOddNumInRange();
        // getNum();
        // multipleNum();
        // printEventNumberByWhile();
        getNumByWhile();
    }

    public static void printNumber() {
        System.out.println("Input a random number");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i + " ");
        }
    }

    public static void printNumberInRange() {
        System.out.println("Input two random number");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA > numB) {
            System.out.println("First number must be less than second number");
            printNumberInRange();
        }

        for (int i = numA; i <= numB; i++) {
            System.out.println(i + " ");
        }
    }

    public static void printEvenNumber() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void sumNumInRange() {
        System.out.println("Input two random number");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int sum = 0;

        if (numA > numB) {
            System.out.println("First number must be less than second number");
            printNumberInRange();
        }

        for (int i = numA; i <= numB; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void sumOddNumInRange() {
        System.out.println("Input a random number");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("Result = " + sum);
    }

    public static void getNum() {
        System.out.println("Input two random number");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA > numB) {
            System.out.println("First number must be less than second number");
            printNumberInRange();
        }

        for (int i = numA; i <= numB; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void multipleNum() {
        System.out.println("Input a random number");
        int num = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Result = " + result);
    }

    public static void printEventNumberByWhile() {
        System.out.println("Input a random number");
        int num = scanner.nextInt();
        int i = num;

        while(i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }
    }

    public static void getNumByWhile() {
        System.out.println("Input two random number");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA > numB) {
            System.out.println("First number must be less than second number");
            printNumberInRange();
        }

        int i = numA;

        while(i <= numB) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }
    }

}
