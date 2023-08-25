import java.util.Arrays;

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
        c1.numberOfCars = 1;

        Car c2 = new Car("Fiat");
        c2.drive();

        System.out.println(c1.numberOfCars);
        System.out.println(c2.numberOfCars);
        
    }
}
