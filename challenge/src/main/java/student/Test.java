package student;

public class Test {
    public static void main(String[] args) {
        Major art = new Major("20","Art");
        Major med = new Major("21","Medical sciences");
        Major agr = new Major("22", "Agriculture");
        Major cs = new Major() ;
        Major eng = new Major("24", "Engineering");

        // cs students
        Student s1 = new Student("SAFI", "Amal","212","@", "22885676", cs);
        Student s2 = new Student("ALAMI", "Samir","212","@", "23585976", cs);
        Student s3 = new Student("LACHGAR", "Lilia","33","@", "23585977");
        cs.addStudent(s3);

        // diff major students
        Student s4 = new Student("SNISSI", "Assia","212","@", "22885679", art);
        Student s5 = new Student("Amhali", "Farah","212","@", "23585978", med);
        Student s6 = new Student("Lekbiri", "Khadija","212","@", "23585980", agr);


        // Display computer science students
        cs.displayStudents();

        // we remove a student from cs and see the list again of cs students again
        cs.removeStudent("23585976");
        cs.displayStudents();

        // if we set the student s5's major to be cs (s5's major was previously med)
        // we notice that the med students list is now empty and s5 is no longer a med student
        // when we display the cs students list, s5 is now part of them
        s5.setMajor(cs);
        cs.displayStudents();
        System.out.println( med.getStudentCount()) ;


        art.displayStudents();
        agr.addStudent(s4);
        agr.displayStudents();
        art.displayStudents();

        // we check the getOccupiedRate method in majors
        cs.getOccupiedRate();
        art.getOccupiedRate();
        med.getOccupiedRate();
        agr.getOccupiedRate();

        // checking the getStudentListAsString() method
        System.out.println(cs.getStudentListAsString());
    }
}

