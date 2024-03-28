
package FicLit;

public abstract class FicLitBuilder {

    protected FicLit book;

    public FicLit getBook() {
        return book;
    }

    public void createNewBook() {
        book = new FicLit("", "", "");
    }
    
    public abstract void buildName(String name);
    public abstract void buildLanguage();
    public void buildGenre(){
        book.setGenre("Художественная литература");
    }
    
}
