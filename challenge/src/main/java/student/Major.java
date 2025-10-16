package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    //public static Major cs = new Major("23",) ;


    public Major() {
        this.id = nextId++ ;
        this.code = "23";
        this.name = "Computer science";
        this.studentCount = 0;
        students = new Student[10] ;
    }

    public Major(String code, String name) {
        this.id = nextId++ ;
        this.code = code;
        this.name = name;
        this.studentCount = 0;
        students = new Student[10] ;
    }


    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount<50){
            if (students.length == studentCount){
                Student[] newStudents = new Student[students.length *  2] ;
                for (int i=0; i<students.length; i++){
                    newStudents[i] = students[i];
                }
                students = newStudents ;
            }
            students[studentCount] = s ;
            studentCount ++ ;
        }

    }

    // Getters
    public int getId(){
        return id ;
    }
    public String getCode() {
        return code;
    }
    public String getName(){
        return name ;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name){
        this.name = name ;
    }


    @Override
    public String toString(){
        return "Major= code: " + this.code+ ", name: "+ this.name+ ", effectif: " + this.studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the "+ name +" major is:");
        for (int i = 0; i < studentCount ; i++){
            System.out.println((i+1)+". " +students[i]);
        }
    }


}
