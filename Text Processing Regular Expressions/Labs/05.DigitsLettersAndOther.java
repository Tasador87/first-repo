package Labs;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        String isDigit = "";
        String isLetter = "";
        String isSymbol = "";

        for (int i = 0; i <inputData.length() ; i++) {
            if (Character.isDigit(inputData.charAt(i))){
                isDigit += inputData.charAt(i);
            }else if (Character.isLetter(inputData.charAt(i))){
                isLetter += inputData.charAt(i);
            }else {
                isSymbol += inputData.charAt(i);
            }
        }
        System.out.println(isDigit);
        System.out.println(isLetter);
        System.out.println(isSymbol);
    }
}
