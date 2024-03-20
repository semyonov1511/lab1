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
    
    String university;
    String subject;
    String author;
    
    public EduLit(String name, String subject, String language, String level, String author, String university) {
        super(name, language);
        this.university = university;
        this.subject = subject;
        this.author = author;
    }
}
