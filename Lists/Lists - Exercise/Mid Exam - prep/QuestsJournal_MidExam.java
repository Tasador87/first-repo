package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestsJournal_MidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputData = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!"Retire!".equals(command)) {

            List<String> questsData = Arrays.stream(command.split(" - ")).collect(Collectors.toList());
            String newCommand = questsData.get(0);

            if (newCommand.equals("Start")) {
                if (!inputData.contains(questsData.get(1))) {
                    inputData.add(questsData.get(1));
                }
            } else if (newCommand.equals("Complete")) {
                    inputData.remove(questsData.get(1));

            } else if (newCommand.equals("Side Quest")) {
                String[] sideQuest = questsData.get(1).split("[:]");
                int index = 0;
                for (int i = 0; i < inputData.size(); i++) {
                    if (inputData.get(i).equals(sideQuest[0])) {
                        index = i;
                    }
                }
                if (!inputData.contains(sideQuest[1])) {
                    inputData.add(index + 1, sideQuest[1]);
                }

            } else if (newCommand.equals("Renew")) {
                if (inputData.contains(questsData.get(1))) {
                    inputData.remove(questsData.get(1));
                    inputData.add(questsData.get(1));
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < inputData.size(); i++) {
            if (i == inputData.size() - 1) {
                System.out.println(inputData.get(i));
            } else {
                System.out.print(inputData.get(i) + ", ");
            }
        }
    }
}
