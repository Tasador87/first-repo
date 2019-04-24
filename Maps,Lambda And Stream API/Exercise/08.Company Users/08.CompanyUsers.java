package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyInformation = new TreeMap<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            List<String> informationList = Arrays.stream(command.split(" -> ")).collect(Collectors.toList());

            String companyName = informationList.get(0);
            String idNumber = informationList.get(1);

            if (!companyInformation.containsKey(companyName)) {
                companyInformation.put(companyName, new ArrayList<>());
                companyInformation.get(companyName).add(idNumber);
            } else {
                if (!companyInformation.get(companyName).contains(idNumber)) {
                    companyInformation.get(companyName).add(idNumber);
                }
            }
            command = scanner.nextLine();
        }

        companyInformation.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey());
            for (int i = 0; i < e.getValue().size(); i++) {
                System.out.println("-- " + e.getValue().get(i));
            }
        });
    }
}
