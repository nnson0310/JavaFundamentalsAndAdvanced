import java.util.*;

public class BreakContinue {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        // checkBrowserName();
        printMonth();
    }

    public static void checkBrowserName() {
        do{
            System.out.println("Nhap ten trinh duyet: ");
            String browserName = scanner.nextLine();
            if (browserName.equalsIgnoreCase("IE")) {
                break;
            }
        } while (true);
    }

    public static void printMonth() {
        System.out.println("Input a number from 1 to 12");
        int num = scanner.nextInt();

        if (num < 1 || num > 12) {
            printMonth();
        }

        Map<Integer, String> months = new HashMap<>();

        months.put(1, "JAN");
        months.put(2, "FEB");
        months.put(3, "MAR");
        months.put(4, "APR");
        months.put(5, "MAY");
        months.put(6, "JUN");
        months.put(7, "JULY");
        months.put(8, "AUG");
        months.put(9, "SEP");
        months.put(10, "OCT");
        months.put(11, "NOV");
        months.put(12, "DEC");

        Iterator<Map.Entry<Integer, String>> iterator = months.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (num == entry.getKey()) {
                System.out.println("This month is " + entry.getValue());
            }
        }

    }
}
