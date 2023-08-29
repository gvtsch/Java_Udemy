package Exercise;
import java.util.Arrays;

public class HelloWorld {

    public static void run() {
        Student[] s = new Student[4];
        s[0] = new Student("Tanja", 25);
        s[1] = new Student("Max", 30);
        s[2] = new Student("Erik", 20);
        s[3] = new Student("Monika", 40);

        Arrays.sort(s);

        for (Student student : s) {
            System.out.println(student.getName());
        }
    }

    public static void main(String[] args) {
        run();
    }
    
}
