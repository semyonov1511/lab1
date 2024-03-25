
package FicLit;

public class Accountant {

    private FicLitBuilder Builder;

    public void setBuilder(FicLitBuilder bldr) {
        Builder = bldr;
    }

    public FicLit getBook() {
        return Builder.getBook();
    }
    
    public void constructBook(String name){
        Builder.createNewBook();
        Builder.buildName(name);
        Builder.buildLanguage();
        Builder.buildGenre();
    }

}
