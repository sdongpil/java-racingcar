package carGame.service;

import carGame.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class OutputOfTheWinner {


    public static void printTheWinner(Car[] carArray) {
        sortInDescendingOrder(carArray);
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < carArray.length - 1; i++) {
            if (carArray[0].getBar().length() == carArray[i + 1].getBar().length()) {
                carList.add(carArray[i + 1]);
            }
        }
        carList.add(carArray[0]);
        doubleWinner(carList);
        System.out.println("가 최종우승 했습니다");
    }

    private static void doubleWinner(List<Car> carList) {
        for (Car car : carList) {
            System.out.print(car.getName());
            if (carList.size() > 1) {
                System.out.print(",");
            }
        }
    }

    private static void sortInDescendingOrder(Car[] carArray) {
        for (int i = 0; i < carArray.length; i++) {
            for (int j = 0; j < carArray.length; j++) {
                if (carArray[i].getBar().length() > carArray[j].getBar().length()) {
                    Car temp = carArray[i];
                    carArray[i] = carArray[j];
                    carArray[j] = temp;
                }
            }
        }
    }


}
