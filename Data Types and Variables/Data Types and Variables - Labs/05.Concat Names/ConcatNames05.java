import java.util.Scanner;

public class ConcatNames05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        System.out.println(name + name3 + name2);
    }
}
