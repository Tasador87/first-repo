//Write a program that receives an array and number of rotations you have to perform (first element goes at the end) Print the resulting array.
//Examples
//Input	Output
//51 47 32 61 21
//2
//32 61 21 51 47

import java.util.Arrays;
        import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        int[] tempArray = new int[array.length];

        if (n > array.length) {
            n = n % array.length;
        }

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
            if (n + i >= array.length) {
                array[i] = tempArray[n + i - array.length];
            } else {
                array[i] = array[n + i];
            }
            System.out.print(array[i] + " ");
        }
    }
}