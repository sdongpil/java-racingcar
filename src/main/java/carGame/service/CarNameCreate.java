package carGame.service;

import carGame.exception.LengthLimitException;

import java.util.Scanner;

public class CarNameCreate {
    public static String[] enterCarName() throws LengthLimitException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] carNames = getNameInput();
        for (String carName : carNames) {
            System.out.print(carName + ",");
        }
        System.out.println();
        limitNameLength(carNames);
        return carNames;
    }

    private static String[] getNameInput() {
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.next();
        String[] split = carName.split(",");
        return split;
    }

    private static void limitNameLength(String[] split) throws LengthLimitException {
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() >= 6) {
                throw new LengthLimitException("5글자 이하로 하시오");
            }
        }
    }
}
