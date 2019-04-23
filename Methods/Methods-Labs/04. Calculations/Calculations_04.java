import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int divider = divide(a,b);

        if (operation.equals("add")) {
            add(a, b);
        } else if (operation.equals("subtract")) {
            subtract(a, b);
        } else if (operation.equals("multiply")) {
            multiply(a, b);
        } else if (operation.equals("divide")) {
            System.out.println(divider);
        }
    }
    private static int divide(int a, int b) {
        return(a / b);
    }
    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }
    private static void add(int a, int b) {
        System.out.println(a + b);
    }
}