import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();


        String regex = "^^(?<name>[a-zA-Z!@#$?]+)=(?<length>[0-9]+)<<(?<code>.+)$";
        Pattern pattern = Pattern.compile(regex);


        while (!inputData.equals("Last note")) {
            Matcher matcher = pattern.matcher(inputData);
            StringBuilder newName = new StringBuilder();

            if (matcher.find()) {
                int length = Integer.parseInt(matcher.group("length"));
                String code = matcher.group("code");

                if (length == code.length()) {
                    String name = matcher.group("name");
                    for (int i = 0; i < name.length(); i++) {
                        if (Character.isLetter(name.charAt(i))) {
                            newName.append(name.charAt(i));
                        }
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s", newName, matcher.group("code")));
                }else {
                    System.out.println("Nothing found!");
                }
            } else {
                System.out.println("Nothing found!");
            }

            inputData = scanner.nextLine();
            matcher = pattern.matcher(inputData);
        }
    }
}
