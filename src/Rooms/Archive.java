
package Rooms;

import FicLit.Accountant;
import FicLit.EnFicLitBuilder;
import FicLit.FicLitBuilder;
import FicLit.RuFicLitBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import subpack.*;

public class Archive {

    ArrayList<String> RuDisciplines;
    ArrayList<String> EnDisciplines;
    String[] types = {"Учебник", "Пособие", "Задачник"};
    String[] levels = {"Бакалавриат", "Магистратура", "Аспирантура"};
    ArrayList<String> universities;
    ArrayList<String> authors;
    EduLitFactory Efactory = new EduLitFactory();
    Accountant accountant = new Accountant();
    FicLitBuilder RuBuilder = new RuFicLitBuilder();
    FicLitBuilder EnBuilder = new EnFicLitBuilder();

    public void generateBooks() {
        this.RuDisciplines = setRuDisciplines();
        this.EnDisciplines = setEnDisciplines();
        this.authors = setAuthors();
        this.universities = setUniversities();
    }

    public Literature randomBook() {
        int i = (int) (Math.random() * 11);
        int a = (int) (Math.random() * 4);
        int b = (int) (Math.random() * 3);
        switch (a) {
            case 0 -> {
                return Efactory.createBook("Учебник", returnRuDisciplines().get(i), "русский", returnTypes()[b]);
            }
            case 1 -> {
                return Efactory.createBook("Учебник", returnEnDisciplines().get(i), "english", returnLevels()[b],
                        returnAuthors().get(i), returnUniversities().get(i));
            }
            case 2 -> {
                accountant.setBuilder(RuBuilder);
                accountant.constructBook();
                return accountant.getBook();
            }
            case 3 -> {
                accountant.setBuilder(EnBuilder);
                accountant.constructBook();
                return accountant.getBook();
            }
            default -> {
                return null;
            }
        }
    }

    public String[] returnTypes() {
        return this.types;
    }

    public String[] returnLevels() {
        return this.levels;
    }

    public ArrayList<String> returnRuDisciplines() {
        return this.RuDisciplines;
    }

    public ArrayList<String> returnEnDisciplines() {
        return this.EnDisciplines;
    }

    public ArrayList<String> returnAuthors() {
        return this.authors;
    }

    public ArrayList<String> returnUniversities() {
        return this.universities;
    }

    public static ArrayList<String> setRuDisciplines() {
        ArrayList<String> RuDisciplines = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\RuDisciplines.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i < 10; i++) {
                lines[i] = lines[i].substring(0, lines[i].length() - 6);
                RuDisciplines.add(lines[i]);
            }
            lines[10] = lines[10].substring(0, lines[10].length() - 6);
            RuDisciplines.add(lines[10]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return RuDisciplines;
    }

    public static ArrayList<String> setEnDisciplines() {
        ArrayList<String> EnDisciplines = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\EnDisciplines.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i <= 10; i++) {
                lines[i] = lines[i].substring(0, lines[i].length() - 1);
                EnDisciplines.add(lines[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return EnDisciplines;
    }

    public static ArrayList<String> setAuthors() {
        ArrayList<String> Authors = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\EnDisciplines.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i <= 10; i++) {
                lines[i + 11] = lines[i + 11].substring(0, lines[i + 11].length() - 1);
                Authors.add(lines[i + 11]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Authors;
    }

    public static ArrayList<String> setUniversities() {
        ArrayList<String> universities = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\EnDisciplines.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i < 10; i++) {
                lines[i + 22] = lines[i + 22].substring(0, lines[i + 22].length() - 1);
                universities.add(lines[i + 22]);
            }
            lines[10 + 22] = lines[10 + 22].substring(0, lines[10 + 22].length() - 1);
            universities.add(lines[10 + 22]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return universities;
    }
}
