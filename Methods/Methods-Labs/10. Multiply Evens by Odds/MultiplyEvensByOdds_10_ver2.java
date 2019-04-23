import java.util.Scanner;

public class MultiplyEvensByOdds_10_ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Math.abs(Integer.parseInt(scanner.nextLine()));
        int evensSum = 0;
        int oddSum = 0;
        System.out.println(evensSum(numbers,evensSum)*oddSum(numbers,oddSum));
    }

    private static int evensSum(int numbers, int evenSum) {
        while (numbers > 0) {
            int lastNumber = numbers % 10;
            numbers = numbers / 10;

            if (lastNumber % 2 == 0) {
                evenSum += lastNumber;
            }
        }
        return evenSum;
    }

    private static int oddSum(int numbers, int oddSum) {
        while (numbers > 0){
            int lastNumber = numbers % 10;
            numbers = numbers / 10;

            if (lastNumber % 2 != 0){
                oddSum += lastNumber;
            }
        }
        return oddSum;
    }
}
