package vehicles;

import java.text.DecimalFormat;

public class Car extends VehicleAbstract {

    private  static final double INCREASE_OF_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption  + INCREASE_OF_CONSUMPTION);
    }

    @Override
    public void refuel(double litters) {
        setFuelQuantity(getFuelQuantity() + litters);
    }

    @Override
    public String drive(double kilometers) {
        double fuelNeeded = kilometers * this.fuelConsumption;
        if (getFuelQuantity() < fuelNeeded){
            return "Car needs refueling";
        }
        setFuelQuantity(getFuelQuantity() - fuelNeeded);
        DecimalFormat format = new DecimalFormat("###.##");
        return String.format("Car travelled %s km",format.format(kilometers));
    }
}
