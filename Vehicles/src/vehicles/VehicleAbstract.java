package vehicles;

public abstract class VehicleAbstract implements Vehicle{
    protected double fuelQuantity;
    protected double fuelConsumption;

    public VehicleAbstract(double fuelQuantity, double fuelConsumption) {
       setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
