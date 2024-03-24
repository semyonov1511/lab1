
package FicLit;

public class EnFicLitBuilder extends FicLitBuilder {

    @Override
    public void buildName() {
        book.setName("Fiction Literature");
    }

    @Override
    public void buildLanguage() {
        book.setLanguage("English");
    }

    @Override
    public void buildGenre() {
        book.setGenre("Fantasy");
    }
    
}
