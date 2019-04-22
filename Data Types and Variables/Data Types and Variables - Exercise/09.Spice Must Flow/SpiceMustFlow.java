import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int afterShift = 0;
        int afterShiftSum = 0;
        int counter = 0;

        while (startingYield >= 100) {

            afterShift = startingYield - 26;
            afterShiftSum = afterShiftSum + afterShift;
            startingYield = startingYield - 10;
            counter++;
        }
        afterShiftSum = afterShiftSum - 26;
        afterShiftSum = Math.max(afterShiftSum,0);
        System.out.println(counter);
        System.out.println(afterShiftSum);
    }
}