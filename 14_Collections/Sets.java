import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        /* In einem TreeSet werden die Einträge sortiert 
         * TreeSet<String> ...
         * Allgemeiner wird es mit Set (einem Interface)
         * Set<String> ...
        */
        students.add("Monika");
        students.add("Marla");
        students.add("Erik");
        students.add("Paul");
        students.add("Marla");

        for(String student : students) {
            System.out.println(student);
        }

        if (students.contains("Marla")) {
            System.out.println("If Abfrage erreicht.");
        }
    }
}
