import java.util.Arrays;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        Player p1 = new Player("Erik", 11);
        Player p2 = new Player("Monika", 13);        

        p1.printPlayerInfo();
        p1.setName("Max");
        p1.printPlayerInfo();    
        System.out.println(p1.getNumberOfCards());

    }
}
