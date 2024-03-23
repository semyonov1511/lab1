/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subpack;

/**
 *
 * @author semyo
 */
public abstract class Literature {
    public String name;
    public String language;
    
    public Literature(String name, String language){
        this.name = name;
        this.language = language;
    }
    
    public String getName() {
        return this.name;
    }
    
}
