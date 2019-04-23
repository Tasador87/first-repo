//Write a method that calculates the total price of an order and prints it on the console. The method should receive
//one of the following products: coffee, coke, water, snacks; and a quantity of the product. The prices for a single
//piece of each product are:
// coffee – 1.50
// water – 1.00
// coke – 1.40
// snacks – 2.00
//Print the result rounded to the second decimal place

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String order = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        if (order.equals("coffee")) {
            coffeeOrder(quantity);
        } else if (order.equals("water")) {
            waterOrder(quantity);
        } else if (order.equals("coke")) {
            cokeOrder(quantity);
        } else if (order.equals("snacks")){
            snacksrOrder(quantity);
        }
    }
    private static void coffeeOrder(int quantity) {
        System.out.printf("%.2f", quantity * 1.50);
    }
    private static void waterOrder(int quantity) {
        System.out.printf("%.2f", quantity * 1.00);
    }
    private static void cokeOrder(int quantity) {
        System.out.printf("%.2f", quantity * 1.40);
    }
    private static void snacksrOrder(int quantity) {
        System.out.printf("%.2f", quantity * 2.00);
    }
}