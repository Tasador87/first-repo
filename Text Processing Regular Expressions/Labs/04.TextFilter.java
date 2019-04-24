package Labs;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String inputData = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            if (inputData.contains(bannedWord)){
                String replacemant = repeatStr("*",bannedWord.length());
                inputData = inputData.replace(bannedWord,replacemant);
            }
        }
        System.out.println(inputData);
    }

    private static String repeatStr(String str, int length) {

        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += str;
        }
        return replacement;
    }
}
