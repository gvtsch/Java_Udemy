package wahlschwabe;

public class Car extends Driveable implements Comparable<Car> {

    private String brand;
    private int hp;

    public Car(String brand, int hp) {
        this.brand = brand;
        this.hp = hp;
    }

    public String getBrand() {
        return brand;
    }

    public int getHp() {
        return hp;
    }

    public void drive() {
        System.out.println("Car.drive()");
    }

    @Override
    public int compareTo(Car o) {

        /* if (this.hp < o.getHp()) {
            return -1;
        } else if (this.hp == o.getHp()) {
            return 0;
        } else {
            return 1;
        } 
        So wird händisch nach HP sortiert */

        /* brand.compareTo(o.getBrand());
         Strings erfüllen das compareable Interface, weshalb
         * die Brand einfach so sortiert werden kann. */

        
        /* Integer hp = this.hp;
        return hp.compareTo(o.getHp());
         * Ints werden ebenfalls erfüllt. */

        if (hp == o.getHp()) {
            return brand.compareTo(o.getBrand());
        } else {
            return Integer.compare(hp, o.getHp());
        }
    } 

    @Override
    public String toString(){
        return brand + ": " + hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        Car other = (Car) o;

        if (brand.equals(other.getBrand()) && hp == other.getHp()) {
            return true;
        } else {
            return false;
        }
    }
}
