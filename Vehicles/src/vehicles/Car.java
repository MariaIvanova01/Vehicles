package vehicles;

import java.text.DecimalFormat;

public class Car extends VehicleAbstract {

    private  static final double INCREASE_OF_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption,int tankCapacity) {
        super(fuelQuantity, fuelConsumption  + INCREASE_OF_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double litters) {
        if (litters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if ((getFuelQuantity() + litters) > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }else {
            setFuelQuantity(getFuelQuantity() + litters);
        }
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
