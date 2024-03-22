
package subpack;

public class RuEduLit extends EduLit{
    
    public String type;
    
    public RuEduLit(String name, String subject, String language, String type) {
        super(name, subject, language);
        this.type = type;
        this.name = this.type + " по дисциплине" + " " + this.subject;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
}
