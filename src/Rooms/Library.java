package Rooms;

import Humens.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Library {

    ArrayList<String> names;
    ArrayList<String> surnames;
    ArrayList<String> midnamesF;
    ArrayList<String> midnamesM;
    PersonFactory Pfactory = new PersonFactory();

    public Person randomUser() {
        int i = (int) (Math.random() * 30);
        int a = (int) (Math.random() * 2);
        switch (a) {
            case 0 -> {
                if (i >= 20) {
                    return Pfactory.createPerson(returnNames().get(i),
                            returnSurnames().get((int) (Math.random() * 30)) + "а");
                } else {
                    return Pfactory.createPerson(returnNames().get(i),
                            returnSurnames().get((int) (Math.random() * 30)));
                }
            }
            case 1 -> {
                if (i >= 20) {
                    return Pfactory.createPerson(returnNames().get(i),
                            returnSurnames().get((int) (Math.random() * 30)) + "а", returnMidnamesF().get((int) (Math.random() * 20)));
                } else {
                    return Pfactory.createPerson(returnNames().get(i),
                            returnSurnames().get((int) (Math.random() * 30)), returnMidnamesM().get((int) (Math.random() * 20)));
                }
            }
            default -> {
                return null;
            }
        }
    }

    public void generatePeople() {
        this.names = setNames();
        this.surnames = setSurnames();
        this.midnamesM = setMidnames();
        this.midnamesF = setMidnames(true);
    }

    public ArrayList<String> returnNames() {
        return this.names;
    }

    public ArrayList<String> returnSurnames() {
        return this.surnames;
    }

    public ArrayList<String> returnMidnamesM() {
        return this.midnamesM;
    }

    public ArrayList<String> returnMidnamesF() {
        return this.midnamesF;
    }

    public static ArrayList<String> setNames() {
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

    public static ArrayList<String> setSurnames() {
        ArrayList<String> surnames = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\surnames.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i <= 29; i++) {
                lines[i] = lines[i].substring(0, lines[i].length() - 1);
                surnames.add(lines[i]);
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
        return surnames;
    }

    public static ArrayList<String> setMidnames() {
        ArrayList<String> midnames = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\names1.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i <= 19; i++) {
                lines[i + 30] = lines[i + 30].substring(0, lines[i + 30].length() - 1);
                midnames.add(lines[i + 30]);
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
        return midnames;
    }

    public static ArrayList<String> setMidnames(boolean a) {
        ArrayList<String> midnames = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("G:\\Документы\\names1.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (int i = 0; i < 19; i++) {
                lines[i + 50] = lines[i + 50].substring(0, lines[i + 50].length() - 1);
                midnames.add(lines[i + 50]);
            }
            midnames.add(lines[69]);
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
        return midnames;
    }

}
