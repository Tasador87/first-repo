import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayOfStringNumbers = scanner.nextLine().split("");
        String[] positiveStringArray = new String[arrayOfStringNumbers.length];
        int[] arrayOfNumbers = new int[positiveStringArray.length];

            if (arrayOfStringNumbers[0].equals("-")){
                for (int i = 1; i < arrayOfStringNumbers.length; i++) {
                  positiveStringArray[i] = arrayOfStringNumbers[i];
                  arrayOfNumbers[i] = Integer.parseInt(positiveStringArray[i]);
                }
            }else {
                for (int i = 0; i < arrayOfStringNumbers.length; i++) {
                    positiveStringArray[i] = arrayOfStringNumbers[i];
                    arrayOfNumbers[i] = Integer.parseInt(positiveStringArray[i]);
                }
            }
        System.out.println(Math.abs(getMultipleofEvenAndOdds(arrayOfNumbers)));
    }
    private static int getMultipleofEvenAndOdds(int[] array) {
        int sumEvens = getSumEvens(array);
        int sumOdds = getSumOdds(array);
        return sumEvens * sumOdds;
    }
    private static int getSumOdds(int[] array) {
        int sumOdds = 0;
        for (int i1 : array) {
            if (i1 % 2 != 0) {
                sumOdds += i1;
            }
        }
        return sumOdds;
    }
    private static int getSumEvens(int[] array) {
        int sumEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEvens += array[i];
            }
        }
        return sumEvens;
    }
}
