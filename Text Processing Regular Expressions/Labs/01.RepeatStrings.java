package Labs;

import java.util.Scanner;

public class RepeatStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");
        String result = "";

        for (int i = 0; i < inputData.length; i++) {
            String el = inputData[i];
            int length = el.length();
            for (int j = 0; j < length ; j++) {
                result += el;
            }
        }
        System.out.println(result);
    }
}
