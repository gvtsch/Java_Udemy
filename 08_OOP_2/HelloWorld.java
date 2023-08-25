import java.util.Arrays;

import car.Car;
import car.CarWorkshop;

public class HelloWorld {

    public static void main(String[] args) {

        MathHelper h = new MathHelper();

        System.out.println(h.min(123, 321));
        System.out.println(h.min(5.5, 6.5));

        System.out.println(Math.min(123, 321));
        System.out.println(Math.min(5.5, 6.5));

        System.out.println(MathHelper.min_static(6.5, 5.5));
        
        /* Autos */
        Car c1 = new Car("BMW", 250);
        c1.drive();
        
        Car c2 = new Car("Fiat");
        c2.drive();

        // c2.prepareForDrive();

        c1.numberOfCars = 1;
        System.out.println(c1.numberOfCars);
        System.out.println(c2.numberOfCars);

        /** Singleton-Pattern: Workshop */
        CarWorkshop a = CarWorkshop.getInstance();
        
    }
}
