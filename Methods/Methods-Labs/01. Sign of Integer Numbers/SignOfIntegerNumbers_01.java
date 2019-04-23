//Create a method that prints the sign of an integer number.
//   Example
//   Input	Output
//    2	    The number 2 is positive.
//   -5	    The number -5 is negative.
//    0  	The number 0 is zero.

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        checkSign(number);

    }

    static void checkSign(int numbers) {
        if (numbers > 0) {
            System.out.printf("The number %d is positive.", numbers);
        } else if (numbers < 0) {
            System.out.printf("The number %d is negative.", numbers);
        } else {
            System.out.print("The number 0 is zero.");
        }
    }
}
