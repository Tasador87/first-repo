package LABS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String inputData = "";

        while (!inputData.equals("end")) {
            inputData = scanner.nextLine().toLowerCase();
            String[] commands = inputData.split(" ");

            switch (commands[0]) {
                case "contains":
                    contains(numbers, commands);
                    break;
                case "print":
                    printEventOrOddNumbers(numbers, commands[1]);
                    break;
                case "get":
                    getSum(numbers);
                    break;
                case "filter":
                    filter(numbers, commands);
                    break;
            }
        }
    }

    private static void filter(List<Integer> numbers, String[] commands) {
        if (commands[1].equals(">")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > Integer.parseInt(commands[2])) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        } else if (commands[1].equals("<")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) < Integer.parseInt(commands[2])) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        } else if (commands[1].equals("<=")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= Integer.parseInt(commands[2])) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        } else if (commands[1].equals(">=")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) >= Integer.parseInt(commands[2])) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        }
        System.out.println();
    }

    private static void getSum(List<Integer> numbers) {
        int sum = 0;
        if (numbers.size() < 1) {
            System.out.println(sum);
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                sum = sum + numbers.get(i);
            }
            System.out.println(sum);
        }
    }

    private static void printEventOrOddNumbers(List<Integer> numbers, String command) {
        if (command.equals("even")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        } else if (command.equals("odd")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        }
        System.out.println();
    }

    public static void contains(List<Integer> numbers, String[] commands) {
        if (numbers.contains(Integer.parseInt(commands[1]))) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}