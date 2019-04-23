import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        String[] symbols = new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            symbols[arr.length - i - 1] = arr[i];
// може и:  symbols[i] = arr[i];
//          System.out.print(symbols[i] + " ");
        }
        System.out.println(String.join(" ", symbols));
    }
}
