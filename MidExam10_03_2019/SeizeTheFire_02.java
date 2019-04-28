package MidExam10_03_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SeizeTheFire_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputData = Arrays.stream(scanner.nextLine().split("[#]")).collect(Collectors.toList());
        int amountOfWater = Integer.parseInt(scanner.nextLine());
        double effort = 0;
        int totalFire = 0;

        System.out.println("Cells:");

        for (int i = 0; i < inputData.size(); i++) {
            String[] typeOfFire = inputData.get(i).split(" = ");
            int range = Integer.parseInt(typeOfFire[1]);
            String command = typeOfFire[0];

            if (command.equals("Low")) {
                if (range >= 1 && range <= 50) {
                    if (amountOfWater >= range) {
                        amountOfWater = amountOfWater - range;
                        effort = effort + (range * 0.25);
                        totalFire = totalFire + range;
                        System.out.println(" - " + range);
                    }
                }
            } else if (command.equals("Medium")) {
                if (range >= 51 && range <= 80) {
                    if (amountOfWater >= range) {
                        amountOfWater = amountOfWater - range;
                        effort = effort + (range * 0.25);
                        totalFire = totalFire + range;
                        System.out.println(" - " + range);
                    }
                }
            } else if (command.equals("High")) {
                if (range >= 81 && range <= 125) {
                    if (amountOfWater >= range) {
                        amountOfWater = amountOfWater - range;
                        effort = effort + (range * 0.25);
                        totalFire = totalFire + range;
                        System.out.println(" - " + range);
                    }
                }
            }
        }
        System.out.printf("Effort: %.2f%n", effort);
        System.out.println("Total Fire: " + totalFire)

    }
}
