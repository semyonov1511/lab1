
package Humens;

public class PersonFactory {
    public Person createPerson(String firstName, String lastName){
        return new Student(firstName,lastName);
    }
    
    public Person createPerson(String firstName, String lastName, String middleName){
        return new Teacher(firstName,lastName,middleName);
    }
    
}
