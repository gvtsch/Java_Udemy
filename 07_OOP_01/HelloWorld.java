import java.util.Arrays;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        Player p1 = new Player();
        p1.name = "Erik";
        p1.numberOfCards = 12;

        Player p2 = new Player();
        p2.name = "Monika";
        p2.numberOfCards = 13;

        p1.printPlayerInfo();
        p2.printPlayerInfo();    
        
    }
}
