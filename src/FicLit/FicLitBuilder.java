
package FicLit;

public abstract class FicLitBuilder {

    protected FicLit book;

    public FicLit getBook() {
        return book;
    }

    public void createNewBook() {
        book = new FicLit("", "", "");
    }
    
    public abstract void buildName();
    public abstract void buildLanguage();
    public abstract void buildGenre();
    
}
