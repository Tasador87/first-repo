package Exercise.VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        int countCars = 0;
        Double horsePowerCars = 0.00;
        int countTrucks = 0;
        Double horsePowerTrucks = 0.00;

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!data.equals("End")) {

            String[] inputData = data.split(" ");

            String typeOfvehicle = inputData[0].substring(0, 1).toUpperCase() + inputData[0].substring(1);
            String model = inputData[1];
            String color = inputData[2];
            Double horsePower = Double.parseDouble(inputData[3]);

            Vehicle vehicle = new Vehicle(typeOfvehicle, model, color, horsePower);
            vehicleList.add(vehicle);


            if (typeOfvehicle.equals("Car")) {
                countCars++;
                horsePowerCars += horsePower;
            } else if (typeOfvehicle.equals("Truck")) {
                countTrucks++;
                horsePowerTrucks += horsePower;
            }

            data = scanner.nextLine();
        }

        String modelFinder = scanner.nextLine();

        while (!modelFinder.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicleList) {
                if (modelFinder.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                }
            }
//            String finalModelFinder = modelFinder;
//            vehicleList.stream().filter(v-> v.getModel().equals(finalModelFinder)).forEach(System.out::println);

            modelFinder = scanner.nextLine();
        }

        double averageHorsePowerCars = horsePowerCars / countCars;
        double averageHorsePowerTrucks = horsePowerTrucks / countTrucks;

        if (countCars == 0) {
            averageHorsePowerCars = 0.0;
        } else if (countTrucks == 0) {
            averageHorsePowerTrucks = 0.0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePowerTrucks);
    }
}