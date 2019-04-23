package LABS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int minLenght = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minLenght; i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        if (firstList.size() > secondList.size()) {
            for (int i = minLenght; i < firstList.size(); i++) {
                result.add(firstList.get(i));
            }
        } else {
            result.addAll(secondList.subList(minLenght,secondList.size()));
        }
        for (Integer numbs : result) {
            System.out.print(numbs + " ");
        }
    }
}
