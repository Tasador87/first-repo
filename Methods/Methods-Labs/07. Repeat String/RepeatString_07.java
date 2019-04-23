import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int timesRepeat = Integer.parseInt(scanner.nextLine());
        String result = repeatedMethod(text, timesRepeat);
        System.out.println(result);

    }
    private static String repeatedMethod(String text, int timesRepeat) {
        String repeatedText = "";

        for (int i = 0; i < timesRepeat; i++) {
            repeatedText = text + repeatedText;
        }
        return repeatedText;
    }
}