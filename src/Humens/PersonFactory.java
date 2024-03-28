package Humens;

import Rooms.Library;

public class PersonFactory {
    public Person createPerson(String which) {
        Library library = new Library();
        int i = (int) (Math.random() * 30);
        switch (which) {
            case "Student" -> {
                if (i >= 20) {
                    return new Student(library.returnNames().get(i)[0], library.returnSurnames().get((int) (Math.random() * 60))[0] + "à");
                } else {
                    return new Student(library.returnNames().get(i)[0], library.returnSurnames().get((int) (Math.random() * 60))[0]);
                }
            }
            case "Teacher" -> {
                if (i >= 20) {
                    return new Teacher(library.returnNames().get(i)[0],
                            library.returnSurnames(true).get((int) (Math.random() * 14))[0] + "à",
                            library.returnMidnamesF().get((int) (Math.random() * 20))[0]);
                } else {
                    return new Teacher(library.returnNames().get(i)[0],
                            library.returnSurnames(true).get((int) (Math.random() * 14))[0],
                            library.returnMidnamesM().get((int) (Math.random() * 20))[0]);
                }
            }
            default -> {
                return null;
            }
        }

    }
}
