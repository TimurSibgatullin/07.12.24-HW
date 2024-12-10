package org.example.module;

public class PetrolAuto extends Automobile {
    private String tankType;

    public PetrolAuto() {}

    public PetrolAuto(int enginePower, int weight, int fuelTank, float fuelConsumptionPerKm,
                      int countOfSeats, int countOfPassengers, String tankType) {
        super(enginePower, weight, fuelTank, fuelConsumptionPerKm, countOfSeats, countOfPassengers);
        this.tankType = tankType;
    }

    public String getTankType() {
        return tankType;
    }

    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

    public double refuelTime(double pumpSpeed) {
        return fuelTank / pumpSpeed;
    }

    @Override
    public double travelTime(int speed, boolean airConditionerState) {
        if (airConditionerState) {
            fuelConsumptionPerKm += 0.02;
        }
        this.distance = fuelTank / fuelConsumptionPerKm;
        return distance / speed;
    }

    @Override
    public String toString() {
        return super.toString() + "; TankType: " + tankType;
    }
}