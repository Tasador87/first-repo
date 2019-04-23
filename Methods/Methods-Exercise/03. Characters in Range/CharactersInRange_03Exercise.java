package Exercise;

import java.util.Scanner;

public class CharactersInRange_03Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        PrintResult(input1, input2);
    }

    private static void PrintResult(String input1, String input2) {
        if (input2.charAt(0) < input1.charAt(0)) {
            for (int i = input2.charAt(0) + 1; i < input1.charAt(0); i++) {
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = input1.charAt(0) + 1; i < input2.charAt(0); i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
