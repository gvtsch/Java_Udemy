import java.util.*;

public class exercise_3 {
    public void run(String input) {
        
        // Die Variable input existiert bereits. Gebe jetzt mit einem
        // System.out.println() das letzte Wort eines Strings aus.
        // Beispiel: 
        // Bei der Eingabe "Hallo Welt und Mars" soll "Mars" ausgegeben werden,
        // da "Mars" das letzte Wort im String ist. 
        System.out.println(input.substring(input.lastIndexOf(" ")+1));
    }
}
}
