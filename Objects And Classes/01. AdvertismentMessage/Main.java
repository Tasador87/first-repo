package Exercise.AdvertismentMessage_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Messages messages = new Messages();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number ; i++) {
            System.out.println(messages.randomMessage());
        }
    }
}
