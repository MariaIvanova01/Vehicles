package vehicles;

import java.text.DecimalFormat;

public class Bus extends VehicleAbstract {

    private double consumptionWithPeople = 0;

    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public void setConsumptionWithPeople() {
        if(this.consumptionWithPeople == 0) {
            this.consumptionWithPeople = 1.4;
        }
    }

    public void unsetConsumtionWithPeople() {
        if(this.consumptionWithPeople == 1.4) {
            this.consumptionWithPeople = 0;
        }
    }

    @Override
    public String drive(double kilometers) {
        double fuelNeeded = kilometers * (this.fuelConsumption + consumptionWithPeople);
        if (getFuelQuantity() < fuelNeeded){
            return "Bus needs refueling";
        }
        setFuelQuantity(getFuelQuantity() - fuelNeeded);
        DecimalFormat format = new DecimalFormat("###.##");
        return String.format("Bus travelled %s km",format.format(kilometers));
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
}
