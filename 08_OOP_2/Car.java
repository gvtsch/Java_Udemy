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

    public void drive(){
        System.out.println("Ein " + this.brand + " fährt mit " + this.hp + " PS.");
    }

    /* public static void drive() {
        System.out.println("drive()");
    } */
}
