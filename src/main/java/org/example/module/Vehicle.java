package org.example.module;

public class Vehicle {
    protected int enginePower;
    protected int weight;
    protected int fuelTank;
    protected float fuelConsumptionPerKm;
    protected double distance;

    public Vehicle() {}

    public Vehicle(int enginePower, int weight, int fuelTank, float fuelConsumptionPerKm) {
        this.enginePower = enginePower;
        this.weight = weight;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.fuelTank = fuelTank;
    }

    public double travelTime(int speed) {
        this.distance = fuelTank / fuelConsumptionPerKm;
        return distance / speed;
    }


    public int getEnginePower() {
        return enginePower;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public float getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public double getDistance() {
        return distance;
    }

    public void setEnginePower(int power) {
        this.enginePower = power;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuelConsumptionPerKm(float fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void setFuelConsumptionPerKm(int fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    @Override
    public String toString() {
        return ("Мощность двигателя " + enginePower + "; Масса " + weight + "; Объём топливного бака " + fuelTank + "; Потребление топлива на км " + fuelConsumptionPerKm);
    }
}

