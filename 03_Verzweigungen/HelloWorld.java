import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        if (x >= 10) {
            System.out.println("x ist größer als oder gleich 10!");
        } 
        else if (x > 5) {
            System.out.println("x ist größer als 5!");
        }
        else {
            System.out.println("x ist kleiner als 10!");
        }

        int y = input.nextInt();
        switch(y) {
            case 11:
            case 10:
                System.out.println("Y ist 10 oder 11");
                break;
            case 9:
                System.out.println("Y ist 9");
                break;
            default:
                System.out.println("Default");
        }
        System.out.println("Fertig!");
    }
}
