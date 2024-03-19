/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subpack;

/**
 *
 * @author semyo
 */
public class Accountant {
    private PersonBuilder personBuilder;
    
    public void setPersonBuilder(PersonBuilder pb){ personBuilder = pb;}
    
    public Person getPerson() {return personBuilder.getPerson(); }
    
}
