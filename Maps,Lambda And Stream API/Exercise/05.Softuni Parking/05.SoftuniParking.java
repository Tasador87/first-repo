package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> users = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");

            if (inputData[0].equals("register")){
                String username = inputData[1];
                String carNumber = inputData[2];

                if (users.containsKey(username)){
                    System.out.println("ERROR: already registered with plate number " + carNumber);
                }else{
                    users.put(username,carNumber);
                    System.out.printf("%s registered %s successfully%n",username,carNumber);
                }

            }else if (inputData[0].equals("unregister")){
                String username = inputData[1];

                if (users.containsKey(username)){
                    System.out.println(username + " unregistered successfully");
                    users.remove(username);
                }else{
                    System.out.println("ERROR: user " + username + " not found");
                }
            }
        }

        for (Map.Entry<String, String> kvp : users.entrySet()) {
            System.out.println(kvp.getKey() + " => " + kvp.getValue());
        }
    }
}
