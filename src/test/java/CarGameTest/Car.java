package CarGameTest;

public class Car {


    private String name;
    private String bar = "";

    private int count;


    public Car(String s) {
        this.name = s;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar += bar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
