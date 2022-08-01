package vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleAbstract {

    private  static final double INCREASE_OF_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption,int tankCapacity) {
        super(fuelQuantity, fuelConsumption + INCREASE_OF_CONSUMPTION,tankCapacity);
    }
    @Override
    public void refuel(double litters) {
        if (litters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if ((getFuelQuantity() + (litters * 0.95)) > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }else {
            setFuelQuantity(getFuelQuantity() + (litters * 0.95));
        }
    }

    @Override
    public String drive(double kilometers) {
        double fuelNeeded = kilometers * this.fuelConsumption;
        if (getFuelQuantity() < fuelNeeded){
            return "Truck needs refueling";
        }
        setFuelQuantity(getFuelQuantity() - fuelNeeded);
        DecimalFormat format = new DecimalFormat("###.##");
        return String.format("Truck travelled %s km",format.format(kilometers));
    }
}
