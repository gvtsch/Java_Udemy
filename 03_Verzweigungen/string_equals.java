import java.util.Scanner;

public class string_equals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();

        if (x == "Welt") {
            System.out.println("Hallo WELT");
        }
        else if (x.equals("Welt")) {
            System.out.println("Hallo Welt");
        }

        System.out.println("Fertig!");
    }
    
}
