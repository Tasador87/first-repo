package Exercise.OrderByAge_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!data.equals("End")) {

            String[] inputData = data.split(" ");
            String firstName = inputData[0];
            String id = inputData[1];
            int age = Integer.parseInt(inputData[2]);

            Person person = new Person(firstName, id, age);
            personList.add(person);

            data = scanner.nextLine();
        }

        personList.stream().sorted((age1, age2) -> Integer.compare(age1.getAge(), age2.getAge())).forEach(person -> System.out.println(person));
    }
}
