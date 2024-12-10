package org.example.module;

public class ElectricAuto extends Automobile {
    private int batteryCapacity;

    public ElectricAuto() {}

    public ElectricAuto(int enginePower, int weight, int fuelTank, float fuelConsumptionPerKm,
                        int countOfSeats, int countOfPassengers, int batteryCapacity) {
        super(enginePower, weight, fuelTank, fuelConsumptionPerKm, countOfSeats, countOfPassengers);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double chargeTime(int chargerPower) {
        return (double) batteryCapacity / chargerPower;
    }


    public double travelTime(int speed, boolean airConditionerState) {
        if (airConditionerState) {
            batteryCapacity -= 10;
        }
        this.distance = batteryCapacity / fuelConsumptionPerKm;
        return distance / speed;
    }

    @Override
    public String toString() {
        return super.toString() + "; BatteryCapacity: " + batteryCapacity;
    }
}