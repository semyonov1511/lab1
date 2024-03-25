
package FicLit;

public class RuFicLitBuilder extends FicLitBuilder {

    @Override
    public void buildName(String name) {
        book.setName(name);
    }

    @Override
    public void buildLanguage() {
        book.setLanguage("Русский");
    }

    @Override
    public void buildGenre() {
        book.setGenre("Художественная литература");
    }
}
