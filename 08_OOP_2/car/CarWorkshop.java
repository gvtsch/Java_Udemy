import car.CarWorkshop;

package car;
public class CarWorkshop {
    
    private static CarWorkshop instance;

    private CarWorkShop() {
        /* Konstruktor CarWorkshop b = new Car... so nicht mehr möglich */
    }

    public static CarWorkshop getInstance() {
        if (instance == null) {
            instance = new CarWorkshop();
        }
        return instance;
    }
}
