package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();
        Map<String, Double> students2 = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)){
                students.put(name, new ArrayList<>());
                students.get(name).add(grade);
            }else{
                students.get(name).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> kvp : students.entrySet()) {
            double[] averageArray = new double [kvp.getValue().size()];
            for (int i = 0; i < averageArray.length ; i++) {
                averageArray[i] = kvp.getValue().get(i);
            }
            double average = Arrays.stream(averageArray).average().getAsDouble();
            students2.put(kvp.getKey(),average);
        }

        List<Map.Entry<String, Double>> result = students2.entrySet().stream().filter(e -> e.getValue() >= 4.50).sorted((a, b) -> Double.compare(b.getValue(), a.getValue())).collect(Collectors.toList());

        for (Map.Entry<String, Double> kvp : result) {
            System.out.printf("%s -> %.2f%n",kvp.getKey(),kvp.getValue());
        }
    }
}
