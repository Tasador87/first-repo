package Exercise;//Задаваме за вход някакво число, и ако то се дели на всички числа, които се съдържат във това число,
// ако има някое което се дели на 8, и има в него поне 1 нечетно число да принтира това число.

import java.util.Scanner;

public class TopNumber_10Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());                                          //вход число от конзолата

        for (int i = 1; i <= number; i++) {                                                         //превъртаме всички числа от 1 до number
            if (isDigitDevisibleBy8(i) && isDigitHaveOneOddNumber(i)){                              //ако числото се дели на 8 и има нечетно в него, го принтираме
                System.out.println(i);
            }
        }
    }

    private static boolean isDigitHaveOneOddNumber(int number){                                     //метод който открива дали в числото се съдържа нечетна цифра
        String num = String.valueOf(number);

        for (int i = 0; i <num.length() ; i++) {

           if (Integer.parseInt(String.valueOf(num.charAt(i))) %2 != 0){
               return true;
           }
        }
        return false;
    }

    private static boolean isDigitDevisibleBy8(int number) {                                        //метод който открива дали числото се дели на 8.

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        if (sum % 8 == 0){
            return true;
        }
        return false;
    }
}
