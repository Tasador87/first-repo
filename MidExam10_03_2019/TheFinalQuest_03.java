package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class TheFinalQuest_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        List<String> input = Arrays.stream(inputData.split("\\s+")).collect(Collectors.toList());
        String commands = "";

        while (!commands.equals("Stop")) {
            String[] arrayOfcommands = commands.split("\\s+");

            if (arrayOfcommands[0].equals("Delete")) {
                int index = Integer.parseInt(arrayOfcommands[1]);
                if (index >= -1 && index < input.size() - 1) {
                    input.remove(index + 1);
                }
            } else if (arrayOfcommands[0].equals("Swap")) {
                String word1 = arrayOfcommands[1];
                String word2 = arrayOfcommands[2];

                if (input.contains(word1) && input.contains(word2)) {
                    Collections.swap(input, input.indexOf(word1), input.indexOf(word2));
                }
            } else if (arrayOfcommands[0].equals("Put")) {

                String word = arrayOfcommands[1];
                int index = Integer.parseInt(arrayOfcommands[2]);
                if (index > 0 && index <= input.size() + 1) {
                    input.add(index - 1, word);
                }
            } else if (arrayOfcommands[0].equals("Sort")) {
                input.sort(Collections.reverseOrder());

            } else if (arrayOfcommands[0].equals("Replace")) {
                String word1 = arrayOfcommands[1];
                String word2 = arrayOfcommands[2];
                if (input.contains(word2)) {
                    Collections.replaceAll(input, word2, word1);
                }
            }
            commands = scanner.nextLine();
        }
        for (String words : input) {
            System.out.print(words + " ");
        }
    }
}
