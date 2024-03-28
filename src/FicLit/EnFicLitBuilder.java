
package FicLit;

import Rooms.Archive;
import java.util.ArrayList;

public class EnFicLitBuilder extends FicLitBuilder {

    @Override
    public void buildName(String name) {
        book.setName(name);
    }

    @Override
    public void buildLanguage() {
        book.setLanguage("English");
    }
    
}
