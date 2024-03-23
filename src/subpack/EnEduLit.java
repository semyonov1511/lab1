/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subpack;

/**
 *
 * @author semyo
 */
public class EnEduLit extends EduLit{
    
    public String university;
    public String author;
    public String level;
    
    public EnEduLit(String name, String subject, String language, String level, String author, String university) {
        super(name, subject, language);
        this.level = level;
        this.university = university;
        this.author = author;
        this.name = this.name + " по дисциплине " + this.subject + ", уровень - " + this.level + ", автор - " + this.author + ", университет - " + this.university;
    }
    
}
