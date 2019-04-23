package LABS;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        List<String> productsType = new ArrayList<>();

        for (int i = 0; i < numberOfProducts; i++) {
            String inputProduct = scanner.nextLine();
            productsType.add(inputProduct);
        }
        Collections.sort(productsType);
        for (int i = 0; i < numberOfProducts ; i++) {
            System.out.printf("%d.%s%n",i+1, productsType.get(i));
        }
    }
}
