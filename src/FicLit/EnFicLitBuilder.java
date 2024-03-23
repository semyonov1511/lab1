/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicLit;

/**
 *
 * @author semyo
 */
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
