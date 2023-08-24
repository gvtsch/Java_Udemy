public class Car {
    private String brand;
    private int hp;

    Car(String brand, int hp){
        this.brand = brand;
        this.hp = hp;
    }

    public void drive(){
        System.out.println("Ein " + this.brand + " fährt mit " + this.hp + " PS.");
    }
}
