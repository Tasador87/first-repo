package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String inputData = "";

        while (!"end".equals(inputData = scanner.nextLine().toLowerCase())) {
            String[] inputCommands = inputData.split("\\s+");
            String command = inputCommands[0];

            switch (command) {
                case "add":
                    numbers.add(inputCommands[1]);
                    break;
                case "insert":
                    if (Integer.parseInt(inputCommands[2]) < numbers.size() && Integer.parseInt(inputCommands[2]) >= 0) {
                        numbers.add(Integer.parseInt(inputCommands[2]), inputCommands[1]);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "remove":
                    if (Integer.parseInt(inputCommands[1]) < numbers.size() && Integer.parseInt(inputCommands[1]) >= 0) {
                        numbers.remove(Integer.parseInt(inputCommands[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "shift":
                    int count = Integer.parseInt(inputCommands[2]);
                    if (numbers.size() > 0) {
                        if (inputCommands[1].equals("left")) {
                            for (int i = 0; i < count % numbers.size(); i++) {
                                numbers.add(numbers.get(0));
                                numbers.remove(0);
                            }

                        } else if (inputCommands[1].equals("right")) {
                            for (int i = 0; i < count % numbers.size(); i++) {
                                numbers.add(0, numbers.get(numbers.size() - 1));
                                numbers.remove(numbers.size() - 1);
                            }
                        }
                    }
                    break;
            }
        }
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}