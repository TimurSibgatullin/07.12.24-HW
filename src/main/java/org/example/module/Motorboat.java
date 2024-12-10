package org.example.module;

public class Motorboat extends Vehicle {
    private float movementResistance;

    public Motorboat() {}

    public Motorboat(int enginePower, int weight, int fuelTank, float fuelConsumptionPerKm, float movementResistance) {
        super(enginePower, weight, fuelTank, fuelConsumptionPerKm);
        this.movementResistance = movementResistance;
    }

    public double travelTime(int speed, int flowRate) {
        this.distance = (fuelTank / fuelConsumptionPerKm) * (1 - movementResistance);
        return distance / (speed + flowRate);
    }

    public String tunaFishing(int speed) {
        if (speed >= 3 && speed <= 6) {
            return "You can catch tuna";
        }
        else if (speed > 6) {
            return "Reduce speed";
        }
        else if (speed < 3) {
            return "Increase speed";
        }
        return "";
    }

    @Override
    public String toString() {
        return super.toString() + "; MovementResistance: " + movementResistance;
    }
}
