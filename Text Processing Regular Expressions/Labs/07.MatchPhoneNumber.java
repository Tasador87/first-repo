package Labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phoneNumbers = scanner.nextLine();
        List<String> result = new ArrayList<>();

        String regex = "\\+359([ -])2\\1[\\d]{3}\\1[\\d]{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumbers);

        while (matcher.find()) {
            result.add(matcher.group());
        }
        System.out.println(String.join(", ", result));
    }
}
