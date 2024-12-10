package org.example;

import org.example.module.*;


public class Main {
    public static void main(String[] args) {
        // Создаем объект Vehicle
        Vehicle scooter = new Vehicle(10, 50, 5, 0.05F);
        System.out.println("Описание скутера: " + scooter);
        System.out.println("Время поездки (50 км/ч): " + scooter.travelTime(50) + " ч. Дальность хода " + scooter.getDistance()+ " км");
        System.out.println();

        // Создаем объект Motorboat
        Motorboat boat = new Motorboat(10, 100, 12, 0.2F, 0.3F);
        System.out.println("Описание моторной лодки: " + boat);
        System.out.println("Время поездки (20 км/ч, течение 5): " + boat.travelTime(20, 5) + " ч. Дальность хода " + boat.getDistance()+ " км");
        System.out.println("Рыбалка на тунца (на скорости 5 км/ч): " + boat.tunaFishing(5));
        System.out.println();

        // Создаем объект Automobile
        Automobile car = new Automobile(90, 1000, 80, 0.1F, 5, 10);
        System.out.println("Описание автомобиля: " + car);
        System.out.println("Время поездки (100 км/ч, кондиционер включен): " + car.travelTime(100, true) + " ч. Дальность хода " + car.getDistance()+ " км");
        System.out.println("Рейд полиции: " + car.policeRaid());
        System.out.println();

        // Создаем объект Airplane
        Airplane plane = new Airplane(160, 525, 250, 0.14F, 655, 0);
        System.out.println("Описание самолета: " + plane);
        System.out.println("Время полета (155 км/ч, ветер 0): " + plane.travelTime(155, 0) + " ч. Дальность хода " + plane.getDistance()+ " км");
        System.out.println("Прыжок с парашютом (высота 900 м): " + plane.parachuteJump(900));
        System.out.println();

        // Создаем объект ElectricAuto
        ElectricAuto electricCar = new ElectricAuto(150, 1800, 0, 0.2f, 5, 4, 75); // Батарея 75 кВт·ч
        System.out.println("Описание электромобиля: " + electricCar);
        System.out.println("Время зарядки (50 кВт): " + electricCar.chargeTime(50) + " ч");
        System.out.println("Время поездки (80 км/ч, кондиционер включен): " +
                electricCar.travelTime(80, true) + " ч. Дальность хода " + electricCar.getDistance()+ " км");
        System.out.println();

        // Создаем объект PetrolAuto
        PetrolAuto petrolCar = new PetrolAuto(200, 1500, 60, 0.1f, 5, 4, "стандартный"); // Бак 60 л
        System.out.println("Описание бензинового авто: " + petrolCar);
        System.out.println("Время заправки (10 л/мин): " + petrolCar.refuelTime(10) + " мин");
        System.out.println("Время поездки (100 км/ч, кондиционер включен): " +
                petrolCar.travelTime(100, true) + " ч. Дальность хода " + petrolCar.getDistance()+ " км");
        System.out.println();

    }
}