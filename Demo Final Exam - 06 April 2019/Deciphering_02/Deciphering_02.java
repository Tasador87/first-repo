import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        String result = "";

        String regex = "^[d-z#{}|]+";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(inputData);

        if (matcher.find()) {

            for (int i = 0; i < inputData.length(); i++) {
                result += (char) (inputData.charAt(i) - 3);
            }
        }else{
            System.out.println("This is not the book you are looking for.");
            return;
        }

        String[] keys = scanner.nextLine().split(" ");

        String key = keys[0];
        String key2 = keys[1];

        result = result.replaceAll(key, key2);

        System.out.println(result);
    }
}
