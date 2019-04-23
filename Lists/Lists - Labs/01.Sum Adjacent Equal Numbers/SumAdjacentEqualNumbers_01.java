package LABS;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double firstNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);
            double sum = firstNum + nextNum;
            if (firstNum == nextNum) {
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = -1;
            }
        }
//може да се принтира и така:
//        for (Double numbs : numbers) {
//            System.out.print(new DecimalFormat("#.###").format(numbs) + " ");
//        }
//        System.out.println();

        String output = "";
        for (Double numbs : numbers) {
             output += new DecimalFormat("0.###").format(numbs) + " ";
        }
        System.out.println(output.trim());
    }
}