import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String[] name = new String[10];
        name[0] = "Erik";
        name[1] = "Monika";
        name[2] = "Moritz";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        System.out.println(Arrays.toString(name));
        
        // Zweite Lektion
        Scanner input = new Scanner(System.in);

        System.out.println("Wie viele Studenten sind in deinem Studiengang?");
        int numberOfStudents = input.nextInt();

        String[] names = new String[numberOfStudents];
        System.out.println("Bitte gebe " + names.length + " Vornamen ein: ");

        for(int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        System.out.println(Arrays.toString(names));

        // Dritte Lektion
        String os[] = {"windows", "linux", "mac"};
        System.out.println(Arrays.toString(os)); 
        for (String osElement : os){ // for each Schleife
            System.out.println(osElement);
        }
    }
}
