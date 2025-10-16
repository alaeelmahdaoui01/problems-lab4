package instructor;

import student.Student;

public class Subject {
    private static int nextId = 1;
    private int id;
    private String code;
    private String title;
    private Instructor instructor ;





    public Subject() {
        this.id = nextId++ ;
        this.code = "23";
        this.title = "Artificial Intelligence";
    }

    public Subject(String code, String name,Instructor instructor) {
        this.id = nextId++ ;
        this.code = code;
        this.title = name;
        this.instructor = instructor ;
    }


    // Getters
    public int getId(){
        return id ;
    }
    public String getCode() {
        code = normalizedCode();
        return code;
    }
    public String getTitle(){
        title = properTitle();
        return title ;
    }


    // Setters
    public void setCode(String code) {
        this.code = code;
    }
    public void setTitle(String title){
        this.title = title ;
    }



    @Override
    public String toString(){
        return "Subject= code: " + this.code+ ", title: "+ this.title + ", instructor: "+ instructor.getFullNameFormatted();
    }

    public String normalizedCode(){
        return code.trim().toUpperCase();
    }

    public String properTitle(){
        if (title == null){
            return null ;
        }
        StringBuilder titleCleaned = new StringBuilder() ;
        String[] titleWords = title.trim().split(" ");
        for (String word : titleWords){
            titleCleaned.append(Character.toUpperCase(word.charAt(0)));
            for (int i=1 ; i<word.length();i++){
                titleCleaned.append(Character.toLowerCase(word.charAt(i)));
            }
            titleCleaned.append(" ");
        }
        title = titleCleaned.toString().trim();
        return title ;
    }

    public boolean isIntroCourse(){
        code = normalizedCode();
        String[] codeWords = code.split("-");
        if (codeWords[0]== "INTRO"){
            return true;
        }

        title = properTitle();
        if (title.toLowerCase().contains("intro")){
            return true;
        }

        return false ;

    }

}
