package Lections;

        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class Largest_3_Numbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
