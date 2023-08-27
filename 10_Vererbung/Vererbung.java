public class Vererbung {

    public static Car createNewCar() {
        return new Car();
    }

    public static void main(String[] args) {
        
        Car c = new Car();
        c.drive();

        Supercar s = new Supercar();
        s.drive();
        s.drive();

        Car m = new Supercar();
        m.drive();
        // m.superdrive(); funktioniert nicht

        Car n = createNewCar();
        n.drive();

        if (n instanceof Supercar) {
            Supercar s2 = (Supercar) n;
            s2.drive();
        }

    }
}