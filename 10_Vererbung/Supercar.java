

public class Supercar extends Car {

    private int numberOfZylinder;

    /* Wenn die vererbende Klasse einen Konstruktor hat, muss
     * die erbende Klasse auch einen haben. Dieser wiederum, 
     * muss zuerst den Konstruktor der vererbenden Klasse aufrufen. */
    public Supercar(String brand, int numberOfZylinder) {
        super(brand);
        this.numberOfZylinder = numberOfZylinder;
    }

    public void m(String brand, int numberOfZylinder) {
        super.m(brand);
        this.numberOfZylinder = numberOfZylinder;
    }

    @Override /* Im Grunde nur ein Hinweis, schreibt aber fest, 
    * dass wir diese Methode nehmen, andernfalls könnte Java auf
    * die vererbende Klasse/Methode zurückgreifen, falls man bspw. 
    * Parameter in den Funktionsaufrauf aufnimmt. */
    public void drive() {
        System.out.println("superdrive() mit " + this.numberOfZylinder + " Zylindern!");
    }
}
