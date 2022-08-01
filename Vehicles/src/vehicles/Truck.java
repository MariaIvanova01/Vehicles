package vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleAbstract {

    private  static final double INCREASE_OF_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + INCREASE_OF_CONSUMPTION);
    }
    @Override
    public void refuel(double litters) {
        setFuelQuantity(getFuelQuantity() + (litters * 0.95));
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
