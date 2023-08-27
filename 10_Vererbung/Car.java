

public class Car {

    private String brand;
    /* private Variablen, sind wirklich nur innerhalb der Klasse
     * verfügbar. 
     * Auf protected Variablen kann man zumindest durch
     * z.B. erbende Klassen und innherlab des Packages zugreifen, 
     * aber nicht von außen. 
     * Public ist öffentlich sichtbar. */
    
    public Car(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("drive()");
    }

    public void m(String brand) {
        this.brand = brand;
    }
}
