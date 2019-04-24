package Lections;

        import java.util.Arrays;
        import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split("\\s+")).filter(e -> e.length() % 2 == 0).toArray(String[]::new);

        for (int i = 0; i <words.length ; i++) {
            System.out.println(words[i]);
        }
        //може и така:
        //Arrays.stream(scanner.nextLine().split("\\s+")).filter(e -> e.length() % 2 == 0).forEach(e -> System.out.println(e));
    }
}
