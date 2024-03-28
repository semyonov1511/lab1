package Rooms;

import FicLit.Accountant;
import FicLit.EnFicLitBuilder;
import FicLit.FicLitBuilder;
import FicLit.RuFicLitBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import subpack.*;

public class Archive {

    ArrayList<String[]> RuDisciplines = CsvFileReader.readCsv("RuDisciplines.csv");
    ArrayList<String[]> En = CsvFileReader.readCsv("EnDisciplines.csv");
    String[] EnDisciplines = setList(En,"disciplines");
    String[] authors = setList(En,"authors");
    String[] universities = setList(En,"universities");
    String[] types = {"Учебник", "Пособие", "Задачник"};
    String[] levels = {"Бакалавриат", "Магистратура", "Аспирантура"};
    String[] RuFicList = {"Муму", "Преступление и наказание", "Мастер и Маргарита", "Обломов", "Война и мир", "Герой нашего времени", "Мертвые души",
        "Анна Каренина", "Горе от ума", "Собачье сердце"};
    String[] EnFicList = {"Le Petit Prince", "1984", "Harry Potter", "The Picture of Dorian Gray", "Drei Kameraden", "Alice in Wonderland", "Fahrenheit 451",
        "Les trois mousquetaires", "Romeo and Juliet", "The Old Man and the Sea"};
    
    ArrayList<Literature> list;
    EduLitFactory Efactory = new EduLitFactory();
    Accountant accountant = new Accountant();
    FicLitBuilder RuBuilder = new RuFicLitBuilder();
    FicLitBuilder EnBuilder = new EnFicLitBuilder();

    public void generateBooks() {
        this.list = setBookList();
    }

    public Literature randomBook(ArrayList<Integer> randomNumbers, int i) {
        return list.get(randomNumbers.get(i));
    }

    public ArrayList<Literature> setBookList() {
        ArrayList<Literature> list = new ArrayList<>();
        System.out.println("dlina " + En.size());

        for (int i = 0; i < RuDisciplines.size(); i++) {
            for (int j = 0; j < types.length; j++) {
                list.add(Efactory.createBook("Учебник", RuDisciplines.get(i)[0], "русский", types[j]));
            }
        }
        for (int i = 0; i < EnDisciplines.length; i++) {
            for (int j = 0; j < levels.length; j++) {
                list.add(Efactory.createBook("Учебник", EnDisciplines[i], "english", levels[j],
                        authors[i], universities[i]));
            }
        }
        accountant.setBuilder(RuBuilder);
        for (String returnRuFicList : RuFicList) {
            accountant.constructBook(returnRuFicList);
            list.add(accountant.getBook());
        }
        accountant.setBuilder(EnBuilder);
        for (String returnEnFicList : EnFicList) {
            accountant.constructBook(returnEnFicList);
            list.add(accountant.getBook());
        }
        System.out.println(list.size());
        return list;
    }

    public ArrayList<Integer> setRandomList(int a) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();
        while (numbers.size() < 10) {

            int random = r.nextInt(a);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
        return numbers;
    }

    public String[] setList(ArrayList<String[]> En, String which) {
        String[] list = new String[En.size()];
        switch (which) {
            case "disciplines" -> {
                for (int i = 0; i < En.size(); i++) {
                    list[i] = En.get(i)[0];
                }
                return list;
            }
            case "authors" -> {
                for (int i = 0; i < En.size(); i++) {
                    list[i] = En.get(i)[1];
                }
                return list;
            }
            case "universities" -> {
                for (int i = 0; i < En.size(); i++) {
                    list[i] = En.get(i)[2];
                }
                return list;
            }
            default -> {
                return null;
            }
        }
    }

}
