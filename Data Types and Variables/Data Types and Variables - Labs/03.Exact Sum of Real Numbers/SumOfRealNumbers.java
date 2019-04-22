import java.math.BigDecimal;
import java.util.Scanner;

public class SumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        BigDecimal realSum = BigDecimal.ZERO;

        for (int i = 0; i < num ; i++) {

            BigDecimal sum = scanner.nextBigDecimal();
            realSum = realSum.add(sum);
        }
        System.out.println(realSum);
    }
}
