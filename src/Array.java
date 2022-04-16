public class Array {

    public static int[] arr = {9, 10, 55, 110, 19, 78, 62, 190, 100, 99};

    public static void main (String args[]) {
        displayBiggestNum();
        sumFirstLast();
        printEvenNum();
        sumOddNumMoreThanZero();
        displayNum();
        caculate();
    }

    public static void displayBiggestNum() {
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Biggest num in array is " + max);
    }

    public static void sumFirstLast() {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if (i == 0 || i == (arr.length - 1)) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of first and last num in array  = " + sum);
    }

    public static void printEvenNum() {
        for(int num: arr) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }
    }

    public static void sumOddNumMoreThanZero() {
        int arr[] = {3, -7, 2, 5, 9, -6, 10, 12};
        int sum = 0;

        for (int num: arr) {
            if (num % 2 == 1 && num > 0) {
                sum += num;
            }
        }
        System.out.println("Result is " + sum);

    }

    public static void displayNum() {
        int arr[] = {3, -7, 2, 5, 9, -6, 10, 12};

        for (int num: arr) {
            if (num >=0 && num <=10) {
                System.out.println(num + " ");
            }
        }
    }

    public static void caculate() {
        int arr[] = {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};
        int sum = 0;

        for (int num: arr) {
            sum += num;
        }
        System.out.println("Sum  = " + sum);

        int avg = sum/arr.length;
        System.out.println("Avg = " + avg);
    }
}
