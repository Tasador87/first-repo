import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = getTriangleArea(width, height);

        System.out.printf("%.0f",area);
    }

    private static double getTriangleArea(double width, double height) {
        return width * height;
    }
}
