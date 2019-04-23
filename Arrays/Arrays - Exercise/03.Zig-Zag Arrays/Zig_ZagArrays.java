import java.util.Arrays;
import java.util.Scanner;

public class Zig_ZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n],
                array2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] tempArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                array1[i] = tempArray[0];
                array2[i] = tempArray[1];
            } else {
                array1[i] = tempArray[1];
                array2[i] = tempArray[0];
            }
        }
        for (int numbers : array1) {
            System.out.printf("%d ", numbers);
        }
        System.out.println();
        for (int numbers : array2) {
            System.out.printf("%d ", numbers);
        }
    }
}
