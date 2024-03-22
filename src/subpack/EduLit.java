/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subpack;

/**
 *
 * @author semyo
 */
public class EduLit extends Literature{
    
    public String subject;
    
    public EduLit(String name, String subject, String language) {
        super(name, language);
        this.subject = subject;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
}
