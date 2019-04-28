package MidExam10_03_2019;

import java.util.*;
import java.util.stream.Collectors;

public class TheFinalQuest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String inputData = "";

        while (!"stop".equals(inputData = scanner.nextLine().toLowerCase())) {
            String[] inputCommands = inputData.split("\\s+");
            String command = inputCommands[0];

            switch (command) {
                case "delete":
                    if (Integer.parseInt(inputCommands[1]) < input.size() - 1 && Integer.parseInt(inputCommands[1]) >= 0) {
                        input.remove(Integer.parseInt(inputCommands[1]) + 1);
                    }
                    break;
                case "swap":
                    int newWord1 = 0;
                    int newWord2 = 0;
                    for (int i = 0; i < input.size(); i++) {
                        if (input.get(i).equals(inputCommands[1])) {
                            newWord1 = input.indexOf(input.get(i));
                        }
                    }
                    for (int i = 0; i < input.size(); i++) {
                        if (input.get(i).equals(inputCommands[2])) {
                            newWord2 = input.indexOf(input.get(i));
                        }
                    }
                    Collections.swap(input, newWord1, newWord2);
                    break;
                case "put":
                    if (Integer.parseInt(inputCommands[2]) < input.size() && Integer.parseInt(inputCommands[2]) > 0) {
                        input.add(Integer.parseInt(inputCommands[2]) - 1, inputCommands[1]);
                    }
                    break;
                case "sort":
                    Collections.sort(input);
                    break;
                case "replace":
                    if (input.contains(inputCommands[2])) {
                        Collections.replaceAll(input, inputCommands[2], inputCommands[1]);
                    }
                    break;
            }
        }
        for (String strings : input) {
            System.out.print(strings + " ");
        }
    }
}
