package carGame.service;

import carGame.domain.Car;

import java.util.Random;

public class CarGameStart {

    public static void gameStart(int numberOfGameAttempts, Car[] cars) {
        Random random = new Random();

        for (int j = 0; j < numberOfGameAttempts; j++) {
            for (int i = 0; i < cars.length; i++) {
                if (random.nextInt(10) >= 4) {
                    cars[i].setBar("-");
                    cars[i].setCount(1);
                }
            }
            printCars(cars);
        }
    }

    private static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " ");
            System.out.println(car.getBar());
        }
        System.out.println();
    }
}
