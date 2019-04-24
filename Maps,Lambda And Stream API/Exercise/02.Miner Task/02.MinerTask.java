package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        int quantity = 0;

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!"stop".equals(key)) {

            quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(key)) {
                int tempQuantity = resources.get(key);
                resources.put(key, quantity + tempQuantity);

            }else{
                resources.put(key, quantity);
            }
            key = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> kvp : resources.entrySet()) {
            System.out.println(kvp.getKey() + " -> " + kvp.getValue());
        }
    }
}
