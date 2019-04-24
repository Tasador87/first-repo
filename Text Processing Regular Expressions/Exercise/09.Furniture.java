package Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        double totalSum = 0.0;

        String regex = "(^|\\s)>>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]+)!(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);



        System.out.println("Bought furniture:");

        while (!inputData.equals("Purchase")){
            Matcher matcher = pattern.matcher(inputData);

            if (matcher.find()){

                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));
                totalSum +=price*count;

                System.out.println(String.format("%s",name));

            }
            inputData = scanner.nextLine();
        }

        System.out.println(String.format("Total money spend: %.2f",totalSum));
    }
}
