import java.util.Scanner;

public class Zig_ZagArrays_03vers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] tempArray = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstArray[i] = tempArray[0];
                secondArray[i] = tempArray[1];
            } else {
                firstArray[i] = tempArray[1];
                secondArray[i] = tempArray[0];
            }
        }
        for (String nums : firstArray) {
            System.out.print(nums + " ");
        }
        System.out.println();
        for (String nums : secondArray) {
            System.out.print(nums + " ");
        }
    }
}
