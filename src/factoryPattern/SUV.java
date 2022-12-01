package factoryPattern;

public class SUV implements Car{

    String color;

    public SUV(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;

    }

    @Override
    public String getType() {
        return "SUV";

    }
}
