package CarGameTest;

import org.junit.jupiter.api.DisplayName;

import java.util.*;

public class GameStart {

    public static void main(String[] args) throws LengthLimitException {
        String[] carNames = enterCarName();
        int numberOfGameAttempts = getNumberOfGameAttempts();

        Car[] cars = carCreate(carNames);

        gameStart(numberOfGameAttempts, cars);

        sortInDescendingOrder(cars);

        printTheWinner(cars);



    }

    static String[] enterCarName() throws LengthLimitException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] carNames = getNameInput();
        for (String carName : carNames) {
            System.out.print(carName + ",");
        }
        System.out.println();
        nameLimit(carNames);
        return carNames;
    }


    private static int getNumberOfGameAttempts() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        int numberOfGameAttempts = 0;
        try {
            numberOfGameAttempts = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
        System.out.println(numberOfGameAttempts);
        System.out.println();
        return numberOfGameAttempts;
    }

    static void gameStart(int numberOfGameAttempts, Car[] cars) {
        Random random = new Random();

        for (int j = 0; j < numberOfGameAttempts; j++) {
            for (int i = 0; i < cars.length; i++) {
                if (random.nextInt(10) >= 4) {
                    cars[i].bar += "-";
                }
            }
            printCars(cars);
        }


    }

    private static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " ");
            System.out.println(car.bar);
        }
        System.out.println();
    }


    @DisplayName("이름입력받기")
    private static String[] getNameInput() {
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.next();
        String[] split = carName.split(",");
        return split;
    }

    static void nameLimit(String[] split) throws LengthLimitException {
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() >= 6) {
                throw new LengthLimitException("5글자 이하로 해라");
            }
        }
    }

    static Car[] carCreate(String[] carNames) {
        Car[] cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
        return cars;
    }

    private static void printTheWinner(Car[] carArray) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < carArray.length - 1; i++) {
            if (carArray[0].bar.length() == carArray[i + 1].bar.length()) {
                carList.add(carArray[i + 1]);
            }
        }
        carList.add(carArray[0]);
        for (Car car : carList) {
            System.out.print(car.getName());
            if (carList.size() > 1) {
                System.out.print(",");
            }
        }
        System.out.println("가 최종우승 했습니다");
    }

    static void sortInDescendingOrder(Car[] carArray) {
        for (int i = 0; i < carArray.length; i++) {

            for (int j = 0; j < carArray.length; j++) {
                if (carArray[i].bar.length() > carArray[j].bar.length()) {
                    Car temp = carArray[i];
                    carArray[i] = carArray[j];
                    carArray[j] = temp;
                }
            }

        }

    }




}

