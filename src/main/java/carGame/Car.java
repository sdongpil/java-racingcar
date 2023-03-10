package carGame;

public class Car {


    private String name;
    public String bar = "";

    public Car(String s) {
        this.name = s;
    }

    public String getBar() {
        return bar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
