package Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_Emails_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputData = scanner.nextLine();

        String regex ="\\s(?<name>[A-Za-z][\\w-.]*)@[A-Za-z-]+(?<ext>\\.[A-Za-z-]+)+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputData);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
