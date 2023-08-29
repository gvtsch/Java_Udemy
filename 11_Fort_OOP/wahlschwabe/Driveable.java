package wahlschwabe;

public abstract class Driveable {
    
    abstract public void drive();
    public void driveToBerlin() {
        for (int x = 0; x < 10; x++) {
            drive();
        }
    }
}
