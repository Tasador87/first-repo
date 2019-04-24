package Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split(", ");

        String regex = "^[\\w?\\-?\\w?]{3,16}$";

        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < inputData.length ; i++) {
            Matcher matcher = pattern.matcher(inputData[i]);

            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}
