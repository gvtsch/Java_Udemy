import java.util.Arrays;

public class HelloWorld {
    public static void sum(int[][] arr) {
        int summe = 0;
        for (int[] a: arr) {
            for (int b : a) {
                summe += b;
            }
        }
        System.out.println(summe);
    }

    public static void main(String[] args) {
        int[][] a = {{4, 2}, {9, 5, 2}, {1}};
        sum(a);
    }
}
