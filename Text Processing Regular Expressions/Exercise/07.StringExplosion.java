package Exercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputData = scanner.nextLine();
        int strength = 0;
        String result = "";

        for (int i = 0; i < inputData.length(); i++) {
            result += inputData.charAt(i);

            if (inputData.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(inputData.charAt(i + 1)));

            }
            while (strength > 0) {
                strength--;
                i++;

                if (i + 1 >= inputData.length() || inputData.charAt(i + 1) == '>') {
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
