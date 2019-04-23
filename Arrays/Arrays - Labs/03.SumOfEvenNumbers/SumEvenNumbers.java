import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbersAsString = input.split(" ");
        int sum = 0;

        for (int i = 0; i < numbersAsString.length; i++) {
            int numbers = Integer.parseInt(numbersAsString[i]);

            if (numbers % 2 == 0) {
                sum = sum + numbers;
            }
        }
        System.out.println(sum);
    }
}
