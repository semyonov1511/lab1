/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subpack;

/**
 *
 * @author semyo
 */
public class FicLit extends Literature{
    
    String genre;
    
    public FicLit(String name, String language, String genre) {
        super(name, language);
        this.genre = genre;
    }
    
}
