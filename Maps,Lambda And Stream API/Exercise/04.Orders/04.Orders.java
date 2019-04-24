package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        Map<String, Double> result = new LinkedHashMap<>();
        Map<String, Integer> result2 = new LinkedHashMap<>();

        while (!inputData.equals("buy")) {
            List<String> inputList = Arrays.stream(inputData.split("\\s+")).collect(Collectors.toList());
            String item = inputList.get(0);
            Double priceOneItem = Double.parseDouble(inputList.get(1));
            Integer quantity = Integer.parseInt(inputList.get(2));
            Double priceForAllItems = priceOneItem * quantity;

            if (result.containsKey(item)) {
                quantity = (result2.get(item) + quantity);
                priceForAllItems = priceOneItem * quantity;
                result.put(item, priceForAllItems);

            } else {
                result.put(item, priceForAllItems);
            }

            result2.put(item, quantity);
            inputData = scanner.nextLine();
        }

        for (Map.Entry<String, Double> kvp : result.entrySet()) {
            System.out.println(String.format("%s -> %.2f",kvp.getKey(),kvp.getValue()));
        }
    }
}
