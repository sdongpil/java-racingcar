package CarGameTest;

import org.junit.jupiter.api.Assertions;

import java.util.*;

public class Test {

    @org.junit.jupiter.api.Test
    void test() {
        Random random = new Random();

//        int num = 4;
//
//        Car ray = new Car("ray");
//        Car sonata = new Car("sonata");
//        Car morning = new Car("morning");
//
//        ray.bar = move(random, num);
//        sonata.bar = move(random, num);
//        morning.bar = move(random, num);
//
//
//        Map<Car, Integer> map = new HashMap();
//        map.put(ray, ray.bar.length());
//        map.put(sonata, sonata.bar.length());
//        map.put(morning, morning.bar.length());

//        List<Map.Entry<Car, Integer>> list = new LinkedList<>(map.entrySet());
//        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>((Collection<? extends Map.Entry<String, Integer>>) map.entrySet());


//        list.sort(Map.Entry.comparingByValue());

//        System.out.println(list.get(list.size() - 1));

//        for (Map.Entry<Car, Integer> car1IntegerEntry : list) {
//            System.out.println(car1IntegerEntry.getValue());
//        }
    }

//    @org.junit.jupiter.api.Test
//    void 자동차이름정하기() {
//        Car car = new Car();
//        Assertions.assertEquals("ray2",car.getName());
//    }
//    @org.junit.jupiter.api.Test
//    void 자동차이름은_5글자_이하다() {
//        Car car = new Car();
//        Assertions.assertEquals(4,car.getName().length());
//    }


    private static String move(Random random, int num) {
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
