import java.util.Scanner;
import java.nio.file.Paths;

public class Faust {
    public static void main(String[] args) throws Exception {
        String file = "F:\\Java_Udemy\\04_Schleifen\\faust.txt";

        Scanner input = new Scanner(Paths.get(file));

        int cnt_I = 0;
        int cnt_U = 0;
        while (input.hasNext()) {
            String word = input.next();
            word = word.toLowerCase();
            if (word.equals("ich")) {
                cnt_I ++;
            }
            if (word.equals("du")) {
                cnt_U ++;
            }
        }
        System.out.println("Ich: " + cnt_I);
        System.out.println("Du: " + cnt_U);
    }
}
