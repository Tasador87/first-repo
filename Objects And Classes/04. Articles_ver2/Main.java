package Exercise.Articles_ver2_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> outputData = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            outputData.add(article);
        }
        String sortingType = scanner.nextLine();

        if (sortingType.equals("title")) {
            outputData.stream().sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).forEach(article -> {
                System.out.println(article);
            });
        } else if (sortingType.equals("content")) {
            outputData.stream().sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent())).forEach(article -> {
                System.out.println(article);
            });
        } else if (sortingType.equals("author")) {
            outputData.stream().sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor())).forEach(article -> {
                System.out.println(article);
            });
        }
    }
}
