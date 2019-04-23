package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_Exercice_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+"); //четем стринг от конзолата и го превръщаме в масив от стрингове.

        int[] numbers = new int[inputData.length];  //създаваме нов масив от цели числа с 0-ли, който има дължината на inputData.

        for (int i = 0; i < inputData.length; i++) {
            numbers[i] = Integer.parseInt(inputData[i]); //попълваме масива numbers с числата от inputData.
        }

        String input = "";                               // създаваме си празен стринг.
        while (!"end".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {

                case "exchange":
                    exchangeArray(numbers, Integer.parseInt(data[1]));
                    break;
                case "max":
                    maxElementIndex(numbers, data[1]);
                    break;
                case "min":
                    minElementIndex(numbers, data[1]);
                    break;
                case "first":
                    firstCountElement(numbers, Integer.parseInt(data[1]), data[2]);
                    break;
                case "last":
                    lastCountElement(numbers, Integer.parseInt(data[1]), data[2]);
                    break;

            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void lastCountElement(int[] numbers, int count, String command) {
        if (validateCount(numbers, count)) return;

        int num = (command.equals("even")) ? 0 : 1;
        int index = 0;
        fillElementsByCriteria(numbers, count, num ,index,"last");
    }

    private static void firstCountElement(int[] numbers, int count, String command) {
        if (validateCount(numbers, count)) return;

        int num = (command.equals("even")) ? 0 : 1;
        int index = 0;
        fillElementsByCriteria(numbers, count, num ,index,"first");

    }

    private static boolean validateCount(int[] numbers, int count) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return true;
        }
        return false;
    }

    private static void fillElementsByCriteria(int[] numbers, int count, int num, int index, String criteria) {

        int[] result = new int[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (index == result.length) {
                    result = changeArraySize(result);
                }
                result[index++] = numbers[i];
            }
        }

        if (index == 0) {
            System.out.println("[]");
        } else {
            int minCount = Math.min(count, result.length);
            String output = "[";

            if (criteria.equals("first")) {
                for (int i = 0; i < minCount; i++) {
                    if (i < minCount - 1) {
                        output += result[i] + ", ";
                    } else {
                        output += result[i] + "]";
                    }
                }
            }else{
                int newCount = 0;
                for (int i = 0; i < minCount; i++) {
                    if (i < minCount - 1) {
                        output += result[result.length - minCount + newCount++] + ", ";
                    } else {
                        output += result[result.length - minCount + newCount++] + "]";
                    }
                }
            }

            System.out.println(output);
        }
    }

    private static int[] changeArraySize(int[] result) {
        int[] newArray = new int[result.length + 1];

        for (int i = 0; i < result.length; i++) {
            newArray[i] = result[i];
        }
        return newArray;
    }

    private static void minElementIndex(int[] numbers, String command) {

        int num = (command.equals("even")) ? 0 : 1;

        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                int currentElement = numbers[i];
                if (currentElement <= minElement) {
                    minElement = currentElement;
                    index = i;
                }
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void maxElementIndex(int[] numbers, String command) {
        int num = (command.equals("even")) ? 0 : 1;

        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                int currentElement = numbers[i];
                if (currentElement >= maxElement) {
                    maxElement = currentElement;
                    index = i;
                }
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void exchangeArray(int[] numbers, int index) {    //създаваме си метод exchange

        if (index < 0 || index >= numbers.length) {                  //ако индекса е по-малък от 0 или по-голям или равен на дължината на масива е невалиден.
            System.out.println("Invalid index");
            return;
        }

        int count = 0;                                               //създаваме си брояч, който да се увеличава,
        int[] result = new int[numbers.length];                     //създаваме си нов масив в който ще сложим разменените числа.

        for (int i = index + 1; i < numbers.length; i++) {           //ако индекса е 1 + 1 = 2, ако numbers = 1 2 3 4 5  - ще вземе 2рия елемент който е 2
            //                               index = 0 1 2 3 4
            result[count++] = numbers[i];                              // в началото result = 0 0 0 0 0 , и ние казваме на местата където numbers от i , да напълни тези места в result с числата от numbers.
        }
        for (int i = 0; i <= index; i++) {
            result[count++] = numbers[i];
        }

        for (int i = 0; i < result.length; i++) {
            numbers[i] = result[i];
        }
    }
}
