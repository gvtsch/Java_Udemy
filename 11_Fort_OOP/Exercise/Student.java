package Exercise;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age < o.getAge()) { return 1;}
        else if (this.age == o.getAge()) { return 0;}
        else { return -1;}

        /* Alternativ:
         * return -Integer.valueOf(this.age).compareTo(o.getAge());
         */
    }
    
}
