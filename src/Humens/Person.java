package Humens;

import Rooms.Archive;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import subpack.Literature;

public abstract class Person {

    public String firstName;
    public String lastName;
    ArrayList<Literature> listOfBooks;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setlistOfBooks(){
        int a = (int) (Math.random() * 8) + 3;
        ArrayList<Integer> randomNumbers = Archive.getInstance().setRandomList(86);
        Literature book;
        for (int i = 0; i < a; i++) {
            book = Archive.getInstance().randomBook(randomNumbers, i);
            this.listOfBooks.add(book);
        }
    }
    
    public ArrayList<Literature> getlistOfBooks(){
        return this.listOfBooks;
    }
    public Literature getBook(int i){
        return this.listOfBooks.get(i);
    }
    public abstract String getFullName();
}
