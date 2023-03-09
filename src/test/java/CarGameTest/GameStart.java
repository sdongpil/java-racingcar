package CarGameTest;

import java.util.*;

public class GameStart {
    public static void main(String[] args) throws lengthLimitException {
        System.out.println("자동차 이름을 입력하시오");
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.next();
        String[] split = carName.split(",");

        Car[] car = new Car[split.length];

        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > 6) {
                throw new lengthLimitException("5글자 이하로 해라");
            }
            car[i] = new Car(split[i]);


        }

//
//        for (Car car1 : car) {
//            System.out.println(car1.getName());
//
//        }
//        System.out.println();
//        int num = 5;


//        car1.bar = move(num);
//        car2.bar = move(num);
//        car3.bar = move(num);

//
//        Map<String, Integer> map = new HashMap();
//        map.put(car1.getName(), car1.bar.length());
//        map.put(car2.getName(), car2.bar.length());
//        map.put(car3.getName(), car3.bar.length());
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getValue());

//        }

//        List<Map.Entry<Car, Integer>> list = new LinkedList<>(map.entrySet());
//        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>((Collection<? extends Map.Entry<String, Integer>>) map.entrySet());


//        list.sort(Map.Entry.comparingByValue());

//        System.out.println(list.get(list.size() - 1));

//        for (Map.Entry<Car, Integer> car1IntegerEntry : list) {
//            System.out.println(car1IntegerEntry.getValue());
//        }
    }


    private static String move(int num) {
        Random random = new Random();
        String s = "";
        for (int i = 0; i < num; i++) {
            int randomNum = random.nextInt(10);
//        System.out.println(i+"=" +randomNum);
            if (randomNum >= 4) {
                s += "-";
            }
        }
        return s;
    }


}

