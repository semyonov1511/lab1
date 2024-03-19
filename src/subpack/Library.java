
package subpack;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Library {
    public static void generatePeople(){
        int b = 0;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream("G:\\Документы\\names.csv");
            int length = fis.available();
            byte[] data = new byte[length];
            fis.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            String[] splits = null;
            for (int i = 0; i < 2; i++) {
                splits = lines[i].split(" ");
                System.out.println(lines[i]);
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
    }
}
