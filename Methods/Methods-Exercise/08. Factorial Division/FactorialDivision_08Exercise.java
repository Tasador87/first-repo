package Exercise;

import java.util.Scanner;

public class FactorialDivision_08Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int factorial = 1;


        for (int i = number; i > 0; i--) {
            factorial = i * factorial;
        }
        double result = (double) factorial / number2;
        System.out.printf("%.2f", result);
    }
}
