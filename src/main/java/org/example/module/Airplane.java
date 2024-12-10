package org.example.module;

public class Airplane extends Vehicle{
    private int loadCapacity;
    private int cargoWeight;

    public Airplane() {}

    public Airplane(int enginePower, int weight, int fuelTank, float fuelConsumptionPerKm, int loadCapacity, int cargoWeight) {
        super(enginePower, weight, fuelTank, fuelConsumptionPerKm);
        this.loadCapacity = loadCapacity;
        this.cargoWeight = cargoWeight;
    }

    public double travelTime(int speed, int windSpeed) {
        if (cargoWeight > loadCapacity) {
            this.distance = 0;
            return 0;
        }
        this.distance = (fuelTank / fuelConsumptionPerKm) * (1 - (cargoWeight/loadCapacity)*0.25);
        return distance / (speed + windSpeed);
    }

    public String parachuteJump(int altitude) {
        if (altitude >= 800 && altitude <= 5000) {
            return "You can jump";
        }
        else if (altitude > 5000) {
            return "Reduce altitude";
        }
        else if (altitude < 800) {
            return "Increase altitude";
        }
        return "";
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String toString() {
        return super.toString() + "; LoadCapacity: " + loadCapacity + "; CargoWeight" + cargoWeight;
    }

}
