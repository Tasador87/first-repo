import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int waterTank = 255;


        for (int i = 0; i < num; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            count += liters;

            if (count > waterTank) {
                System.out.println("Insufficient capacity!");
                count = count - liters;
            }

        }
        System.out.println(count);
    }
}
