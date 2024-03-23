/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicLit;

import subpack.Literature;

public class FicLit extends Literature {

    public String genre;

    public FicLit(String name, String language, String genre) {
        super(name, language);
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public String getName(){
        return this.name + ", язык - " + this.language +", жанр - " + this.genre;
    }

}
