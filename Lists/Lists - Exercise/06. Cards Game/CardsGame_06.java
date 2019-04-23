package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOneCards = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwoCards = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int count = playerOneCards.size();

        while (playerOneCards.size() > 0 && playerTwoCards.size() > 0) {
            for (int i = 0; i < count; i++) {
                if (playerOneCards.get(i) > playerTwoCards.get(i)) {
                    playerOneCards.add(playerOneCards.get(i));
                    playerOneCards.add(playerTwoCards.get(i));

                    playerOneCards.remove(playerOneCards.get(i));
                    playerTwoCards.remove(playerTwoCards.get(i));

                    count = Math.min(playerOneCards.size(), playerTwoCards.size());
                    i = -1;
                } else if (playerOneCards.get(i) < playerTwoCards.get(i)) {
                    playerTwoCards.add(playerTwoCards.get(i));
                    playerTwoCards.add(playerOneCards.get(i));

                    playerTwoCards.remove(i);
                    playerOneCards.remove(i);

                    count = Math.min(playerOneCards.size(), playerTwoCards.size());
                    i = -1;
                } else {
                    playerOneCards.remove(i);
                    playerTwoCards.remove(i);
                    count = Math.min(playerOneCards.size(), playerTwoCards.size());
                    i = -1;
                }
            }
        }
        if (playerOneCards.size() > 0) {
            System.out.println("First player wins! Sum: " + playerOneCards.stream().mapToInt(Integer::valueOf).sum());
        } else {
            System.out.println("Second player wins! Sum: " + playerTwoCards.stream().mapToInt(Integer::valueOf).sum());
        }
    }
}