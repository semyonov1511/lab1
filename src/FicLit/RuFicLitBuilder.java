/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicLit;

/**
 *
 * @author semyo
 */
public class RuFicLitBuilder extends FicLitBuilder {

    @Override
    public void buildName() {
        book.setName("�������������� ����������");
    }

    @Override
    public void buildLanguage() {
        book.setLanguage("�������");
    }

    @Override
    public void buildGenre() {
        book.setGenre("����������");
    }
}
