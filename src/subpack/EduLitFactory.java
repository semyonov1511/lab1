

package subpack;
import Rooms.Archive;

public class EduLitFactory {
    public Literature createBook(String which, int i, int j){
        switch (which) {
            case "�������" -> {
                return new RuEduLit("", Archive.getInstance().returnRuDisciplines().get(i)[0], "�������", 
                        Archive.getInstance().returnTypes()[j]);
            }
            case "Textbook" -> {
                return new EnEduLit("�������", Archive.getInstance().returnEnDisciplines()[i], "english", Archive.getInstance().returnLevels()[j],
                        Archive.getInstance().returnAuthors()[i], Archive.getInstance().returnUniversities()[i]);
            }
            default -> {
                return null;
            }
        }
    }
}
    