
package subpack;

public class EnEduLit extends EduLit{
    
    public String university;
    public String author;
    public String level;
    
    public EnEduLit(String name, String subject, String language, String level, String author, String university) {
        super(name, subject, language);
        this.level = level;
        this.level = level;
        this.university = university;
        this.author = author;
        this.name = this.name + " �� ���������� " + this.subject + ", ������� - " + this.level + ", ����� - " + this.author + ", ����������� - " + this.university;
    }
    
}
