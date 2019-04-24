package Exercise;

import javafx.css.Match;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] racers = scanner.nextLine().split(", ");

        Map<String, Integer> storage = new LinkedHashMap<>();

        String regexNames = "[A-Za-z]+";
        String regexDistance = "[0-9]";

        String inputData = scanner.nextLine();

        Pattern patternName = Pattern.compile(regexNames);
        Pattern patternDistance = Pattern.compile(regexDistance);


        String name = "";
        int sumDistance = 0;

        while (!inputData.equals("end of race")) {

            Matcher matcherName = patternName.matcher(inputData);
            Matcher matcherDistance = patternDistance.matcher(inputData);

            while (matcherName.find()) {
                name += (matcherName.group());
            }

            while (matcherDistance.find()) {
                sumDistance += Integer.parseInt(matcherDistance.group());
            }

            for (int i = 0; i < racers.length; i++) {
                if (name.equals(racers[i])) {

                    if (!storage.containsKey(name)) {
                        storage.put(name, sumDistance);
                    } else {
                        storage.replace(name, storage.get(name), storage.get(name) + sumDistance);
                    }
                }
            }
            inputData = scanner.nextLine();
            name = "";
            sumDistance = 0;

        }

        List<String> result = new ArrayList<>();

        storage.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).limit(3).forEach(e -> {
            result.add(e.getKey());
        });
        System.out.println(String.format("1st place: %s", result.get(0)));
        System.out.println(String.format("2nd place: %s", result.get(1)));
        System.out.println(String.format("3rd place: %s", result.get(2)));
    }
}
