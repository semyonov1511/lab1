
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
    public void generatePeople(){
        this.names = setNames();
        this.surnames = setSurnames();
        for (int i = 0; i < 30; i++) {
                //System.out.println(names.get(i));
                //System.out.println(surnames.get(i));
        }
    }
    
    public ArrayList<String> returnNames(){
        return this.names;
    }
    public ArrayList<String> returnSurnames(){
        return this.surnames;
    }
    public static ArrayList<String> setNames(){
        int b = 0;
        ArrayList<String> names = new ArrayList<String>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream("G:\\Документы\\names1.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i < 30; i++) {
                lines[i] = lines[i].substring(0, lines[i].length() - 1);
                names.add(lines[i]);
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
        return names;
    }
    
    public static ArrayList<String> setSurnames(){
        int b = 0;
        ArrayList<String> surnames = new ArrayList<String>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
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
