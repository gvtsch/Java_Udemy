import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Listen {
    
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            String s = input.next();
            students.add(s);
            System.out.println("Bisher wurden " + students.size() + " Studenten erfasst.");
        }
        students.add("Marius");
        students.remove("Erik");
        students.remove(0);
        // students.clear();
        students.add("Anton");
        
        Collections.sort(students);

        for (String student : students) {
            System.out.println(student);
        }
    }
}
