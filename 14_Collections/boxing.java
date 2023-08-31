import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class boxing {
    
    public static void main(String[] args) {

        Set<Integer> scores = new TreeSet<>();
        /* Primitive Datentypen wie ints, bools, usw. - auf denen die Programme aufbauen -
         * darf/kann man nicht in Sets verwenden. Dafür sind nur Objekte geeignet.
         * An der Stelle kommt das "Boxing" ins Spiel:
         * int --> Integer
         * long --> Long
         * usw.
         */
        scores.add(5);
        scores.add(0); 

        for (int x : scores) {
            System.out.println(x);
        }
    }
}
