import car.CarWorkshop;
import car.Car;

public class Packages {
    public static void main(String[] args) {
        CarWorkshop a = CarWorkshop.getInstance();
        CarWorkshop b = CarWorkshop.getInstance();

        Car c = new Car("Audi");
    }    
}
