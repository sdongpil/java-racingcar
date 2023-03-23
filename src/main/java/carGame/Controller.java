package carGame;


import carGame.domain.Car;
import carGame.exception.LengthLimitException;
import carGame.service.CarGameStart;
import carGame.service.CarsCreate;
import carGame.service.GameCycle;
import carGame.service.OutputOfTheWinner;

public class Controller {

    public static void main(String[] args) throws LengthLimitException {
        //자동차 이름 입력받기
        Car[] cars = CarsCreate.carCreate();

        //게임 시도 횟수 정하기
        int numberOfGameAttempts = GameCycle.getNumberOfGameAttempts();

        //경주 시작
        CarGameStart.gameStart(numberOfGameAttempts, cars);

        //우승자 출력
        OutputOfTheWinner.printTheWinner(cars);
    }
}

