import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensed = new int[numbers.length - 1];

        if (numbers.length == 1) {
            System.out.println(numbers[0]);
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int index = 0; index < condensed.length - i; index++) {

                condensed[index] = numbers[index] + numbers[index + 1];
            }
            numbers = condensed;
        }
        System.out.println(condensed[0]);
    }
}