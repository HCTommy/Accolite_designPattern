package factoryPattern;

public class CarFactory {
    public Car getCar(String type,String color){
        if (type.equals("SUV")){
            return new SUV(color);
        }else if (type.equals("Sedan")){
            return new Sedan(color);
        }
        return null;
    }
}
