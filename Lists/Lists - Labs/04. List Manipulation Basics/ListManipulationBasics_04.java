package LABS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String inputData = "";

        while (!inputData.equals("end")) {
            inputData = scanner.nextLine().toLowerCase();
            String[] commands = inputData.split(" ");

            switch (commands[0]) {
                case "add":
                    numbers.add(Integer.parseInt(commands[1]));
                    break;
                case "remove":
                    numbers.remove(Integer.valueOf(commands[1]));
                    break;
                case "removeat":
                    numbers.remove(Integer.parseInt(commands[1]));
                    break;
                case "insert":
                    numbers.add(Integer.parseInt(commands[2]),Integer.parseInt(commands[1]));
                    break;
            }
        }
        for (Integer numbs : numbers) {
            System.out.print(numbs + " ");
        }
    }
}
