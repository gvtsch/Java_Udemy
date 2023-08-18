public class HelloWorld {
    public static void main(String[] args) {
        String g;
        g = "Hello World";
        System.out.println(g);

        long zahl = 123;
        zahl += 40/2;
        System.out.print(zahl);
        System.out.print("\nGanzzahldivision: 143/2 = ");
        System.out.print(zahl/5);
        System.out.print("\nMopdulo: 32 % 3 = ");
        System.out.print(32%3);

        double zahl_f = 0.25;
        System.out.print("\n");
        System.out.print(zahl_f);
        System.out.print("\n");
        System.out.print(5/2);
        System.out.print("\n");
        System.out.print(5.0/2);

        char letter = 'g';
        System.out.print("\n");
        System.out.print(letter);
        System.out.print("\n");
        char letters = 'g' + 'A';
        System.out.print(letters);
        System.out.print("\n");

        double a = 0.7;
        a += 0.1;
        System.out.print(a);


        boolean b;
        long l = 400;
        b = (a >= 122);
        System.out.print("\n");
        System.out.print(b);
    }
}
