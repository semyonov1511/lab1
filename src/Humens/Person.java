
package Humens;

public abstract class Person {
    public String firstName;
    public String lastName;
    
    public Person(String firstName, String lastName){
        if (firstName == "����"){
            this.firstName = firstName;
            this.lastName = lastName+'�';
        }
        else { firstName = firstName.substring(0, firstName.length() - 1);
        this.firstName = firstName;
        if ((firstName.charAt(firstName.length()-1)=='�' & !"����".equals(firstName)) | (firstName.charAt(firstName.length()-1)=='�' & !"������".equals(firstName))){
            this.lastName = lastName+'�';
        }
        else{
            this.lastName = lastName;
        }
        }
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
}
