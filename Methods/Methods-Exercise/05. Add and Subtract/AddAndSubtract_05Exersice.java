package Exercise;

import java.util.Scanner;

public class AddAndSubtract_05Exersice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(substract(num1, num2, num3));
    }

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int substract(int num1, int num2, int num3) {
        int subtract = sum(num1, num2) - num3;
        return subtract;
    }
}
