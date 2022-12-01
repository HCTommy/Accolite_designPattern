package factoryPattern;

public class Sedan implements Car{
    String color;

    public Sedan(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getType() {
       return "SEDAN";
    }
}
