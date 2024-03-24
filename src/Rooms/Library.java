
package Rooms;

import Humens.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Library { 
    ArrayList<String> names;
    ArrayList<String> surnames;
    PersonFactory Pfactory = new PersonFactory();
    
    public Person randomUser(){
        int i = (int) (Math.random() * 30);
        if (i >= 20) {
            return Pfactory.createPerson(returnNames().get(i),
                    returnSurnames().get((int) (Math.random() * 30))+"а");
        } else {
            return Pfactory.createPerson(returnNames().get(i),
                    returnSurnames().get((int) (Math.random() * 30)));
        }
    }
    public void generatePeople(){
        this.names = setNames();
        this.surnames = setSurnames();
    }
    
    public ArrayList<String> returnNames(){
        return this.names;
    }
    
    public ArrayList<String> returnSurnames(){
        return this.surnames;
    }

    public static ArrayList<String> setNames(){
        ArrayList<String> names = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\names1.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i < 29; i++) {
                lines[i] = lines[i].substring(0, lines[i].length() - 1);
                names.add(lines[i]);
            }
            names.add(lines[29]);
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
        return names;
    }
    
    public static ArrayList<String> setSurnames(){
        ArrayList<String> surnames = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\surnames.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i < 29; i++) {
                lines[i] = lines[i].substring(0, lines[i].length() - 1);
                surnames.add(lines[i]);
            }
            surnames.add(lines[29]);
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
        return surnames;
    }
     
}
