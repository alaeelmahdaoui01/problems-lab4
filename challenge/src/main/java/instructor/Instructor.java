package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber ;
    private Subject subject ;

    public Instructor(){
    }

    public Instructor(String firstname , String secondname, String phone, String email , String num){
        super(firstname, secondname,phone, email) ;
        this.employeeNumber = num;
    }

    public Instructor(String firstname , String secondname, String phone, String email , String num, Subject subject){
        super(firstname, secondname,phone, email) ;
        this.employeeNumber = num;
        this.subject = subject ;
    }

    public Subject getSubject(){
        return subject;
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public void setSubject(Subject subject){
        this.subject = subject ;
    }
    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber = employeeNumber ;
    }


    public String cleanEmployeeNumber(){
        if (employeeNumber == null){
            return null;
        }
        employeeNumber = employeeNumber.trim() ;
        StringBuilder cleanedNum = new StringBuilder();
        for (int i=0 ; i<employeeNumber.length() ; i++){
            if (employeeNumber.charAt(i)!=' '){
                cleanedNum.append(employeeNumber.charAt(i));
            }
        }
        employeeNumber = cleanedNum.toString() ;
        return employeeNumber;

        // or return employeeNumber.trim().replace(" ", "") ;
    }

    public StringBuilder getFullNameFormatted(){
        StringBuilder fullname = new StringBuilder(firstName.toUpperCase() + ", "+ secondName);
        return fullname ;
    }

    public String summaryLine(){
        String summary = String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]" ,  employeeNumber, secondName, firstName);
        return summary;
    }

    public StringBuilder toCard(){
        StringBuilder card = new StringBuilder();
        card.append("Instructor");
        card.append("\n-----------");

        card.append("\nEmployee: ");
        card.append(employeeNumber);

        card.append("\nName: ");
        card.append(getFullNameFormatted());

        card.append("\nEmail: ");
        card.append(email);

        card.append("\nPhone: ");
        card.append(phone);

        return card ;
    }

    public String displayName(){
        StringBuilder fullname = new StringBuilder() ;
        if (firstName == null && secondName==null){
            return null ;
        }
        else if (firstName == null){
            fullname.append(secondName);
        }
        else if (secondName==null){
            fullname.append(firstName);
        }
        else{
            fullname.append(getFullNameFormatted());
        }
        return fullname.toString();
    }
}
