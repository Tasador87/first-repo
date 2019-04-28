import java.util.*;

public class FinalExamZad_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String road = "";
        String racer = "";
        String newRoad = "";

        String inputData = scanner.nextLine();
        Map<String, List<String>> raceInformation = new TreeMap<>();

        while (!inputData.equals("END")) {
            String[] newData = inputData.split("->");
            String command = newData[0];
            switch (command) {
                case "Add":
                    road = newData[1];
                    racer = newData[2];
                    if (!raceInformation.containsKey(road)) {
                        raceInformation.put(road, new ArrayList<>());
                        raceInformation.get(road).add(racer);
                    } else {
                        raceInformation.get(road).add(racer);
                    }
                    break;
                case "Move":
                    road = newData[1];
                    racer = newData[2];
                    newRoad = newData[3];

                    if (raceInformation.get(road).contains(racer)){
                        raceInformation.get(road).remove(racer);
                        raceInformation.get(newRoad).add(racer);
                    }
                        break;
                case "Close":
                    road = newData[1];
                    if (raceInformation.containsKey(road)){
                        raceInformation.remove(road);
                    }
                    break;
            }

            inputData = scanner.nextLine();
        }

        System.out.println("Practice sessions:");

        raceInformation.entrySet().stream().sorted((a,b)-> Integer.compare(b.getValue().size(),a.getValue().size())).forEach(e -> {
            System.out.println(e.getKey());

            e.getValue().stream().forEach(value -> System.out.println("++"+ value));

        });
    }
}
