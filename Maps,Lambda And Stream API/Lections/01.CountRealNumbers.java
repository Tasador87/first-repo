package Lections;

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> mapOfNumbers = new TreeMap<>();

        for (double num : inputData) {
//            if (!mapOfNumbers.containsKey(num)) {
//                mapOfNumbers.put(num, 0);
//            }
            mapOfNumbers.putIfAbsent(num,0);
            int oldValue = mapOfNumbers.get(num);
            mapOfNumbers.put(num, oldValue + 1);
        }
//        String pattern = "%.0f -> %d";
        DecimalFormat df = new DecimalFormat("#.####");
        for (Map.Entry<Double, Integer> keyValuePair : mapOfNumbers.entrySet()) {
//            System.out.println(String.format(pattern,keyValuePair.getKey(),keyValuePair.getValue()));
//            System.out.println(keyValuePair.getKey() + " -> " + keyValuePair.getValue());
            System.out.println(df.format(keyValuePair.getKey()) + " -> " + keyValuePair.getValue());
        }
    }
}
