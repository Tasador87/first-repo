package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courseInformation = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("end")){
            List<String> informationList = Arrays.stream(command.split(" : ")).collect(Collectors.toList());
            String courseName = informationList.get(0);
            String student = informationList.get(1);

            if (!courseInformation.containsKey(courseName)){
                courseInformation.put(courseName,new ArrayList<>());
                courseInformation.get(courseName).add(student);
            }else{
                courseInformation.get(courseName).add(student);
            }

            command = scanner.nextLine();
        }

        courseInformation.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue().size(),a.getValue().size());
            if (sort == 0){
                for (int i = 0; i < a.getValue().size() ; i++) {
                    a.getValue().get(i).compareTo(b.getValue().get(i));
                }
            }
            return sort;
    }).forEach( e -> {
            System.out.println(String.format("%s: %d ",e.getKey(),e.getValue().size()));

            Collections.sort(e.getValue());
            //Collections.sort(e.getValue(),Collections.reverseOrder());  -- това е да ги принтира в обратен ред (descending order)

            for (int i = 0; i < e.getValue().size() ; i++) {
                String name = e.getValue().get(i);
                System.out.println("-- " + name);
            }
        });
    }
}