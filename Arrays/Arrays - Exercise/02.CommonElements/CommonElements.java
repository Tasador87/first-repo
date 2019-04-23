import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (String words : firstArray) {
                if (words.equals(secondArray[i])) {
                    System.out.print(words + " ");
                }
            }
        }
    }
}
