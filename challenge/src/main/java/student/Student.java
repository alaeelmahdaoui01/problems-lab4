package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){super();}  // ??
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom,telephone , email);
        this.cne = cne ;
        this.major = major ;
        this.major.addStudent(this);
    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom,telephone , email);
        this.cne = cne  ;
    }

    // Getters
    public String getCne() {
        return cne;
    }
    public Major getMajor(){
        return major ;
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }


    public void setMajor(Major major){
        if (this.major != null && this.major != major){
            this.major.removeStudent(cne) ;
        }
        this.major = major  ;
        this.major.addStudent(this);

    }



    public StringBuilder getFullNameFormatted(){
        StringBuilder fullname = new StringBuilder(firstName.toUpperCase() + ", "+ secondName);
        return fullname ;
    }

    @Override
    public String toString(){
        return this.cne+ " "+ getFullNameFormatted() ;
    }



}

