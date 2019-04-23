package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> peopleInWagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int maxPeopleinOneWagon = Integer.parseInt(scanner.nextLine());

        String inputData = "";

        while (!inputData.equals("end")){
            inputData = scanner.nextLine().toLowerCase();
            String[] commands = inputData.split("\\s+");

            if (commands[0].equals("add")){
                peopleInWagons.add(Integer.parseInt(commands[1]));
            }else if (!commands[0].equals("end")){
                for (int i = 0; i < peopleInWagons.size(); i++) {
                    int currentPeople = peopleInWagons.get(i);
                    if (currentPeople + Integer.parseInt(commands[0]) <= maxPeopleinOneWagon){
                        currentPeople += Integer.parseInt(commands[0]);
                        peopleInWagons.set(i,currentPeople);
                        break;
                    }

                }
            }

        }
        System.out.println(peopleInWagons.toString().replaceAll("[\\[\\],]",""));
    }
}
