package carGame.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameCycle {

    public static int getNumberOfGameAttempts() {
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
}
