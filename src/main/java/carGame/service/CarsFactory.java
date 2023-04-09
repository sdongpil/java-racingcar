package carGame.service;

import carGame.domain.Car;
import carGame.exception.LengthLimitException;

public class CarsFactory {
    public static Car[] carCreate() throws LengthLimitException {
        String[] carNames = CarNameCreate.enterCarName();
        Car[] cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
        return cars;
    }


}
