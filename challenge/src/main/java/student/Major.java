package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;


    public Major() {
        this.id = nextId++ ;
        this.code = "23";
        this.name = "Computer science";
        this.studentCount = 0;
        students = new Student[50] ;
    }

    public Major(String code, String name) {
        this.id = nextId++ ;
        this.code = code;
        this.name = name;
        this.studentCount = 0;
        students = new Student[50] ;
    }


    // Method to add a student
    public void addStudent(Student s) {
        if (s.getMajor() != null && s.getMajor() != this){
            s.getMajor().removeStudent(s.getCne()) ;
        }
        if (studentCount<50){
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
        return "Major= code: " + this.code+ ", name: "+ this.name+ ", number of students: " + this.studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the "+ name +" major is:");
        for (int i = 0; i < studentCount ; i++){
            System.out.println((i+1)+". " +students[i]);
        }
    }

    public Student findStudentByCNE(String cne){

        for (int i=0; i<studentCount; i++){
            if (students[i].getCne() == cne){
                return students[i];
            }
        }
        return null ;
    }

    public int getStudentCount(){
        return studentCount ;
    }

    public boolean removeStudent(String cne){
        Student student  = findStudentByCNE(cne);

        if (student != null){
            int indexFound = -1 ;
            for (int i=0 ; i<studentCount; i++){
                if (students[i] == student ){
                    indexFound = i ;
                }
            }

            for (int i=indexFound ; i<studentCount-1; i++){
                students[i] = students[i+1];
            }
            studentCount -- ;
            students[studentCount] = null ;
            return true ;
        }
        return false ;

    }


    public void getOccupiedRate(){
        System.out.println(this.name + " capacity: 50 students" );
        System.out.println("Current enrollment: " + studentCount + " students");
        double rate = ((double) studentCount/50)*100 ;
        System.out.println("Occupancy rate= " + rate+ "%" );
    }

    public StringBuilder getStudentListAsString(){
        StringBuilder studentsString = new StringBuilder("Students in this major: ") ;
        for (int i=0; i<studentCount; i++){
            studentsString.append("\n");
            studentsString.append(students[i].getFullNameFormatted());
        }
        return studentsString ;
    }

}
