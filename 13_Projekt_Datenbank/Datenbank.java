import wahlschwabe.FileStudentDatabase;
import wahlschwabe.StudentDatabase;
import wahlschwabe.StudentDatabaseException;

public class Datenbank {
    public static void main(String[] args) throws Exception {
        StudentDatabase sd = new FileStudentDatabase();

        try {
            sd.addStudent("Marla");
            String[] students = sd.readAllStudents();
            for (String student : students) {
                System.out.println(student);
            }
        } catch (StudentDatabaseException e) {
            System.out.println("Es ist ein Fehler aufgetreten.");
            e.printStackTrace();
        }
    }
}
