import java.util.*;

public class Dictionary_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split(" \\| ");
        Map<String, List<String>> words = new TreeMap<>();
        String[] inputData2 = new String[1];


        for (int i = 0; i < inputData.length; i++) {
            inputData2 = inputData[i].split(": ");
            String word = inputData2[0];
            String definition = inputData2[1];

            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
                words.get(word).add(definition);
            } else {
                words.get(word).add(definition);
            }
        }

        String[] secondLine = scanner.nextLine().split(" \\| ");

        for (int i = 0; i < secondLine.length; i++) {
            String word = secondLine[i];


            words.entrySet().stream().filter(e -> e.getKey().equals(word)).forEach(e -> {

                System.out.println(String.format("%s", e.getKey()));

                e.getValue().stream().sorted((a, b) -> Integer.compare(b.length(), a.length())).forEach(value -> System.out.println(" -"+ value));
            });
        }

        String end = scanner.nextLine();
        if (end.equals("End")){
            return;
        }else if (end.equals("List")){
            for (String s : words.keySet()) {
                System.out.print(s + " ");
            }
        }
    }
}
