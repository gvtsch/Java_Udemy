import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class DateinEinlesen {
    
    public static void main(String[] args) {
        /* ***a
        BufferedReader b = null; */
        try (BufferedReader b = new BufferedReader(new FileReader("test.txt"))) { // ***a
            

            while(b.ready()){
                String line = b.readLine();
                System.out.println(line);
            }

            /* ***b
            char[] output = new char[5];
            r.read(output);
            System.out.println(output);
            r.read(output);
            System.out.println(output); 
            Diese Methode ist sehr umständlich. Einfacer geht es mit einem buffered Reader. */
            
        } catch (FileNotFoundException e) {
            System.out.println("Beim ÖFfnen der Datei ist ein Fehler aufgetreten.");
        } catch(IOException e) {
            System.out.println("Beim Auslesen der Datei ist ein Fehler aufgetreten.");
        } 
        /* ***a
        finally {
            try {
                if (b != null) {
                    b.close();
                } 
            } catch (IOException e2) {};
        } 
        a ist eine alte Variante. Mit neueren Java Versionen geht es deutlich eleganter. */
    }
}
