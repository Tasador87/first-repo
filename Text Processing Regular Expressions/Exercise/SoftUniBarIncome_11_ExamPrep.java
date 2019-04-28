package Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_Zvezda11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        double totalSum = 0.0;

        String regex = "(^|\\s)%(?<customer>[A-Z][a-z]+)%(?:[^$%.|]*)<(?<product>.*)>(?:[^$%.|]*)\\|(?<count>[0-9]+)\\|(?:[^$%.|]*?)(?<price>[0-9]+\\.?[0-9]+)\\$";
        Pattern pattern = Pattern.compile(regex);


        while (!inputData.equals("end of shift")){

            Matcher matcher = pattern.matcher(inputData);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                totalSum += price*count;

                System.out.println(String.format("%s: %s - %.2f",customer,product,(count*price)));
            }
            inputData = scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f",totalSum));
    }
}
