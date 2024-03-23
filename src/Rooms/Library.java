
package Rooms;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library { 
    ArrayList<String> names;
    ArrayList<String> surnames;
    ArrayList<String> RuDisciplines;
    ArrayList<String> EnDisciplines;
    String[] types = {"Учебник", "Пособие", "Задачник"};
    String[] levels = {"Бакалавриат", "Магистратура","Аспирантура"};
    
    public void generateRuBooks(){
        this.RuDisciplines = setRuDisciplines();
    }
    public void generateEnBooks(){
        this.EnDisciplines = setEnDisciplines();
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
    
    public String[] returnTypes(){
        return this.types;
    }
    
    public String[] returnLevels(){
        return this.levels;
    }
    
    public ArrayList<String> returnRuDisciplines(){
        return this.RuDisciplines;
    }
    
    public ArrayList<String> returnEnDisciplines(){
        return this.EnDisciplines;
    }
    
    public static ArrayList<String> setRuDisciplines(){
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
                lines[i] = lines[i].substring(0, lines[i].length()-6);
                RuDisciplines.add(lines[i]);
            }
            lines[10] = lines[10].substring(0, lines[10].length()-6);
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
    
    public static ArrayList<String> setEnDisciplines(){
        ArrayList<String> EnDisciplines = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\EnDisciplines.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i < 10; i++) {
                lines[i] = lines[i].substring(0, lines[i].length()-1);
                EnDisciplines.add(lines[i]);
            }
            lines[10] = lines[10].substring(0, lines[10].length()-1);
            EnDisciplines.add(lines[9]);
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
