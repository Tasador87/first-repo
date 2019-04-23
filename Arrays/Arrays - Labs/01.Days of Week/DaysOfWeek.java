import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTheDay = Integer.parseInt(scanner.nextLine());
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (numberOfTheDay <= 0 || numberOfTheDay > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(days[numberOfTheDay - 1]);
        }
    }
}
