import wahlschwabe.Car;
import wahlschwabe.CarDriveException;

public class HelloWorld {
    
    public static void main(String[] args) throws Exception {
        Car c = new Car(0);

        try {
            c.drive();
        } catch (CarDriveException e) {
            System.out.println("Drive-Methode hat nicht geklappt: " + e.getMessage());
        } /* Man kann den Fehler abfangen:
        * catch (ArithmeticException e) {
        * System.out.println("Division durch 0");
        * }
        * Aber gerade so etwas wie mathematische Fehler sollten wir nicht 
        * abfangen */
    }
}
