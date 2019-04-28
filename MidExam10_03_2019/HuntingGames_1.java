package MidExam10_03_2019;

import java.util.Scanner;

public class HuntingGames_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfTheAdventure = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double allPlayersEnergy = Double.parseDouble(scanner.nextLine());

        double waterPerDayForOnePerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOnePerson = Double.parseDouble(scanner.nextLine());
        double waterSupliesAll = daysOfTheAdventure * waterPerDayForOnePerson * players;
        double foodSupliesAll = daysOfTheAdventure * foodPerDayForOnePerson * players;
        double lostEnergyPerDay = 0;
        int count = 0;

        while (daysOfTheAdventure > 0) {
            count++;
            lostEnergyPerDay = Double.parseDouble(scanner.nextLine());

            allPlayersEnergy = allPlayersEnergy - lostEnergyPerDay;

            if (allPlayersEnergy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", foodSupliesAll, waterSupliesAll);
                return;
            } else {

                if (count % 2 == 0) {
                    allPlayersEnergy = allPlayersEnergy + (allPlayersEnergy * 0.05);
                    waterSupliesAll = waterSupliesAll - (waterSupliesAll * 0.30);
                }

                if (count % 3 == 0) {
                    foodSupliesAll = foodSupliesAll - foodSupliesAll / players;
                    allPlayersEnergy = allPlayersEnergy + (allPlayersEnergy * 0.10);
                }
            }
            daysOfTheAdventure--;
        }
        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", allPlayersEnergy);
    }
}
