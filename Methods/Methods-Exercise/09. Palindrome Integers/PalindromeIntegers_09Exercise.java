package Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        String output = "";

        while (!inputData.equals("END")) {
            for (int i = 0; i < inputData.length(); i++) {

                if (inputData.charAt(i) == inputData.charAt((inputData.length() - 1 - i))) {
                    output += "true" + ";";
                    break;
                } else {
                    output += "false" + ";";
                    break;
                }
            }
            inputData = scanner.nextLine();
        }
        String output2 = "";
        for (int i = 0; i < output.length(); i++) {

            while (output.charAt(i) != ';') {
                output2 += output.charAt(i);

                if (output2.equals("true")) {
                    System.out.println(output2);
                    output2 = "";
                } else if (output2.equals("false")) {
                    System.out.println(output2);
                    output2 = "";
                }
                break;
            }
        }
    }
}
