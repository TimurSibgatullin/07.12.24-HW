package org.example.module;

public class Automobile extends Vehicle {
    private int countOfSeats;
    private int countOfPassengers;

    public Automobile() {}

    public Automobile(int enginePower, int weight, int fuelTank, float fuelConsumptionPerKm, int countOfSeats, int countOfPassengers) {
        super(enginePower, weight, fuelTank, fuelConsumptionPerKm);
        this.countOfSeats = countOfSeats;
        this.countOfPassengers = countOfPassengers;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }


    public double travelTime(int speed, boolean airConditionerState) {
        if (airConditionerState) {
            fuelConsumptionPerKm += 0.01;
        }
        this.distance = fuelTank / fuelConsumptionPerKm;
        return distance / speed;
    }

    public String policeRaid() {
        if (countOfSeats >= countOfPassengers) {
            return "You can go";
        }
        else {
            return "You have too many passengers. You should pay a fine in amount of " +
                    ((countOfPassengers - countOfSeats) * 500) + " eurodollars";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; CountOfSeats: " + countOfSeats +  "; CountOfPassengers: " + countOfPassengers;
    }
}
