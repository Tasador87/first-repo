package Exercise.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split(", ");

        Articles articles = new Articles(inputData[0],inputData[1],inputData[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(": ");
            String command = commands[0];

            switch (command) {
                case "Edit":
                    articles.edit(commands[1]);
                    break;

                case "ChangeAuthor":
                    articles.changeAuthor(commands[1]);
                    break;

                case "Rename":
                    articles.rename(commands[1]);
                    break;
            }
        }
        System.out.println(articles);
    }
}