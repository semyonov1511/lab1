

package subpack;
import Rooms.Archive;

public class EduLitFactory {
    public Literature createBook(String which, int i, int j){
        switch (which) {
            case "Учебник" -> {
                return new RuEduLit("", Archive.getInstance().returnRuDisciplines().get(i)[0], "русский", 
                        Archive.getInstance().returnTypes()[j]);
            }
            case "Textbook" -> {
                return new EnEduLit("Учебник", Archive.getInstance().returnEnDisciplines()[i], "english", Archive.getInstance().returnLevels()[j],
                        Archive.getInstance().returnAuthors()[i], Archive.getInstance().returnUniversities()[i]);
            }
            default -> {
                return null;
            }
        }
    }
}
    