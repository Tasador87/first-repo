import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower_N = Integer.parseInt(scanner.nextLine());
        int distance_M = Integer.parseInt(scanner.nextLine());
        int exhaust_Y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int originalValue = pokePower_N;

        while (pokePower_N >= distance_M) {

            if (pokePower_N * 2 == originalValue) {
                if (exhaust_Y > 0) {
                    pokePower_N = pokePower_N / exhaust_Y;
                }
            }
            if (pokePower_N >= distance_M) {
                pokePower_N = pokePower_N - distance_M;
                count++;
            }
        }
        System.out.println(pokePower_N);
        System.out.println(count);
    }
}
