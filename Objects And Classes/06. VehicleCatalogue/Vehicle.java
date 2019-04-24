package Exercise.VehicleCatalogue_06;

public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String color;
    private Double horsePower;

    public Vehicle(String typeOfVehicle, String model, String color, Double horsePower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public String getModel() {

        return this.model;
    }

    public String getColor() {

        return this.color;
    }

    public Double getHorsePower() {

        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f", getTypeOfVehicle(), getModel(), getColor(), getHorsePower());
    }
}
