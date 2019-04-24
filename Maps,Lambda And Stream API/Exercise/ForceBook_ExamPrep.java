package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class ForceBook_IzpitnaZad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceInformation = new LinkedHashMap<>();

        String inputData = scanner.nextLine();
        List<String> inputDataList = new ArrayList<>();

        while (!inputData.equals("Lumpawaroo")) {

            if (inputData.contains(" | ")) {
                inputDataList = Arrays.stream(inputData.split(" [|] ")).collect(Collectors.toList());

                String forceSide = inputDataList.get(0);
                String forceName = inputDataList.get(1);

                if (!forceInformation.containsKey(forceSide)) {
                    forceInformation.put(forceSide, new ArrayList<>());
                    forceInformation.get(forceSide).add(forceName);
                } else {
                    if (!forceInformation.get(forceSide).contains(forceName)) {
                        forceInformation.get(forceSide).add(forceName);
                    }
                }

            } else if (inputData.contains(" -> ")) {
                inputDataList = Arrays.stream(inputData.split(" -> ")).collect(Collectors.toList());

                String forceSide = inputDataList.get(1);
                String forceName = inputDataList.get(0);

                if (forceInformation.containsKey(forceSide)) {

                    forceInformation.forEach((key, value) -> {
                        value.remove(forceName);
                    });
                    forceInformation.get(forceSide).add(forceName);
                    System.out.println(String.format("%s joins the %s side!", forceName, forceSide));
                }
            }
            inputData = scanner.nextLine();
        }

        forceInformation.entrySet().stream().sorted((a, b) -> {
            int sort = Integer.compare(b.getValue().size(), a.getValue().size());
            if (sort == 0) {
                sort = a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach(e -> {
            if (forceInformation.get(e.getKey()).size() > 0) {
                System.out.println(String.format("Side: %s, Members: %d ", e.getKey(), e.getValue().size()));
            }
            Collections.sort(e.getValue());

            for (int i = 0; i < e.getValue().size(); i++) {
                String name = e.getValue().get(i);
                System.out.println("! " + name);
            }
        });
    }
}
