package car;
public class Car {

    public static int numberOfCars;
    private String brand;
    private int hp;

    Car(String brand, int hp){
        this.brand = brand;
        this.hp = hp;
    }

    Car(String brand) {
        this.brand = brand;
        this.hp = 150;
    }

    private void prepareForDrive() {
        System.out.println("prepareForDrive");
    }

    public void drive(){
        prepareForDrive();
        System.out.println("Ein " + this.brand + " fährt mit " + this.hp + " PS.");
    }

    /* public static void drive() {
        System.out.println("drive()");
    } */
}
