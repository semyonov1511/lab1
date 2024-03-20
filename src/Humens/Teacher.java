
package Humens;

public class Teacher extends Person{
    
    public String middleName;
    
    public Teacher(String firstName, String lastName, String middleName){
        super(firstName,lastName);
        this.middleName = middleName;
    }
}
