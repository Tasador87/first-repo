package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniExamResults_izpitna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> examResults = new TreeMap<>();
        Map<String, Integer> submissions = new TreeMap<>();
        int count = 1;

        String command = scanner.nextLine();

        while (!command.equals("exam finished")) {

            List<String> inputData = Arrays.stream(command.split("-")).collect(Collectors.toList());

            String name = inputData.get(0);
            String submision = inputData.get(1);

            if (!inputData.get(1).equals("banned")) {

                int points = Integer.parseInt(inputData.get(2));

                if (!submissions.containsKey(submision)) {
                    submissions.put(submision, count);
                } else {
                    submissions.put(submision, submissions.get(submision) + count);
                }

                if (!examResults.containsKey(name)) {
                    examResults.put(name, points);
                } else {
                    if (examResults.get(name) < points) {
                        examResults.remove(name);
                        examResults.put(name, points);
                    }
                }

            }else if (inputData.get(1).equals("banned")){
                examResults.remove(name);
            }

            command = scanner.nextLine();
        }


        System.out.println("Results:");
        examResults.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue(),a.getValue());
            if (sort == 0){
                a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach( e -> {
            System.out.println(String.format("%s | %d",e.getKey(),e.getValue()));
        });

        System.out.println("Submissions:");
        submissions.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue(),a.getValue());
            if (sort == 0){
                a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach( e -> {
            System.out.println(String.format("%s - %d",e.getKey(),e.getValue()));
        });
    }
}
