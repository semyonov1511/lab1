
package subpack;

public class EduLitFactory {
    public Literature createBook(String name, String subject, String language, String type){
        return new RuEduLit(name, subject, language, type);
    }
    public Literature createBook(String name, String subject, String language, String level, String author, String university){
        return new EnEduLit(name, subject, language, level, author, university);
    }
}
    