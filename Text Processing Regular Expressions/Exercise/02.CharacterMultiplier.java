package Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");

        String word1 = inputData[0];
        String word2 = inputData[1];
        int totalSum = 0;

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {

            if (i < word1.length() && i < word2.length()) {
                totalSum += word1.charAt(i) * word2.charAt(i);

            } else if (i < word1.length() && i >= word2.length()) {
                totalSum += word1.charAt(i);

            }else if (i >= word1.length() && i < word2.length()){
                totalSum += word2.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
