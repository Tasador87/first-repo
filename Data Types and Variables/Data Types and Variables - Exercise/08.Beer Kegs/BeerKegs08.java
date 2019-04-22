import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double newformula = 0.0;
        String newmodel = "";

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int heigh = Integer.parseInt(scanner.nextLine());
            double formula = Math.PI * Math.pow(radius, 2) * heigh;
            if (formula > newformula){
                newformula = formula;
                newmodel = model;
            }
        }
        System.out.println(newmodel);
    }
}
