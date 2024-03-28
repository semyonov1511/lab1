package Rooms;

import Humens.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Library {

    ArrayList<String[]> names = CsvFileReader.readCsv("names1.csv");
    ArrayList<String[]> surnames1 = CsvFileReader.readCsv("surnames.csv");
    ArrayList<String[]> surnames2 = CsvFileReader.readCsv("surnames2.csv");
    ArrayList<String[]> midnamesF = CsvFileReader.readCsv("midnamesF.csv");
    ArrayList<String[]> midnamesM = CsvFileReader.readCsv("midnamesM.csv");

    public Person randomUser() {
        PersonFactory Pfactory = new PersonFactory();
        int a = (int) (Math.random() * 2);
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
