package Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> counts = new LinkedHashMap<>();

        Arrays.stream(new String[]{scanner.nextLine()}).forEach(e -> {
            for (int i = 0; i < e.length(); i++) {
                if (counts.containsKey(e.charAt(i))) {
                    counts.put(e.charAt(i), counts.get(e.charAt(i)) + 1);
                } else {
                    counts.put(e.charAt(i), 1);
                }
                counts.remove(' ');
            }

            counts.forEach((key, value) -> System.out.println(String.format("%c -> %d", key, value)));
        });
    }
}