package Exercise;

import java.util.Scanner;

public class MiddleCharacters_06Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        for (int i = 0; i < inputData.length() ; i++) {
            if (inputData.length() %2 ==0){
                System.out.print(inputData.charAt(inputData.length()/2 - 1));
                System.out.print(inputData.charAt(inputData.length()/2));
                break;
            }else{
                System.out.println(inputData.charAt(inputData.length()/2));
                break;
            }
        }
    }
}