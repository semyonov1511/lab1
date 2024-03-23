
package subpack;

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
