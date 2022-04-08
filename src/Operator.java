import java.util.Scanner;

public class Operator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        // printAge();
        // swapNumber();
        compareTwoNumbers();
    }

    public static void printAge() {
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("After 15 years, your age will be " + (age + 15));
    }

    public static void swapNumber() {
        System.out.println("Input two random number:");
        int a = scanner.nextInt(); //Ex: 5
        System.out.println("a = " + a);
        int b = scanner.nextInt(); //Ex: 6
        System.out.println("b = " + b);
        a = a + b; // a=11
        b = a - b; // b=11-6=5
        a = a - b; //a=11-5=6
        System.out.println("After swapping, result will be: a = " + a + " and b = " + b);
    }

    public static void compareTwoNumbers() {
        System.out.println("Input two random number:");
        int a = scanner.nextInt(); //Ex: 5
        System.out.println("a = " + a);
        int b = scanner.nextInt(); //Ex: 6
        System.out.println("b = " + a);
        System.out.println("Result is " + (a > b));
    }
}
