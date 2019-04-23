package Exercise;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String inputData ="";

        while (!inputData.equals("end")){
            inputData = scanner.nextLine().toLowerCase();

            String[] commands = inputData.split("\\s+");

            if (commands[0].equals("delete")){
                int removeNumbers = Integer.parseInt(commands[1]);
                numbers.removeIf(i -> i == removeNumbers);
            }
            if (commands[0].equals("insert")){
                if (Integer.parseInt(commands[2]) < numbers.size())
                    numbers.add(Integer.parseInt(commands[2]),Integer.parseInt(commands[1]));
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}