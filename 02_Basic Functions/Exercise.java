import java.util.Scanner;

public class Exercise {

    public static void welcome() {
        String firstName;
        String lastName;
        
        // Hier Scanner erzeugen
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte gebe deinen Vornamen ein:");
        firstName = input.next();// Hier Vornamen einlesen!
        
        System.out.println("Bitte gebe deinen Nachnamen ein:");
        lastName = input.next(); // Hier Nachnamen einlesen!
        
        // Hier Willkommens-Nachricht ausgeben.
        // Beispielsweise soll für Max Mustermann ausgegeben werden: 
        // Welcome, Max Mustermann
        System.out.println("Welcome, " + firstName + " " + lastName);
        
    }
}