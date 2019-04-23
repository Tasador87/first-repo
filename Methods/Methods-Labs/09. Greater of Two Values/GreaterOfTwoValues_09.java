import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();
        if (type.equals("int")){
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1,num2));
        }else if (type.equals("char")){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(getMax(a,b));
        }else if (type.equals("string")){
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first,second));
        }
    }

    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }
    public static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}