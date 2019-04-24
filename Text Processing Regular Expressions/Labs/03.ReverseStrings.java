package Labs;

import java.util.Scanner;

public class ReverseStrings_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputData = scanner.nextLine();

        while (!inputData.equals("end")){
            String reversed = "";
            for (int i = inputData.length() -1; i >= 0 ; i--) {
                    reversed = reversed + inputData.charAt(i);
            }
            System.out.printf("%s = %s%n",inputData,reversed);

            inputData = scanner.nextLine();
        }

    }
}
