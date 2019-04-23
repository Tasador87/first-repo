package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        while (numberOfCommands > 0) {
            String commands = scanner.nextLine();
            String[] commandsArray = commands.split("\\s+");

            if (commandsArray[2].equals("going!")) {
                if (names.contains(commandsArray[0])) {
                    System.out.println(commandsArray[0] + " is already in the list!");
                }else{
                    names.add(commandsArray[0]);
                }
            }

            if (commandsArray[2].equals("not")) {
                if (names.contains(commandsArray[0])) {
                    names.removeIf(i -> i.equals(commandsArray[0]));
                } else {
                    System.out.println(commandsArray[0] + " is not in the list!");
                }
            }

            numberOfCommands--;
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
