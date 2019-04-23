//Create a method that calculates and returns the value of a number raised to a given power:
//Examples:
//Input Output
//2      256
//8
//
//5.5   166.375
//3

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());
        double result = pow(number,pow);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double pow(double number, int pow) {
        double result = 1;
        for (int i = 1; i <= pow ; i++) {
            result = result * number;
        }
        return result;
    }
}
