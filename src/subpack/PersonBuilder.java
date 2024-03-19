
package subpack;

abstract class PersonBuilder {
    protected Person person;
    
    public Person getPerson(){ return person; }
    public void createNewPerson() { person = new Person(); }
    
}
