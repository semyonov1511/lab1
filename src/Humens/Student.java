package Humens;

import java.util.ArrayList;
import subpack.Literature;

public class Student extends Person {

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getFullName() {
        return this.lastName + " " +  this.firstName;
    }
}
