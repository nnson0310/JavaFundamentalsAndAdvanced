public class DataType {

    public static void main(String args[]) {
        caculate(6,2);
        rectangleArea(7.5F, 3.8F);
        printString("Automation Tester");
    }

    public static void caculate(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    public static void rectangleArea(float a, float b) {
        System.out.println("Area = " + (a * b));
    }

    public static void printString(String text) {
        System.out.println("Hello " + text);
    }
}
