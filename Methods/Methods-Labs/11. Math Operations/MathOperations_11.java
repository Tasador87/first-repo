import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String  operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculate(a,operator,b)));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;

        if (operator.equals("/")){
            result = a/b;
        }else if (operator.equals("*")){
            result = a*b;
        }else if (operator.equals("+")){
            result = a + b;
        }else if (operator.equals("-")){
            result = a - b;
        }
        return result;
    }
}
