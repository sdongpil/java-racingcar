package carGame.domain;

public class Car {


    private String name;
    private String bar = "";

    private int count =0 ;

    public void setCount(int count) {
        this.count += count;
    }


    public Car(String s) {
        this.name = s;
    }

    public void setBar(String bar) {
        this.bar += bar;
    }

    public String getBar() {
        return bar;
    }

    public String getName() {
        return name;
    }

}
