//You will be given a single integer. Your task is to find the sum of its digits.
//Examples
//Input	  Output
//245678	32
//97561 	28
//543	    12

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int num2 = 0;
        int result = 0;

        for (int i = 0; i < num.length() ; i++) {
             num2 = Integer.parseInt(String.valueOf(num.charAt(i)));
             result = num2 + result;
        }
        System.out.println(result);
    }
}
