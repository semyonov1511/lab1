/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
