package Lections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumbers = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < lineNumbers ; i++) {
            String wordKey = scanner.nextLine();
            String synonims = scanner.nextLine();

            words.putIfAbsent(wordKey,new ArrayList<>());
            words.get(wordKey).add(synonims);
        }

        for (Map.Entry<String, ArrayList<String>> kVp : words.entrySet()) {
            System.out.println(kVp.getKey() + " - " + String.join(", ",kVp.getValue()));
        }
    }
}
