package Lections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().toLowerCase().split("\\s+");
        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String wordKey : words) {
            if (counts.containsKey(wordKey)) {
                counts.put(wordKey, counts.get(wordKey) + 1);
            } else {
                counts.put(wordKey, 1);
            }
        }

        ArrayList<String> oddsList = new ArrayList<>();

        for (Map.Entry<String, Integer> kvp : counts.entrySet()) {
            if (kvp.getValue() % 2 == 1) {
                oddsList.add(kvp.getKey());
            }
        }
        for (int i = 0; i < oddsList.size(); i++) {
            System.out.print(oddsList.get(i));
            if (i < oddsList.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
