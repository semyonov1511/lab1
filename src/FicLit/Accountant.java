package FicLit;

public class Accountant {

    private FicLitBuilder Builder;

    public void setBuilder(FicLitBuilder bldr) {
        Builder = bldr;
    }

    public FicLit getBook() {
        return Builder.getBook();
    }
    
    public void constructBook(){
        Builder.createNewBook();
        Builder.buildName();
        Builder.buildLanguage();
        Builder.buildGenre();
    }

}
