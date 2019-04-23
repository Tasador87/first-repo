package Exercise;

import java.util.Scanner;

public class PasswordValidator_04Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        if (!isInRange(inputData)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isLetterAndDigits(inputData)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isItHaveTwoDigits(inputData)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isItHaveTwoDigits(inputData) && isInRange(inputData) && isLetterAndDigits(inputData)){
            System.out.println("Password is valid");
        }
    }

    private static boolean isItHaveTwoDigits(String inputData) {
        int count = 0;
        for (int i = 0; i < inputData.length(); i++) {
            if (Character.isDigit(inputData.charAt(i))) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }

    private static boolean isInRange(String inputData) {

        if (inputData.length() >= 6 && inputData.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isLetterAndDigits(String inputData) {
        for (int i = 0; i < inputData.length(); i++) {
            if (!Character.isLetterOrDigit(inputData.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
