package Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputData.length() - 1; i++) {

            if (!String.valueOf(inputData.charAt(i)).equals(String.valueOf(inputData.charAt(i + 1)))) {
                result.append(String.valueOf(inputData.charAt(i)));
            }
        }
        System.out.println(result);

    }
}
