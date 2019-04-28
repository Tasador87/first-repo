package MidExam10_03_2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SeizeTheFire_MidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputData = Arrays.stream(scanner.nextLine().split("[#]")).collect(Collectors.toList());
        int amountOfWater = Integer.parseInt(scanner.nextLine());
        double effort = 0;
        int totalfire = 0;
        int range = 0;
        System.out.println("Cell: ");

        while (amountOfWater > 0) {

            for (int i = 0; i < inputData.size(); i++) {
                String first = inputData.get(i);
                List<String> inputDatanew = Arrays.stream(first.split(" = ")).collect(Collectors.toList());
                switch (inputDatanew.get(0)) {
                    case "High": {
                        range = Integer.parseInt(inputDatanew.get(1));
                        if (range >= 81 && range <= 125) {
                            amountOfWater = amountOfWater - range;
                            effort = effort + range * 0.25;
                            totalfire = totalfire + range;
                            System.out.println("-" + range);
                            break;
                        } else {
                            System.out.println("-" + range);
                            break;
                        }
                    }
                    case "Medium": {
                        range = Integer.parseInt(inputDatanew.get(1));
                        if (range >= 51 && range <= 80) {
                            amountOfWater = amountOfWater - range;
                            effort = effort + range * 0.25;
                            totalfire = totalfire + range;
                            System.out.println("-" + range);
                            break;
                        } else {
                            break;
                        }
                    }
                    case "Low": {
                        range = Integer.parseInt(inputDatanew.get(1));
                        if (range >= 1 && range <= 50) {
                            amountOfWater = amountOfWater - range;
                            effort = effort + range * 0.25;
                            totalfire = totalfire + range;
                            System.out.println("-" + range);
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        System.out.printf("Effort: %.2f", effort);
        System.out.println();
        System.out.printf("Total Fire: %d", totalfire);
    }
}
