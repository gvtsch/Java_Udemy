import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hallo";
        greeting += " Welt";
        greeting = greeting.concat("!");
        System.out.println(greeting);
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.substring(6,10));
        System.out.println(greeting.charAt(1));

        Scanner input = new Scanner(System.in);
        float  a = input.nextFloat();
        System.out.println(a * a);

        System.out.println(input.next());
    }
}
