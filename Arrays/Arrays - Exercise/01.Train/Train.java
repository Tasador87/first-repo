import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberWagons = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numberWagons];
        int allPeople = 0;

        for (int i = 0; i < numberWagons; i++) {
            int numberPeople = Integer.parseInt(scanner.nextLine());
            array[i] = numberPeople;
            allPeople += numberPeople;
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.printf("%n%d",allPeople);
    }
}
