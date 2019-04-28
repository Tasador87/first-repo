import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExamZad_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        String newCode = "";

        String regex = "[#$%\\*&](?<name>[A-Za-z]+)[#$%\\*&]=(?<number>[0-9]+)!!(?<code>.+)$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(inputData);

        while (true) {

            if (matcher.find()) {
                String name = matcher.group("name");
                int number = Integer.parseInt(matcher.group("number"));
                String code = matcher.group("code");

                if (inputData.charAt(0) == inputData.charAt(name.length() + 1) && code.length() == number) {

                    for (int i = 0; i < code.length() ; i++) {
                      // newCode = newCode + Character.toString(code.charAt(i) + number);
                        newCode += (char) (code.charAt(i) + number);
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s",name,newCode));
                    return;
                }
            } else {
                System.out.println("Nothing found!");
                inputData = scanner.nextLine();
                matcher = pattern.matcher(inputData);
            }
        }
    }
}
