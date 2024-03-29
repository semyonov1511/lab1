package Rooms;

import Humens.*;
import java.util.ArrayList;

public class Library {

    ArrayList<String[]> names = CsvFileReader.readCsv("names1.csv");
    ArrayList<String[]> surnames1 = CsvFileReader.readCsv("surnames.csv");
    ArrayList<String[]> surnames2 = CsvFileReader.readCsv("surnames2.csv");
    ArrayList<String[]> midnamesF = CsvFileReader.readCsv("midnamesF.csv");
    ArrayList<String[]> midnamesM = CsvFileReader.readCsv("midnamesM.csv");
    
    private static Library INSTANCE;
    
    public static Library getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Library();
        }
        return INSTANCE;
    }

    public Person randomUser() {
        int a = (int) (Math.random() * 2);
        PersonFactory Pfactory = new PersonFactory();
        switch (a) {
            case 0 -> {
                return Pfactory.createPerson("Student");
            }
            case 1 -> {
                return Pfactory.createPerson("Teacher");
            }
            default -> {
                return null;
            }
        }
    }

    public ArrayList<String[]> returnNames() {
        return this.names;
    }

    public ArrayList<String[]> returnSurnames() {
        return this.surnames1;
    }

    public ArrayList<String[]> returnSurnames(boolean a) {
        return this.surnames2;
    }

    public ArrayList<String[]> returnMidnamesM() {
        return this.midnamesM;
    }

    public ArrayList<String[]> returnMidnamesF() {
        return this.midnamesF;
    }
}
