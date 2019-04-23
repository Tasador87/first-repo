package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputData = Arrays.stream(scanner.nextLine().split("[|]")).collect(Collectors.toList());

        for (int i = inputData.size() - 1; i >= 0; i--) {
            List<String> data = Arrays.stream(inputData.get(i).split("\\s+")).filter(e -> !e.equals("")).collect(Collectors.toList());
            //data.toString().replaceAll("\\s+", "");

            for (String datum : data) {
                System.out.print(datum + " ");
            }
            //System.out.print(data.toString().replaceAll("[\\[\\],\\s+]", " "));
            //System.out.print(data);
        }
    }
}