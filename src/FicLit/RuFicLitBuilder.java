
package FicLit;

public class RuFicLitBuilder extends FicLitBuilder {

    @Override
    public void buildName() {
        book.setName("Художественная литература");
    }

    @Override
    public void buildLanguage() {
        book.setLanguage("Русский");
    }

    @Override
    public void buildGenre() {
        book.setGenre("Фантастика");
    }
}
