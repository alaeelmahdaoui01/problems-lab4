package student;

public class Test {
    public static void main(String[] args) {
        Major art = new Major("20","Art");
        Major med = new Major("21","Medical sciences");
        Major agr = new Major("22", "Agriculture");
        Major cs = new Major() ;

        Student s1 = new Student("SAFI", "Amal","123","@", "22885676", cs);
        Student s2 = new Student("ALAMI", "Samir","123","@", "23585976", cs);
        Student s3 = new Student("ALAMI", "Samir","123","@", "23585976");
        // Display computer science students
        cs.displayStudents();

    }
}

