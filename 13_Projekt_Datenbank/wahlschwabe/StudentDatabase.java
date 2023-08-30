package wahlschwabe;

public interface StudentDatabase {
    public String[] readAllStudents() throws Exception;
    public void addStudent(String name) throws Exception;
}
