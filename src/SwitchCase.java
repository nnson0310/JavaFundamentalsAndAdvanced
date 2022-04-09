import java.util.Scanner;

public class SwitchCase {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        //printNumberByEng();
        caculate();
    }

    public static void printNumberByEng() {
        System.out.println("Input random num:");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Ten");
                break;
        }
    }

    public static void caculate() {
        System.out.println("Input two random numbers");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        System.out.println("Input operator for these two numbers");
        scanner.nextLine();
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result = " + (numA + numB));
                break;
            case '-':
                System.out.println("Result = " + (numA - numB));
                break;
            case '*':
                System.out.println("Result = " + (numA * numB));
                break;
            case '/':
                System.out.println("Result = " + (numA / numB));
                break;
            case'%':
                System.out.println("Result = " + (numA % numB));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
