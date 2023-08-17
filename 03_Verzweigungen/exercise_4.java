public class exercise_4 {
    public void main(int input) {
        // Die Variable int input existiert bereits.
        // Schreibe ein Programm, welches bei einer geraden Zahl das Wort "gerade" ausgibt,
        // bzw. bei einer ungeraden Zahl das Wort "ungerade". 
        // Die Ausgabe soll mit Hilfe eines System.out.println() erfolgen.
        
        if (input%2 == 0) {
            System.out.println("gerade");
        }
        else {
            System.out.println("ungerade");
        }
    }
}
