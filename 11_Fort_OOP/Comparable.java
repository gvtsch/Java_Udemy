import wahlschwabe.Car;
import java.util.Arrays;

public class Comparable {
    
    public static void main(String[] args) {

        String[] strs = {"Hallo", "ABC", "X", "A"};
        Arrays.sort(strs);
        for(String s: strs) {
            System.out.println(s);
        }

        Car[] cars = new Car[6];
        cars[0] = new Car("XYZ", 150);
        cars[1] = new Car("DEF", 200);
        cars[2] = new Car("ABC", 50);
        cars[3] = new Car("ABC", 33);
        cars[4] = new Car("DEF", 300);
        cars[5] = new Car("XYZ", 200);

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
