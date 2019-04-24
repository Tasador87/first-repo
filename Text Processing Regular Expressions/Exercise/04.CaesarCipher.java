package Exercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("");
        //String inputData = scanner.nextLine();

        String result = "";

        for (int i = 0; i < inputData.length; i++) {



            for (int j = 0; j < inputData[i].length(); j++) {

                result += ((char) (inputData[i].charAt(j) + 3));
            }
        }
        System.out.println(result);
    }
}
