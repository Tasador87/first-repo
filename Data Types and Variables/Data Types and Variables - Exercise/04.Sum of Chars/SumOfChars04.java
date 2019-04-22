//Write a program, which sums the ASCII codes of n characters and prints the sum on the console.
//Input
//•	On the first line, you will receive n – the number of lines, which will follow
//•	On the next n lines – you will receive letters from the Latin alphabet
//Output
//Print the total sum in the following format:
//The sum equals: {totalSum}

import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumbers = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int result = 0;

        for (int i = 0; i < lineNumbers; i++) {
            char alphabetic = (scanner.nextLine().charAt(0));
            num = num + alphabetic;
        }
        System.out.println("The sum equals: " + num);

        String text = scanner.nextLine();
        for (int i = 0; i < text.length() ; i++) {
            result = result + text.charAt(i);
        }
        System.out.println("The sum of all text is: " + result);
    }
}
