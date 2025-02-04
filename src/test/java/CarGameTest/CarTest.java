package CarGameTest;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {


    @org.junit.jupiter.api.Test
    void 자동차이름_5글자_이하_아닐시_예외발생() {
        String[] carNames = {"123456"};
        assertThrows(LengthLimitException.class, () -> {
            GameStart.limitTheNumberOfCharacters(carNames);
        });
    }

    @org.junit.jupiter.api.Test
    @DisplayName("자동차 생성하기")
    void carCreate()  {
        Car[] cars = getCars();
        assertEquals(3,cars.length);
    }

    @org.junit.jupiter.api.Test
    void gameStart() {
        CarGameTest.Car[] cars = getCars();
        GameStart.gameStart(5,cars);
        assertEquals(false,cars[0].getBar().isEmpty());
    }

    @org.junit.jupiter.api.Test
    void sortInDescendingOrder() {
        CarGameTest.Car[] cars = getCars();
        GameStart.gameStart(5,cars);
        GameStart.sortInDescendingOrder(cars);
        assertEquals(true,cars[0].getBar().length() >= cars[1].getBar().length());
    }

    private CarGameTest.Car[] getCars() {
        String[] carNames = {"car1", "car2", "car3"};
        CarGameTest.Car[] cars = GameStart.carCreate(carNames);
        return cars;
    }







}
